package ru.gb.vending_machine.family_tree;

import java.util.HashMap;
import java.util.Map;

class FamilyTree {
    private Map<String, Person> people;

    public FamilyTree() {
        this.people = new HashMap<>();
    }

    public void addPerson(Person person) {
        people.put(person.getName(), person);
    }

    public Person findPersonByName(String name) {
        return people.get(name);
    }

    public Map<String, Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person person : people.values()) {
            sb.append(person.toString()).append("\n");
        }
        return sb.toString();
    }
}
