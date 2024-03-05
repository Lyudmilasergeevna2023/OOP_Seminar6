package SRP;
import java.sql.Date;


//Переписать код в соответствии с Single Responsibility Principle:
//Подсказка: вынесите метод calculateNetSalary() в отдельный класс

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
    this.name = name;
    this.dob = dob;
    this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
    }
    

    /**
     * Метод для получения базовой заработной платы
     *  @return базовая заработная плата сотрудника
     */
    public int getBaseSalary() {
        return baseSalary;
    }

}