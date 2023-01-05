package org.example.solid.single_respondibility.employee_architecture;

public class ClientModel {


    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ivan", "grace", true);
        ClientModel.hireNewEmployee(e1);
        printEmployeeReport(e1, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormatterEmployee());
    }
}
