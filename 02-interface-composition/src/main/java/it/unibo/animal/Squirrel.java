package it.unibo.animal;


import it.unibo.diet.Diet;
import it.unibo.diet.Omnivore;

public class Squirrel implements Animal {

    private final Diet diet;

    public Squirrel() {
        diet = new Omnivore();
    }

    @Override
    public boolean canEat(Animal animal) {
        return this.diet.canEatMeat() && (animal.averageWeight() < this.averageWeight());
    }

    @Override
    public boolean canEatVegetables() {
        return this.diet.canEatVegetables();
    }

    @Override
    public double averageWeight() {
        return 0.55;
    }
}
