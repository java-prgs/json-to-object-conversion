package com.jto.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jto.model.Employee;

public class JTOConversionTest {
	public static void main(String[] args) throws IOException {
		byte[] jsonData = Files.readAllBytes(Paths.get("E:\\learning-center\\jse\\employee.txt"));
		ObjectMapper objectMapper = new ObjectMapper();

		Employee employee = objectMapper.readValue(jsonData, Employee.class);

		System.out.println("Employee Object\n" + employee);

	}

}
