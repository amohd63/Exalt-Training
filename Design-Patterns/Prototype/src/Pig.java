import java.util.Objects;

public class Pig implements Animal {
    private String name;
    private int age;

    public Pig(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Animal makeCopy() {
        return new Pig(
                this.name, this.age
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pig pig = (Pig) o;
        return age == pig.age && Objects.equals(name, pig.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
