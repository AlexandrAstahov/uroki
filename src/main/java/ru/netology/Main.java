package ru.netology;

public class Main {

    public static void main(String[] args) {

        PersonsManager manager = new PersonsManager();
        manager.add(new Teacher("Alex", 37, "Math"));
        manager.add(new Doctor("Anyat", 27, "Eyes"));
        manager.add(new Teacher("Olya", 57, "Geology"));

        Person [] result = manager.findByQuery("at");

        /*Teacher teacher = new Teacher("Maykl", 21, "Math");
        Doctor doctor = new Doctor("Oleg", 45, "Hirurg");

        System.out.println(teacher.matches("th"));
        System.out.println(doctor.matches("th"));*/


    }
}
