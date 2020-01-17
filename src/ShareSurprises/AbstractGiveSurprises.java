package ShareSurprises;

import CreatingContainers.BagFactory;
import CreatingContainers.IBagFactory;
import CreatingSurprises.GatherSurprises;
import Storage.IBag;
import Surprise.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private IBag bag;
    private int waitTime;


    public AbstractGiveSurprises(String type, int waitTime){
        IBagFactory bagFactory = new BagFactory();
        this.bag = bagFactory.makeBag(type);
        this.waitTime = waitTime;
    }


    public IBag getBag() {
        return this.bag;
    }


    public void put(ISurprise newSurprise){
        this.bag.put(newSurprise);
    }


    public void put(IBag surprises){
        this.bag.put(surprises);
    }


    public void give() throws Exception {
        if (this.isEmpty()){
            throw new Exception("The Bag is empty!");
        }

        System.out.println("Surprise eliminated: ");
        this.bag.takeOut().enjoy();
        this.giveWithPassion();
    }


    public void giveAll() throws Exception {
        System.out.println("Surprises eliminated: ");
        if (this.isEmpty()){
            throw new Exception("The Bag is empty!");
        }

        try{
            while (!this.isEmpty()){
                this.bag.takeOut().enjoy();
                this.giveWithPassion();
                TimeUnit.SECONDS.sleep(this.waitTime);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public boolean isEmpty(){
        return this.bag.isEmpty();
    }


    protected abstract void giveWithPassion();
}
