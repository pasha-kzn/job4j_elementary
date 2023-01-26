package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Вася Пупкин");
        student.setGroup(1106);
        student.setDate(new Date());
        System.out.println("Студент " + student.getName() + " учится в группе " + student.getGroup() + " c " + student.getDate());
    }
}
