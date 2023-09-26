package Fabric;

import Interface.IGameItem;
import Product.LeatherReward;

public class LeatherGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {

        return new LeatherReward();
    }
}
