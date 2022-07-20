package ru.netology;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Maykl", 21, "Math");
        Doctor doctor = new Doctor("Oleg", 45, "Hirurg");

        System.out.println(teacher.matches("th"));
        System.out.println(doctor.matches("th"));
    }
}
