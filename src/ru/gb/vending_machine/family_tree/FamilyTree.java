package ru.gb.vending_machine.family_tree;


class GenealogyTree {
    private Person root;

    public void addPerson(Person person) {
        if (this.root == null) {
            this.root = person;
        } else {
       
        }
    }

    public List<Person> getChildrenOf(Person person) {
        return person.getChildren();
    }

}