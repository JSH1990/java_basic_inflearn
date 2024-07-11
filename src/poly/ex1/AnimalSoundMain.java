package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(),new Cat(),new Dog()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
//
//    private static void soundAnimal(Animal animal) {
//        animal.sound();
//    }
}
