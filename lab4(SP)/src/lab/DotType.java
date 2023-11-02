package lab;

import java.io.Serializable;

public class DotType implements Serializable {
    private Character symbol;

    public DotType(Character symbol) {
        this.symbol = symbol;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }
}
