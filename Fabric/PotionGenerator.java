package Fabric;

import Interface.IGameItem;
import Product.PotionReward;

public class PotionGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new PotionReward();
    }
}
