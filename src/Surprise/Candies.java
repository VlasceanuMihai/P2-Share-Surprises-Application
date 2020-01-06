package Surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Candies implements ISurprise {
    private static final ArrayList<String> candyType = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
    private int numberOfCandies;
    private String type;


    public Candies(int numberOfCandies, String type){
        this.numberOfCandies = numberOfCandies;
        this.type = type;
    }


    public int getNumberOfCandies() {
        return numberOfCandies;
    }

    public String getType() {
        return type;
    }

    public static Candies generate(){
        int typeOfCandy = ThreadLocalRandom.current().nextInt(0, 3);
        int numberOfCandies = ThreadLocalRandom.current().nextInt(1, 10);
        Candies candies = new Candies(numberOfCandies, candyType.get(typeOfCandy));
//        candies.enjoy();

        return candies;
    }


    @Override
    public void enjoy() {
        System.out.println("CANDIES: The " + this.numberOfCandies + " surprise candies are of the type: " + this.type);
    }
}
