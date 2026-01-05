public class Vet {
    private String name;
    private int experience;
    private String clinic;
    private int age;

    public Vet(String name,int experience, String clinic, int age) {
        this.name = name;
        this.experience = experience;
        this.clinic = clinic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work() {
        experience = experience + 1;
    }

    public boolean isExperienced() {
        return experience >= 3;
    }

    public void age() {
        age = age + 1;
    }

    public int isAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Vet{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", clinic='" + clinic + '\'' +
                ", age=" + age +
                '}';
    }
}