package Storage;

import Surprise.ISurprise;

import java.util.ArrayList;

public class LIFOContainer implements IBag{
    private ArrayList<ISurprise> lifoSurprisesBag = new ArrayList<ISurprise>();


    public ArrayList<ISurprise> getLifoSurprisesBag() {
        return lifoSurprisesBag;
    }


    @Override
    public void put(ISurprise newSurprise) {
        this.lifoSurprisesBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprise) {
        LIFOContainer theOtherBag = (LIFOContainer) bagOfSurprise;
        this.lifoSurprisesBag.addAll(theOtherBag.getLifoSurprisesBag());
        theOtherBag.getLifoSurprisesBag().clear();
    }


    @Override
    public ISurprise takeOut() {
        return this.lifoSurprisesBag.remove(this.size() - 1);
    }


    @Override
    public boolean isEmpty() {
        if (this.lifoSurprisesBag.isEmpty()){
            return true;
        }
        return false;
    }


    @Override
    public int size() {
        return this.lifoSurprisesBag.size();
    }


    @Override
    public void displayBag(){
        for (int i = 0; i < this.lifoSurprisesBag.size(); i++) {
            System.out.println("Surprise [" + (i+1)  + "] from FIFO List: ");
            this.lifoSurprisesBag.get(i).enjoy();
        }
    }
}
