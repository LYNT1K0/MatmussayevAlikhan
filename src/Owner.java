public class Owner {
    private String name;
    private String phone;
    private int pets;
    private String city;

    public Owner(String name, String phone, int pets, String city){
        this.name = name;
        this.phone = phone;
        this.pets = pets;
        this.city = city;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getPets(){
        return pets;
    }

    public void setPets(int pets){
        this.pets = pets;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void addPet() {
        pets = pets + 1;
    }

    public boolean hasPets() {
        return pets > 0;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}