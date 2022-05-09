package com.company;

public class Employee {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int department;
    private float salary;
    private int id;
    private static int counter;

    public Employee(String lastName, String firstName, String patronymic, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getLastName() {
        return this.firstName;
    }

    public String getFirstName() {
        return this.lastName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.counter;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getFullName() {
        return this.lastName + " " + this.firstName + " "+ this.patronymic;
    }
    @Override
    public String toString() {
        return "ФИО сотрудника: " +  getFullName() + ". Работает в отделе номер " + this.department + ". Получает " + this.salary + " рублей. ID сотрудника: " + this.id;
    }

}
