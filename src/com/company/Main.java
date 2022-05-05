package com.company;
public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
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
            System.out.println(employee[i] + " ");
        }
        System.out.println();

        float sumInMonth = 0;
        for (int i = 0; i < employee.length; i++) {
                sumInMonth = sumInMonth + employee[i].getSalary();
            }
        System.out.println("В месяц на зарплаты сотрудникам тратится " + sumInMonth + " рублей");

        System.out.println();

        int minSalary = 0;
        float min = employee[0].getSalary();
        float max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min)
            min = employee[i].getSalary();
            if (employee[i].getSalary() > max)
            max = employee[i].getSalary();
        }
        System.out.println("Минимальная зарплата сотрудника в компании: " + min);
        System.out.println("Максимальная зарплата сотрудника в компании: " + max);

        System.out.println();

        float middleSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            middleSalary = sumInMonth / employee.length;
        }
        System.out.println("Среднее значение зарплат в компании: " + middleSalary);

        System.out.println();

        String fullName;
        for (int i = 0; i < employee.length; i++) {
            fullName = employee[i].getFullName();
            System.out.println(fullName);
        }
    }

}
