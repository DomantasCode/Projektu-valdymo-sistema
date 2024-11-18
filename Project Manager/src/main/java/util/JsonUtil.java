package util;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Employee;

public class JsonUtil {

    private static final String EMPLOYEE_PATH = "src/main/resources/employees.json";
    private static final String PROJECT_PATH = "src/main/resources/projects.json";
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void writeEmployees(LinkedList<Employee> employees) {
        try {
            File outputFile = new File(EMPLOYEE_PATH);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, employees);
            System.out.println("JSON written to: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedList<Employee> readEmployees() {
        LinkedList<Employee> employees = new LinkedList<>();
        try {
            employees = objectMapper.readValue(new File(EMPLOYEE_PATH), new TypeReference<LinkedList<Employee>>() {
            });
        } catch (IOException e) {
            System.err.println("Error reading employees from file: " + e.getMessage());
        }

        return employees;
    }

}
