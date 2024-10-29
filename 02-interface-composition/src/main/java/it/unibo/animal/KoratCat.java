package it.unibo.animal;


import it.unibo.diet.Carnivore;
import it.unibo.diet.Diet;

public class KoratCat implements Animal {

    private final Diet diet;

    public KoratCat() {
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
        return 3.6;
    }
}