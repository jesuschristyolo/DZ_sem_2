package Fabric;

import Interface.IGameItem;
import Product.CopperReward;

public class CopperGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new CopperReward();
    }
}
