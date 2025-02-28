package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract non-sealed class Aquatic extends Animal {

    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(this == o)
            return true;
        if(!this.getClass().equals(o.getClass()))
            return false;
        final Aquatic other = (Aquatic) o;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && habitat.equals(other.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    @Override
    public String toString() {
        return super.toString() + " " + habitat;
    }
}
