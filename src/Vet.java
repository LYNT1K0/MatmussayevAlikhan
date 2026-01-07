public class Vet extends Person {
    private int experience;
    private String clinic;

    public Vet(String name, int experience, String clinic, int age) {
        super(name, age);
        this.experience = experience;
        this.clinic = clinic;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience >= 0)
            this.experience = experience;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        if (clinic != null && !clinic.trim().isEmpty())
            this.clinic = clinic;
    }

    public boolean isExperienced() {
        return experience >= 3;
    }

    @Override
    public void showInfo() {
        System.out.println("Vet: " + name +
                ", Age: " + age +
                ", Experience: " + experience +
                ", Clinic: " + clinic);
    }

    @Override
    public String toString() {
        return "Vet{name='" + name + "', experience=" + experience +
                ", clinic='" + clinic + "', age=" + age + "}";
    }
}
