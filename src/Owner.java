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
        if(name != null && !name.trim().isEmpty()) this.name = name;
        else System.out.println("Invalid name!");
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        if(phone != null && phone.matches("\\d{10,12}")) this.phone = phone;
        else System.out.println("Invalid phone!");
    }

    public int getPets(){
        return pets;
    }

    public void setPets(int pets){
        if(pets >= 0) this.pets = pets;
        else System.out.println("Pets cannot be negative!");
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        if(city != null && !city.trim().isEmpty()) this.city = city;
        else System.out.println("Invalid city!");
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