package it.unibo.animal;

import it.unibo.diet.Diet;
import it.unibo.diet.Herbivore;

public class Kangaroo implements Animal {

    private final Diet diet;

    public Kangaroo() {
        diet = new Herbivore();
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
        return 55.0;
    }
}
