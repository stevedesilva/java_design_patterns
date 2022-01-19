package udemy.decorator.withsuper.model;


import udemy.decorator.withsuper.interfaces.IceCream;

import java.math.BigDecimal;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.00);
    }
}
