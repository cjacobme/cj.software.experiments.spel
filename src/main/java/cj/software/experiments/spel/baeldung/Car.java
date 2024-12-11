package cj.software.experiments.spel.baeldung;

import java.io.Serial;
import java.io.Serializable;

public class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String make;

    private final String model;

    private final int productionYear;

    private final Engine engine;

    public Car(String make, String model, int productionYear, Engine engine) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Engine getEngine() {
        return engine;
    }
}
