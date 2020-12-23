package lesson1;

import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {
    ArrayList<T> box = new ArrayList<>();

    public void put(T o){
      box.add(o);
    }

    public float getWeight(){
        float total = 0;
        for (T t : box) {
           total += t.getQuantity() * t.getWeightOne();
        } return total;
    }

    public boolean compare(Box<?> box1){
        if(this.getWeight() == box1.getWeight()){
            return true;
        }
        return false;
    }
    public void boxToBox(Box<T> box1){
        for (T t : box1.box) {
            this.box.add(t);
        }
        box1.box.clear();
    }

}
