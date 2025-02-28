package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Aquatic, Terrestrial {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Instruction 7
    public Animal(){

    }

    // Instruction 6
    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0)
            System.out.println("Age cannot be negative");
        else
            this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    // Instruction 9
    public String toString(){
        return "Animal: " + family + " " + name + " " + age + " " + isMammal;
    }
}
