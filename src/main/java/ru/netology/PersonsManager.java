package ru.netology;

public class PersonsManager {
    private Person[] people = new Person[0];

    public void add(Person person) {
        Person[] tmp = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            tmp[i] = people[i];
        }
        tmp[tmp.length - 1] = person;
        people = tmp;
    }

    public Person[] findByQuery(String query) {
        Person[] result = new Person[0];

        for (Person person : people) {
            if (person.matches(query)) {
                Person[] tmp = new Person[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = person;
                result = tmp;
            }
        }
        return result;
    }

}
