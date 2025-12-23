public class Main {
    public static void main(String[] args) {

        System.out.println("=== Vet Clinic ===");

        Pet pet = new Pet("Шарик", "Dog", 3, "Влад");
        Owner owner = new Owner("Влад", "87001234567", 1, "Astana");
        Vet vet = new Vet("Максим", 2, "HappyPets", 30);

        System.out.println(pet);
        System.out.println(owner);
        System.out.println(vet);

        pet.grow();
        owner.addPet();
        vet.work();

        System.out.println("\nAfter changes:");
        System.out.println(pet);
        System.out.println(owner);
        System.out.println(vet);

        System.out.println("Pet old: " + pet.isOld());
        System.out.println("Owner has pets: " + owner.hasPets());
        System.out.println("Vet experienced: " + vet.isExperienced());
    }
}
