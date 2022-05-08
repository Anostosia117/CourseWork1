package com.company;
public class Main {
    private static Employee[] employee = new Employee[10];{
        System.out.println(employee);
    }

    private static float sumInMonths(Employee[] employee, float sum) {
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);
        return sum;
    }
    private static float findMinSalary(Employee[] employees, float min) {
        min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        System.out.println("Минимальная зарплата сотрудника в компании: " + min);
        return min;
    }
    private static float findMaxSalary(Employee[] employees, float max) {
        max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        System.out.println("Максимальная зарплата сотрудника в компании: " + max);
        return max;
    }
    private static float findMiddleSalary(Employee[] employees, float middle, float sum) {
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        for (int i = 0; i < employee.length; i++) {
            middle = sum / employee.length;
        }
        System.out.println("Среднее значение зарплат в компании: " + middle);
        return middle;
    }
    private static String fullName (Employee[] employee, String fullName) {
        for (int i = 0; i < employee.length; i++) {
            fullName = employee[i].getFullName();
            System.out.println(fullName);
        }
        return fullName;
    }
    public static void main(String[] args) {

        employee[0] = new Employee("Иванова", "Ирина", "Михайловна", 1, 56000);
        employee[1] = new Employee("Харитонов", "Петр", "Геннадьевич", 1, 33000);
        employee[2] = new Employee("Шевцова", "Анна", "Вячеславовна", 4, 102000);
        employee[3] = new Employee("Дудник", "Даниил", "Станиславович", 2, 15000);
        employee[4] = new Employee("Стадник", "Анна", "Павловна", 2, 45600);
        employee[5] = new Employee("Щербаченко", "Наталья", "Витальевна", 3, 143874);
        employee[6] = new Employee("Ткачук", "Павел", "Денисович", 5, 42379);
        employee[7] = new Employee("Шамшура", "Анна", "Павловна", 3, 87123);
        employee[8] = new Employee("Холодова", "Анастасия", "Александровна", 1, 435211);
        employee[9] = new Employee("Толстой", "Лев", "Николаевич", 2, 44444);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        System.out.println();

        float sum = 0;
        sumInMonths(employee, sum);

        System.out.println();

        float min = 0;
        findMinSalary(employee, min);

        System.out.println();

        float max = 0;
        findMaxSalary(employee, max);

        System.out.println();

        float middle = 0;
        findMiddleSalary(employee, middle, sum);

        System.out.println();

        String fullName = null;
        fullName(employee, fullName);
    }
}






