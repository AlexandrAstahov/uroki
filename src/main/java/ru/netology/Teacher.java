package ru.netology;

public class Teacher extends Person {
    private String topic;

    public Teacher(String name, int age, String topic) {
        super(name, age);
        this.topic = topic;
    }

    public void teach (String studentName){
        System.out.println("Я учу студента " + studentName);
    }

    @Override
    public void happyBirthday(){
        System.out.println("Пойду почитаю книжку и потом отмечу");
        age++;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)){
            return true;
        }
        if (topic.contains(query)){
            return true;
        }
        return false;
        }
    }

