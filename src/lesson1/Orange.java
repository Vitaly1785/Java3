package lesson1;

public class Orange extends Fruit {

    public Orange(int quantity) {
        super(quantity);
    }

    @Override
    public float getWeightOne() {
        return 1.5f;
    }
}
