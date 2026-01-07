import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Pet> petsList = new ArrayList<>();
    private static ArrayList<Owner> ownersList = new ArrayList<>();
    private static ArrayList<Vet> vetsList = new ArrayList<>();
    private static ArrayList<Person> people = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ownersList.add(new Owner("Влад", "87001234567", 1, "Astana"));
        petsList.add(new Pet("Шарик", "Dog", 3, "Влад"));
        vetsList.add(new Vet("Максим", 2, "HappyPets", 30));

        people.add(ownersList.get(0));
        people.add(vetsList.get(0));

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addPet();
                case 2 -> viewAllPets();
                case 3 -> addOwner();
                case 4 -> viewAllOwners();
                case 5 -> addVet();
                case 6 -> viewAllVets();
                case 7 -> demonstratePolymorphism();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice!");
            }

            if (running) scanner.nextLine();
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
        System.out.println("7. Demonstrate Polymorphism");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addPet() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Owner: ");
        String owner = scanner.nextLine();
        petsList.add(new Pet(name, type, age, owner));
    }

    private static void addOwner() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Pets: ");
        int pets = scanner.nextInt();
        scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        Owner o = new Owner(name, phone, pets, city);
        ownersList.add(o);
        people.add(o);
    }

    private static void addVet() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Experience: ");
        int exp = scanner.nextInt();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Clinic: ");
        String clinic = scanner.nextLine();
        Vet v = new Vet(name, exp, clinic, age);
        vetsList.add(v);
        people.add(v);
    }

    private static void viewAllPets() {
        for (Pet p : petsList) System.out.println(p);
    }

    private static void viewAllOwners() {
        for (Owner o : ownersList) System.out.println(o);
    }

    private static void viewAllVets() {
        for (Vet v : vetsList) System.out.println(v);
    }

    private static void demonstratePolymorphism() {
        for (Person p : people) {
            p.showInfo();

            if (p instanceof Owner) {
                System.out.println("-> This is Owner");
            }
            if (p instanceof Vet) {
                System.out.println("-> This is Vet");
            }
            System.out.println();
        }
    }
}
