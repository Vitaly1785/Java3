package lesson1;

public class Apple extends Fruit {

    public Apple(int quantity) {
        super(quantity);
    }

    @Override
    public float getWeightOne() {
        return 1.0f;
    }
}
