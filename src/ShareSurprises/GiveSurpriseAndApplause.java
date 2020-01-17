package ShareSurprises;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    public GiveSurpriseAndApplause(String type, int waitTime){
        super(type, waitTime);
    }


    @Override
    protected void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
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
