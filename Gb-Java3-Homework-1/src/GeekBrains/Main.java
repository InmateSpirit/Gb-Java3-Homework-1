package GeekBrains;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Fruit[] arr = new Fruit[]{new Fruit("Apple"), new Fruit("Apple"),new Fruit("Orange")};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ChangePlaces(arr,0,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ArrayList arraylist = changeFormat(arr);
        arraylist.add(new Fruit("Apple"));
        Box<Orange> box1 = new Box();
        Box<Orange> box2 = new Box();
        Box<Apple> box3 = new Box();
        Box<Apple> box4 = new Box();
        Box<Apple> box5 = new Box();
        for (int i = 0; i < 20; i++) {
            box1.putIn(new Orange());
        }
        for (int i = 0; i < 24; i++) {
            box2.putIn(new Orange());
        }
        for (int i = 0; i < 32; i++) {
            box3.putIn(new Apple());
        }
        for (int i = 0; i < 27; i++) {
            box4.putIn(new Apple());
        }
        for (int i = 0; i < 30; i++) {
            box5.putIn(new Apple());
        }

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
        System.out.println(box4.getWeight());
        System.out.println(box5.getWeight());
        box1.compare(box2);
        box1.compare(box3);
        box1.compare(box4);
        box1.compare(box5);
        box3.fruitTransfer(box4);
        System.out.println(box3.getWeight());
        System.out.println(box4.getWeight());
        box1.fruitTransfer(box4);
        System.out.println(box1.getWeight());
        System.out.println(box4.getWeight());
        box1.fruitTransferVer2(box2);
        System.out.println(box1.getWeightVer2());
        System.out.println(box2.getWeightVer2());



    }




    public static void ChangePlaces(Object[] arr, int a, int b){
        if(a >= arr.length || b >= arr.length){
            System.out.println("Wrong input, exceeded array length");
            System.out.println(String.format("a and b should smaller than %s", arr.length));
        }else if (a<0 || b<0){
            System.out.println("Wrong input, cannot be negative");
        } else {
            Object temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
    public static ArrayList changeFormat(Object[] arr){
        ArrayList reformattedArray = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            reformattedArray.add(arr[i]);
        }
        return reformattedArray;
    }
}
