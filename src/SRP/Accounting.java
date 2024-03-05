package SRP;

import java.util.List;

/**
 * Класс, содержащий функционал по начислению бухгалтерией заработной платы сотрудникам 
 */


public class Accounting {
    private List<Employee> employeeList;

    public Accounting(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    /**
     * Вычисление выплачиваемой заработной платы сотруднику
     * @param employee - объект сотрудник
     * @return размер заработной платы после вычета налога
     */
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);
        return employee.getBaseSalary() - tax;
    }


    
}
