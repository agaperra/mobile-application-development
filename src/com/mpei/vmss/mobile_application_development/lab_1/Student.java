package com.mpei.vmss.mobile_application_development.lab_1;

public class Student {

    // поля класса
    private String fullName = null;
    private String course = null;
    private String subject = null;
    private String university = null;
    private String email = null;
    private String phoneNumber = null;

    public Student() {
    } // пустой конструктор, все параметры будут равны null

    // конструктор с именем, почтой и телефоном
    public Student(String fullName, String email, String phoneNumber) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // конструктор с именем студента
    public Student(String fullName) {
        this.fullName = fullName;
    }

    // полный конструктор
    public Student(String fullName, String course, String subject, String university, String email, String phoneNumber) {
        this.fullName = fullName;
        this.course = course;
        this.subject = subject;
        this.university = university;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // функция вывода на консоль
    public String toString() {
        return "Студент: " +
                getFullName() +
                "\n Курс:" +
                getCourse() +
                "\n Предмет:" +
                getSubject() +
                "\n Институт:" +
                getUniversity() +
                "\n Почта:" +
                getEmail() +
                "\n Номер телефона:" +
                getPhoneNumber();
    }

    // автоматически созданные геттеры и сеттеры для полей

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
