import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Pet> petsList = new ArrayList<>();
    private static ArrayList<Owner> ownersList = new ArrayList<>();
    private static ArrayList<Vet> vetsList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ownersList.add(new Owner("Влад", "87001234567", 1, "Astana"));
        petsList.add(new Pet("Шарик", "Dog", 3, "Влад"));
        vetsList.add(new Vet("Максим", 2, "HappyPets", 30));

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: addPet(); break;
                case 2: viewAllPets(); break;
                case 3: addOwner(); break;
                case 4: viewAllOwners(); break;
                case 5: addVet(); break;
                case 6: viewAllVets(); break;
                case 0: running = false; break;
                default: System.out.println("Invalid choice!");
            }
            if(running) { scanner.nextLine(); }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n=== VET CLINIC SYSTEM ===");
        System.out.println("1. Add Pet");
        System.out.println("2. View All Pets");
        System.out.println("3. Add Owner");
        System.out.println("4. View All Owners");
        System.out.println("5. Add Vet");
        System.out.println("6. View All Vets");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addPet() {
        System.out.print("Enter name: "); String name = scanner.nextLine();
        System.out.print("Enter type: "); String type = scanner.nextLine();
        System.out.print("Enter age: "); int age = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter owner name: "); String owner = scanner.nextLine();
        petsList.add(new Pet(name, type, age, owner));
        System.out.println("Pet added successfully!");
    }

    private static void addOwner() {
        System.out.print("Enter name: "); String name = scanner.nextLine();
        System.out.print("Enter phone: "); String phone = scanner.nextLine();
        System.out.print("Enter number of pets: "); int pets = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter city: "); String city = scanner.nextLine();
        ownersList.add(new Owner(name, phone, pets, city));
        System.out.println("Owner added successfully!");
    }

    private static void addVet() {
        System.out.print("Enter name: "); String name = scanner.nextLine();
        System.out.print("Enter experience: "); int exp = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter clinic: "); String clinic = scanner.nextLine();
        System.out.print("Enter age: "); int age = scanner.nextInt(); scanner.nextLine();
        vetsList.add(new Vet(name, exp, clinic, age));
        System.out.println("Vet added successfully!");
    }

    private static void viewAllPets() {
        if(petsList.isEmpty()) { System.out.println("No pets found."); return; }
        for(Pet p : petsList) { System.out.println(p); }
    }

    private static void viewAllOwners() {
        if(ownersList.isEmpty()) { System.out.println("No owners found."); return; }
        for(Owner o : ownersList) { System.out.println(o); }
    }

    private static void viewAllVets() {
        if(vetsList.isEmpty()) { System.out.println("No vets found."); return; }
        for(Vet v : vetsList) { System.out.println(v); }
    }
}
