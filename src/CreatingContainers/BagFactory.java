package CreatingContainers;

import Storage.FIFOContainer;
import Storage.IBag;
import Storage.LIFOContainer;
import Storage.RandomContainer;

public class BagFactory implements IBagFactory{

    @Override
    public IBag makeBag(String type){
        if (type.equalsIgnoreCase("random")){
            return new RandomContainer();

        }else if (type.equalsIgnoreCase("fifo")){
            return new FIFOContainer();

        }else if (type.equalsIgnoreCase("lifo")){
            return new LIFOContainer();
        }
        return null;
    }
}
