package com.company;
public class Main {
    private static Employee[] employee = new Employee[10];{
    }
    private static void printEmployee (Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
    private static float sumInMonths () {
        float sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }
    private static float findMinSalary () {
        float min = 0;
        min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++)
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
        System.out.println("Минимальная зарплата сотрудника в компании: " + min);
        return min;
    }
    private static float findMaxSalary() {
        float max = 0;
        max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++)
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
        System.out.println("Максимальная зарплата сотрудника в компании: " + max);
        return max;
    }
    private static float findMiddleSalary () {
        float sum = sumInMonths();
        float middle = sumInMonths() / employee.length;
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        System.out.println();
        System.out.println("Среднее значение зарплат в компании: " + middle);
        return middle;
    }
    private static String fullName () {
        String fullName = null;
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

        printEmployee(employee);
        System.out.println();
        findMinSalary();
        System.out.println();
        findMaxSalary();
        System.out.println();
        findMiddleSalary();
        System.out.println();
        fullName();
    }
}






