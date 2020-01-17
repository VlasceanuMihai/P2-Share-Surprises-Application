package ShareSurprises;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    public GiveSurpriseAndHug(String type, int waitTime){
        super(type, waitTime);
    }


    @Override
    protected void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }


    @Override
    public void give() throws Exception {
        super.give();
    }


    @Override
    public void giveAll() throws Exception {
        super.giveAll();
    }
}
