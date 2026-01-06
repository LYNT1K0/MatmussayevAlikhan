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
        if(name != null && !name.trim().isEmpty()) this.name = name;
        else System.out.println("Invalid vet name!");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if(experience >= 0) this.experience = experience;
        else System.out.println("Experience cannot be negative!");
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        if(clinic != null && !clinic.trim().isEmpty()) this.clinic = clinic;
        else System.out.println("Invalid clinic!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18) this.age = age;
        else System.out.println("Vet must be at least 18!");
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