public class Owner extends Person {
    private String phone;
    private int pets;
    private String city;

    public Owner(String name, String phone, int pets, String city) {
        super(name, 0);
        this.phone = phone;
        this.pets = pets;
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.matches("\\d{10,12}"))
            this.phone = phone;
    }

    public int getPets() {
        return pets;
    }

    public void setPets(int pets) {
        if (pets >= 0)
            this.pets = pets;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.trim().isEmpty())
            this.city = city;
    }

    public boolean hasPets() {
        return pets > 0;
    }

    @Override
    public void showInfo() {
        System.out.println("Owner: " + name +
                ", Pets: " + pets +
                ", Phone: " + phone +
                ", City: " + city);
    }

    @Override
    public String toString() {
        return "Owner{name='" + name + "', pets=" + pets +
                ", phone='" + phone + "', city='" + city + "'}";
    }
}