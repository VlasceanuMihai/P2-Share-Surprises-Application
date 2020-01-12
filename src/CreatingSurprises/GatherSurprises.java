package CreatingSurprises;

import Surprise.Candies;
import Surprise.FortuneCookie;
import Surprise.ISurprise;
import Surprise.MinionToy;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public final class GatherSurprises {
    private GatherSurprises(){
    }

    // returneaza un array continand n surprize.
    public static ArrayList<ISurprise> gather(int n){
        ArrayList<ISurprise> listOfSurprises = new ArrayList<ISurprise>(n);
        for (int i = 0; i < n; i++){
            int randomNumber = ThreadLocalRandom.current().nextInt(0, 3);
            switch (randomNumber){
                case 0:
                    ISurprise fortuneCookie = FortuneCookie.generate();
                    listOfSurprises.add(fortuneCookie);
                    break;
                case 1:
                    ISurprise candies = Candies.generate();
                    listOfSurprises.add(candies);
                    break;
                case 2:
                    ISurprise minionToy = MinionToy.generate();
                    listOfSurprises.add(minionToy);
                    break;
                default:
                    break;
            }

        }

        return listOfSurprises;
    }


    //care va returna o singura surpriza.
    public static ISurprise gather(){
        int number = ThreadLocalRandom.current().nextInt(0, 3);
        System.out.println(number);
        switch (number){
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                break;
        }
        return null;
    }
}
