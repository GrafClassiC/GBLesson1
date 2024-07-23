import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private List<Person> parents;
    private List<Person> children;

    public Person(String name, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void addParent(Person parent) {
        this.parents.add(parent);
        parent.children.add(this);
    }

    public void addChild(Person child) {
        this.children.add(child);
        child.parents.add(this);
    }

    public List<Person> getChildren() {
        return this.children;
    }

   
}
