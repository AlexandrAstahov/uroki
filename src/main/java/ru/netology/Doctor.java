package ru.netology;

public class Doctor extends Person {
    private String medicineType;

    public Doctor(String name, int age, String medicineType) {
        super(name, age);
        this.medicineType = medicineType;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)){
            return true;
        }
        if (medicineType.contains(query)){
            return true;
        }
        return false;
    }
}
