package it.unibo;

import it.unibo.animal.*;

public class Test {
    public static void main(String[] args) {
        Animal squirrel = new Squirrel();
        Animal kangaroo = new Kangaroo();
        Animal siameseCat = new SiameseCat();
        Animal koratCat = new KoratCat();

        System.out.println("Kangaroo weight more than cats: " + (
            kangaroo.averageWeight() > siameseCat.averageWeight() &&
            kangaroo.averageWeight() > koratCat.averageWeight()
        ));
        System.out.println("Korat cat weight more than squirrel: " +
            (koratCat.averageWeight() > squirrel.averageWeight())
        );

        System.out.println("Kangaroo can't eat calico cat: " + !kangaroo.canEat(koratCat));
        System.out.println("Kangaroo can't eat siamese cat: " + !kangaroo.canEat(siameseCat));
        System.out.println("Kangaroo can eat vegetables: " + kangaroo.canEatVegetables());

        System.out.println("Squirrel can't eat calico cat: " + !squirrel.canEat(koratCat));
        System.out.println("Squirrel can't eat siamese cat: " + !squirrel.canEat(siameseCat));
        System.out.println("Squirrel can eat vegetables: " + squirrel.canEatVegetables());

        System.out.println("Siamese cat can eat squirrel: " + siameseCat.canEat(squirrel));
        System.out.println("Siamese cat can't eat kangaroo: " + !siameseCat.canEat(kangaroo));
        System.out.println("Siamese cat can't eat vegetables: " + !siameseCat.canEatVegetables());

        System.out.println("Korat cat can eat squirrel: " + koratCat.canEat(squirrel));
        System.out.println("Korat cat can't eat kangaroo: " + !koratCat.canEat(kangaroo));
        System.out.println("Korat cat can't eat vegetables: " + !koratCat.canEatVegetables());
    }
}