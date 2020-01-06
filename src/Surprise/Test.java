package Surprise;

import Storage.FIFOContainer;
import Storage.IBag;
import Storage.LIFOContainer;
import Storage.RandomContainer;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // Surprises
        System.out.println("**** Generate the surprises ****");

        ISurprise fortuneCookie = FortuneCookie.generate();
        fortuneCookie.enjoy();
        ISurprise candies = Candies.generate();
        candies.enjoy();
        ISurprise minionToy1 = MinionToy.generate();
        minionToy1.enjoy();
        ISurprise minionToy2 = MinionToy.generate();
        minionToy2.enjoy();
        ISurprise minionToy3 = MinionToy.generate();
        minionToy3.enjoy();
        System.out.println("\n");

        ////Containers -> Random Container
        System.out.println("**** Storage in containers ****");
        System.out.println("~~~~ Random Container ~~~~");

        // Bag1
        System.out.println("--- Bag1 ---");
        IBag randomContainer1 = new RandomContainer();
        randomContainer1.put(fortuneCookie);
        randomContainer1.put(candies);
        randomContainer1.put(minionToy1);
        randomContainer1.put(minionToy2);
        System.out.println("Size of Bag1: " + randomContainer1.size());
        randomContainer1.displayBag();

        System.out.println("\nSurprise eliminated: ");
        randomContainer1.takeOut().enjoy();
        System.out.println("\nSize of Bag1: " + randomContainer1.size());
        randomContainer1.displayBag();
        System.out.println();

        // Bag2
        System.out.println("--- Bag2 ---");
        IBag randomContainer2 = new RandomContainer();
        randomContainer2.put(randomContainer1);
        randomContainer2.displayBag();
        System.out.println("Is Bag1 empty? " + randomContainer1.isEmpty());
        System.out.println("Is Bag2 empty? " + randomContainer2.isEmpty());


        ///////////////Containers -> FIFO Container
        System.out.println("~~~~ FIFO Container ~~~~");

        // Bag1
        System.out.println("--- Bag1 ---");
        IBag fifoContainer1 = new FIFOContainer();
        fifoContainer1.put(fortuneCookie);
        fifoContainer1.put(candies);
        fifoContainer1.put(minionToy1);
        fifoContainer1.put(minionToy2);
        System.out.println("Size of Bag1: " + fifoContainer1.size());
        fifoContainer1.displayBag();

        System.out.println("\nSurprise eliminated: ");
        fifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of Bag1: " + fifoContainer1.size());
        fifoContainer1.displayBag();
        System.out.println();

        System.out.println("\nSurprise eliminated: ");
        fifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of Bag1: " + fifoContainer1.size());
        fifoContainer1.displayBag();
        System.out.println();



        ///////////////Containers -> LIFO Container
        System.out.println("~~~~ LIFO Container ~~~~");

        // Bag1
        System.out.println("--- Bag1 ---");
        IBag lifoContainer1 = new LIFOContainer();
        lifoContainer1.put(fortuneCookie);
        lifoContainer1.put(candies);
        lifoContainer1.put(minionToy1);
        lifoContainer1.put(minionToy2);
        System.out.println("Size of Bag1: " + lifoContainer1.size());
        lifoContainer1.displayBag();

        System.out.println("\nSurprise eliminated: ");
        lifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of Bag1: " + lifoContainer1.size());
        lifoContainer1.displayBag();
        System.out.println();

        System.out.println("\nSurprise eliminated: ");
        lifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of Bag1: " + lifoContainer1.size());
        lifoContainer1.displayBag();
        System.out.println();
    }
}
