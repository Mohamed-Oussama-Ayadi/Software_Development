package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class MainProg {
    public static void main(String[] args) {
        // Instruction 5
        // Lion
        Animal lion = new Animal();
        lion.setFamily("Lion");
        lion.setName("Simba");
        lion.setAge(3);
        lion.setMammal(true);
        // tn.esprit.gestionzoo.entities.Zoo
        Zoo myZoo = new Zoo();
        myZoo.setName("My tn.esprit.gestionzoo.entities.Zoo");
        myZoo.setCity("New York");
        myZoo.setAnimals(new Animal[25]);
        // Instruction 7
        // Animaux
        Animal tiger = new Animal("Tiger", "Tigre", 4, true);
        Animal girafe = new Animal("Girafe", "Girafe", 2, false);
        // Instruction 8
        // Affichage tn.esprit.gestionzoo.entities.Zoo
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        // Instruction 10
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(girafe));
        // Instruction 11
        System.out.println(myZoo.searchAnimal(lion));
        // Instruction 21
        Aquatic aquatic = new Aquatic("Lion", "Simba", 3, true, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Lion", "Simba", 3, true, 4);
        Dolphin dolphin = new Dolphin("Lion", "Simba", 3, true, "Ocean", 0.5f);
        Penguin penguin = new Penguin("Lion", "Simba", 3, true, "Ocean", 0.5f);
        // Instruction 24
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
    }
}
