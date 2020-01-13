package Surprise;

import CreatingContainers.BagFactory;
import CreatingSurprises.GatherSurprises;
import ShareSurprises.GiveSurpriseAndApplause;
import Storage.FIFOContainer;
import Storage.IBag;
import Storage.LIFOContainer;
import Storage.RandomContainer;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*// Surprises
        *//*System.out.println("**** Generate the surprises ****");

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
        ISurprise minionToy4 = MinionToy.generate();
        minionToy4.enjoy();
        ISurprise minionToy5 = MinionToy.generate();
        minionToy5.enjoy();
        ISurprise minionToy6 = MinionToy.generate();
        minionToy6.enjoy();
        ISurprise minionToy7 = MinionToy.generate();
        minionToy7.enjoy();
        System.out.println("\n");*//*

        ////Containers -> Random Container
        System.out.println("**** Storage in containers ****");
        System.out.println("~~~~ Random Container ~~~~");

        // Bag1
        System.out.println("--- Random Container1 ---");
        IBag randomContainer1 = new RandomContainer();
        randomContainer1.put(fortuneCookie);
        randomContainer1.put(candies);
        randomContainer1.put(minionToy1);
        randomContainer1.put(minionToy2);
        System.out.println("Size of Random Container1: " + randomContainer1.size());
        randomContainer1.displayBag();

        System.out.println("\nSurprise eliminated: ");
        randomContainer1.takeOut().enjoy();
        System.out.println("\nSize of Random Container1: " + randomContainer1.size());
        randomContainer1.displayBag();
        System.out.println();

        // Bag2
        System.out.println("--- Random Container2 ---");
        IBag randomContainer2 = new RandomContainer();
        randomContainer2.put(randomContainer1);
        randomContainer2.displayBag();
        System.out.println("Is Random Container1 empty? " + randomContainer1.isEmpty());
        System.out.println("Is Random Container2 empty? " + randomContainer2.isEmpty());


        ///////////////Containers -> FIFO Container
        System.out.println("~~~~ FIFO Container ~~~~");

        // Bag1
        System.out.println("--- FIFOContainer1 ---");
        IBag fifoContainer1 = new FIFOContainer();
        fifoContainer1.put(fortuneCookie);
        fifoContainer1.put(candies);
        fifoContainer1.put(minionToy1);
        fifoContainer1.put(minionToy2);
        System.out.println("Size of FIFOContainer1: " + fifoContainer1.size());
        fifoContainer1.displayBag();

        System.out.println("\nSurprise eliminated: ");
        fifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of FIFOContainer1: " + fifoContainer1.size());
        fifoContainer1.displayBag();
        System.out.println();

        System.out.println("\nSurprise eliminated: ");
        fifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of FIFOContainer1: " + fifoContainer1.size());
        fifoContainer1.displayBag();
        System.out.println();



        ///////////////Containers -> LIFO Container
        System.out.println("~~~~ LIFO Container ~~~~");

        // Bag1
        System.out.println("--- LIFOContainer1 ---");
        IBag lifoContainer1 = new LIFOContainer();
        lifoContainer1.put(fortuneCookie);
        lifoContainer1.put(candies);
        lifoContainer1.put(minionToy1);
        lifoContainer1.put(minionToy2);
        System.out.println("Size of LIFOContainer1: " + lifoContainer1.size());
        lifoContainer1.displayBag();

        System.out.println("\nSurprise eliminated: ");
        lifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of LIFOContainer1: " + lifoContainer1.size());
        lifoContainer1.displayBag();
        System.out.println();

        System.out.println("\nSurprise eliminated: ");
        lifoContainer1.takeOut().enjoy();
        System.out.println("\nSize of LIFOContainer1: " + lifoContainer1.size());
        lifoContainer1.displayBag();
        System.out.println();*/


        /*//////////////////////////////////
        System.out.println("``` GatherSurprises ```");
        ArrayList<ISurprise> surprises1 = GatherSurprises.gather(5);

        ISurprise surprise1 = GatherSurprises.gather();
        assert surprise1 != null;
        surprise1.enjoy();

        ISurprise surprise2 = GatherSurprises.gather();
        assert surprise2 != null;
        surprise2.enjoy();

        ISurprise surprise3 = GatherSurprises.gather();
        assert surprise3 != null;
        surprise3.enjoy();
        System.out.println("\n");


        ///////////////////////////////////
        System.out.println("``` Create containers ```");
        Scanner scan = new Scanner(System.in);

        BagFactory bagFactory = new BagFactory();

        System.out.println("Input the type of container: ");
        String type = scan.next();
        while (!type.equalsIgnoreCase("random") && !type.equalsIgnoreCase("fifo") && !type.equalsIgnoreCase("lifo")){
            type = scan.next();
        }

        IBag bag = bagFactory.makeBag(type);
        bag.put(surprise1);
        bag.put(surprise2);
        bag.put(surprise3);
        for (int i = 0; i < surprises1.size(); i++){
            bag.put(surprises1.get(i));
        }

        System.out.println("Size of Random Container: " + bag.size());
        bag.displayBag();
        System.out.println();

        System.out.println("\nSurprise eliminated: ");
        bag.takeOut().enjoy();
        System.out.println("\nSize of Random Container1: " + bag.size());
        bag.displayBag();
        System.out.println();*/

        GiveSurpriseAndApplause giveSurpriseAndApplause1 = new GiveSurpriseAndApplause("random", 3);
        giveSurpriseAndApplause1.put(GatherSurprises.gather());
        giveSurpriseAndApplause1.put(GatherSurprises.gather());
        giveSurpriseAndApplause1.put(GatherSurprises.gather());
        giveSurpriseAndApplause1.put(GatherSurprises.gather());
        System.out.println(giveSurpriseAndApplause1.getBag().size());
        giveSurpriseAndApplause1.getBag().displayBag();

        giveSurpriseAndApplause1.give();

        GiveSurpriseAndApplause giveSurpriseAndApplause2 = new GiveSurpriseAndApplause("random", 5);

    }
}
