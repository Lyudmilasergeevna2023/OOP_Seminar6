import java.util.ArrayList;

import ISP.Circle;
import ISP.Cube;
import OCP.Bus;
import OCP.Car;
import OCP.SpeedCalculation;

import java.sql.Date;



import SRP.Accounting;
import SRP.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----- Single Responsibility Principle -----");
        Accounting ac = new Accounting(new ArrayList<>());
        Employee emp1 = new Employee("Иванов", new Date(1990), 100000);
        Employee emp2 = new Employee("Васильев", new Date(1985), 150000);
        Employee emp3 = new Employee("Дмитриев", new Date(1995), 120000);

        System.out.println(String.format("Заработная плата Иванова = %s", ac.calculateNetSalary(emp1)));
        System.out.println(String.format("Заработная плата Васильева = %s", ac.calculateNetSalary(emp2)));
        System.out.println(String.format("Заработная плата Дмитриева = %s", ac.calculateNetSalary(emp3)));
        System.out.println("_____________________________\n");



        System.out.println("----- Open-Closed Principle -----");
        Car car = new Car(120, "легковой автомобиль");
        Bus bus = new Bus(100, "маршрутный автобус");
        SpeedCalculation calcSpeed = new SpeedCalculation();
        
        System.out.println(String.format("Допустимая скорость легкового автомобиля %s", calcSpeed.calculateAllowedSpeed(car)));
        System.out.println(String.format(
            "Допустимая скорость маршрутного автобуса %s", calcSpeed.calculateAllowedSpeed(bus)));
        
        System.out.println("______________________________\n");



        System.out.println("----- Interface Segregation Principle -----");

        Cube cube = new Cube(7);
        Circle circle = new Circle(5);
        System.out.println(String.format("Площадь куба = %s", cube.area()));
        System.out.println(String.format("Объем куба = %s", cube.volume()));
        System.out.println(String.format("Площадь круга = %s", circle.area()));
        
        System.out.println("______________________________\n");



    }
}
