package tn.esprit.gestionzoo.entities;

public class Zoo {

    private String name;
    private String city;
    // Instruction 14
    private final int nbrCages = 25;
    private Animal[] animals;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private  int nbrAquaticAnimals;
    private final int maxAquaticAnimals = 10;

    // Instruction 7
    public Zoo(){

    }

    // Instruction 6
    public Zoo(String name, String city){
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[maxAquaticAnimals];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank())
            System.out.println("Name cannot be blank");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo: " + name + ", " + city + ", " + nbrCages);
    }

    // Instruction 10
    public boolean addAnimal(Animal animal){
        if(!isZooFull() && searchAnimal(animal) == -1){// Instruction 12
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    // Instruction 13
    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index != -1){
            for (int i = index; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrAnimals - 1] = null;
            nbrAnimals--;
            return true;
        } else {
            return false;
        }
    }

    // Instruction 8
    public void displayAnimals(){
        for(int i = 0; i < nbrAnimals; i++){
            System.out.println(animals[i]);
        }
    }

    // Instruction 11
    public int searchAnimal(Animal animal){
        for(int i = 0; i < nbrAnimals; i++){
            if(animals[i].equals(animal)){
                return i;
            }
        }
        return -1;
    }

    // Instruction 15
    public boolean isZooFull(){
        return nbrAnimals >= nbrCages;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if(nbrAquaticAnimals < maxAquaticAnimals){
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth = 0;
        for(int i = 0; i < nbrAquaticAnimals; i++){
            if(aquaticAnimals[i] instanceof Penguin){
                if(((Penguin) aquaticAnimals[i]).getSwimmingDepth() > maxDepth)
                    maxDepth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrPenguins = 0, nbrDolphins = 0;
        for(int i = 0; i < nbrAquaticAnimals; i++){
            if(aquaticAnimals[i] instanceof Penguin)
                nbrPenguins++;
            if(aquaticAnimals[i] instanceof Dolphin)
                nbrDolphins++;
        }
        System.out.println("Penguins: " + nbrPenguins);
        System.out.println("Dolphins: " + nbrDolphins);
    }

    // Instruction 16
    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2){
        if(zoo1.nbrAnimals > zoo2.nbrAnimals)
            return zoo1;
        else
            return zoo2;
    }

    // Instruction 9
    public String toString(){
        return "Zoo: " + name + ", " + city + ", " + nbrCages;
    }
}
