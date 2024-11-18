import java.util.LinkedList;

import model.Employee;
import util.JsonUtil;

public class JsonUtil_readEmployees {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = JsonUtil.readEmployees();
        System.out.println(employeeList.toString());
    }
}
