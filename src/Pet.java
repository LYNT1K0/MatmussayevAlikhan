public class Pet {
    private String name;
    private String type;
    private int age;
    private String owner;

    public Pet(String name, String type, int age, String owner) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty())
            this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.trim().isEmpty())
            this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null && !owner.trim().isEmpty())
            this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name +
                "', type='" + type +
                "', age=" + age +
                ", owner='" + owner + "'}";
    }
}
