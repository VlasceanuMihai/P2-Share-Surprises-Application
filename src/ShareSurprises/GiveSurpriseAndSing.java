package ShareSurprises;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

    public GiveSurpriseAndSing(String type, int waitTime){
        super(type, waitTime);
    }


    @Override
    protected void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
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
