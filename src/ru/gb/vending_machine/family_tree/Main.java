package ru.gb.vending_machine.family_tree;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Person john = new Person("John", Person.MALE, LocalDate.of(1980, 1, 1));
        Person jane = new Person("Jane", Person.FEMALE, LocalDate.of(1982, 3, 15));
        Person alice = new Person("Alice", Person.FEMALE, LocalDate.of(2010, 5, 20));

        john.addChild(alice);
        jane.addChild(alice);

        tree.addPerson(john);
        tree.addPerson(jane);
        tree.addPerson(alice);

        List<Person> aliceChildren = tree.findPersonByName("Alice").getChildren();
        List<Person> johnChildren = tree.findPersonByName("John").getChildren();
        List<Person> janeChildren = tree.findPersonByName("Jane").getChildren();

        System.out.println(tree);
    }
}