import java.util.Objects;

public class Sheep implements Animal {
    private String name;
    private int age;

    public Sheep(String name, int age) {
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
        return new Sheep(
                this.name, this.age
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return age == sheep.age && Objects.equals(name, sheep.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
