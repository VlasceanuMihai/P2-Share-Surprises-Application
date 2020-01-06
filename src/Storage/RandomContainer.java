package Storage;

import Surprise.FortuneCookie;
import Surprise.ISurprise;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomContainer implements IBag{
    private ArrayList<ISurprise> randomSurprisesBag = new ArrayList<ISurprise>();


    public ArrayList<ISurprise> getRandomSurprisesBag() {
        return this.randomSurprisesBag;
    }


    @Override
    public void put(ISurprise newSurprise) {
        this.randomSurprisesBag.add(newSurprise);
    }


    @Override
    public void put(IBag bagOfSurprise) {
        RandomContainer theOtherBag = (RandomContainer) bagOfSurprise;
        this.randomSurprisesBag.addAll(theOtherBag.getRandomSurprisesBag());
        theOtherBag.getRandomSurprisesBag().clear();
    }


    @Override
    public ISurprise takeOut() {
        int randomSurprise = ThreadLocalRandom.current().nextInt(0, this.randomSurprisesBag.size() - 1);
        return this.randomSurprisesBag.remove(randomSurprise);
    }


    @Override
    public boolean isEmpty() {
        if (this.randomSurprisesBag.isEmpty()){
            return true;
        }
        return false;
    }


    @Override
    public int size() {
        return this.randomSurprisesBag.size();
    }


    @Override
    public void displayBag(){
        for (int i = 0; i < this.randomSurprisesBag.size(); i++) {
            System.out.println("Surprise [" + (i+1)  + "] from Random List: ");
            this.randomSurprisesBag.get(i).enjoy();
        }
    }
}
