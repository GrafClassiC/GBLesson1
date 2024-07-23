package ru.gb.vending_machine.family_tree;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenealogyTree tree = new GenealogyTree();

        Person john = new Person("John", Gender.MALE, LocalDate.of(1980, 1, 1));
        Person jane = new Person("Jane", Gender.FEMALE, LocalDate.of(1982, 3, 15));
        Person alice = new Person("Alice", Gender.FEMALE, LocalDate.of(2010, 5, 20));

        john.addChild(alice);
        jane.addChild(alice);

        tree.addPerson(john);
        tree.addPerson(jane);
        tree.addPerson(alice);

        List<Person> aliceChildren = tree.getChildrenOf(alice); // Пустой список
        List<Person> johnChildren = tree.getChildrenOf(john); // Содержит Alice
        List<Person> janeChildren = tree.getChildrenOf(jane); // Содержит Alice
    }
}

enum Gender {
    MALE, FEMALE
}