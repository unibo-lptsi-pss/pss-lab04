package it.unibo.animal;

import it.unibo.diet.Carnivore;
import it.unibo.diet.Diet;

public class SiameseCat implements Animal {

    private final Diet diet;

    public SiameseCat() {
        diet = new Carnivore();
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
        return 5.0;
    }
}