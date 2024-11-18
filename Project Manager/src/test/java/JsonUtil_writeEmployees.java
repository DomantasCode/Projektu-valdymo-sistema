import java.util.ArrayList;
import java.util.LinkedList;

import model.Employee;
import util.JsonUtil;

public class JsonUtil_writeEmployees {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<Employee>();
        Employee employee = new Employee();
        employee.setId(0);
        employee.setName("name");
        employee.setPosition("programeris");
        employee.setProjectIds(new ArrayList<Integer>());
        employeeList.add(employee);

        JsonUtil.writeEmployees(employeeList);
    }
}
