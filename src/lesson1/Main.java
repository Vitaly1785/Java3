package lesson1;


import java.util.*;

public class Main {
    public static  void main(String[] args) {
        Integer[] arr1 = {1, 0, 5, 7, 10, 12, 16};
        String[] arr2 = {"java1", "java2", "java3", "github", "gitIgnore"};
        replace(arr1, 2, 6);
        replace(arr2, 2, 0);
        arrayToList(arr1);
        arrayToList(arr2);
//3
        int rand = (int) (Math.random() * 10 + 1);


        Box <Apple> appleBox = new Box<>();
        appleBox.put(new Apple(rand));
        appleBox.put(new Apple(rand));

        Box <Apple> appleBox1 = new Box<>();
        appleBox1.put(new Apple(rand));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.put(new Orange(rand));

        System.out.println("Вес коробки с алельсинами = " + orangeBox.getWeight());
        System.out.println("Вес первой коробки с яблоками = " + appleBox.getWeight());
        System.out.println("Вес второй коробки с яблоками = " + appleBox1.getWeight());

        System.out.println("Сравниваем вес коробок с апельсинами и яблоками и получаем - " + orangeBox.compare(appleBox));

        System.out.println("Пересыпаем яблоки из первой коробки во вторую");
        appleBox1.boxToBox(appleBox);

        System.out.println("Получем вес второй коробки с яблоками = " + appleBox1.getWeight());
        System.out.println("В первой коробке - пусто " + appleBox.getWeight());
    }

//1
    private static <T> void replace(T[] arr, int i, int i1) {
        T n = arr[i];
        arr[i] = arr[i1];
        arr[i1] = n;
        System.out.println(Arrays.toString(arr));
    }
//2
    private static <T> void arrayToList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
        System.out.println(list);
    }

}
