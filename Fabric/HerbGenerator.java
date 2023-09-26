package Fabric;

import Interface.IGameItem;
import Product.HerbReward;

public class HerbGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new HerbReward();
    }
}
