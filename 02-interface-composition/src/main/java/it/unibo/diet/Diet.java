package it.unibo.diet;

/**
 * A [Diet] defines what kind of food can be eaten.
 */
public interface Diet {

    /**
     * @return true if this [Diet] allows to eat meat, false otherwise.
     */
    boolean canEatMeat();

    /**
     * @return true if this [Diet] allows to eat vegetables, false otherwise.
     */
    boolean canEatVegetables();
}

