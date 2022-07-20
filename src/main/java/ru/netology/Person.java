package ru.netology;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean matches (String query){
//        if (name.contains(query)){
//            return true;
//        } else {
//            return false;
//        }
        //Замена всего кода в методе
        return name.contains(query);
    }

    public void happyBirthday(){
        age++;

    }
}
