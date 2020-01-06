package Surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MinionToy implements ISurprise {
    private static final ArrayList<String> minions = new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
    private String minionName;
    private static String lastMinion = "Dave";


    public MinionToy(String minionName){
        this.minionName = minionName;
    }


    public String getMinionName() {
        return minionName;
    }

    public static MinionToy generate(){
        int count = minions.indexOf(lastMinion);
        MinionToy minionToy = new MinionToy(lastMinion);
        lastMinion = minions.get(count + 1);
//        minionToy.enjoy();

        return minionToy;
    }


    @Override
    public void enjoy() {
        System.out.println("MINION TOY: The name of the minion is " + this.minionName);
    }
}
