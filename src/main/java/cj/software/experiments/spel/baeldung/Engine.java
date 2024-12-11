package cj.software.experiments.spel.baeldung;

import java.io.Serial;
import java.io.Serializable;

public class Engine implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int horsePower;

    private final int numCylinders;

    public Engine(int horsePower, int numCylinders) {
        this.horsePower = horsePower;
        this.numCylinders = numCylinders;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getNumCylinders() {
        return numCylinders;
    }
}
