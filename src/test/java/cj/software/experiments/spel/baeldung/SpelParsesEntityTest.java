package cj.software.experiments.spel.baeldung;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.assertj.core.api.Assertions.assertThat;

class SpelParsesEntityTest {
    private static Engine engine;

    private static Car car;

    private static ExpressionParser expressionParser;

    @BeforeAll
    static void create() {
        engine = new Engine(68, 4);
        car = new Car("Good manufacturer", "Model 3", 2018, engine);
        expressionParser = new SpelExpressionParser();
    }

    @Test
    void parseModel() {
        Expression expression = expressionParser.parseExpression("model");
        String model = expression.getValue(car, String.class);
        assertThat(model).as("model").isEqualTo("Model 3");
    }

    @Test
    void parseEngine() {
        Expression expression = expressionParser.parseExpression("engine");
        Engine engineOfCar = expression.getValue(car, Engine.class);
        assertThat(engineOfCar).usingRecursiveComparison().isEqualTo(engine);
    }

    @Test
    void parseHorsepower() {
        Expression expression = expressionParser.parseExpression("engine.horsePower");
        Integer horsePower = expression.getValue(car, Integer.class);
        assertThat(horsePower).isEqualTo(68);
    }
}
