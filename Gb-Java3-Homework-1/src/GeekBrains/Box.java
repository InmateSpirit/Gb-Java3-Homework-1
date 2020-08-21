package GeekBrains;

import java.util.ArrayList;

public class Box<F extends Fruits> {
    ArrayList<F> box = new ArrayList();
    private float weight;
    private int amount;// or box.size

    public void putIn(F a) {
        box.add(a);
        amount++;
    }

    public void putInVer2(F a) {
        box.add(a);
    }

    public float getWeight() {
        if(box.isEmpty()){
            System.out.println("Box is empty");
            return 0;
        }
            if (box.get(0) instanceof Orange) {
                weight = amount * 1.5f;
            } else {
                weight = amount * 1.0f;
            }
            return weight;
    }

    public float getWeightVer2() {
        if(box.isEmpty()){
            System.out.println("Box is empty");
            return 0;
        }
        if (box.get(0) instanceof Orange) {
            return box.size() * 1.5f;
        } else {
            return box.size() * 1.0f;
        }
    }

    public boolean compare(Box a) {
        if (getWeight() == a.getWeight()) {
            System.out.println("The weight is equal");
            return true;
        } else if (getWeight() > a.getWeight()) {
            System.out.println("The box is heavier");
            return false;
        } else {
            System.out.println("The box is lighter");
            return false;
        }

    }
    public void fruitTransfer(Box a){
        if (box.get(0) instanceof Orange && a.checkInstance()){
            while (amount != 0){
                a.putIn(new Orange());
                amount--;
            }
            for (int i = amount-1 ; i == 0 ; i--) {
                box.remove(i);
            }
            weight = 0;
            System.out.println("Transfer completed");
        } else if (box.get(0) instanceof Apple && !a.checkInstance()){
            while (amount != 0){
                a.putIn(new Apple());
                amount--;
            }
            for (int i = amount-1; i == 0 ; i--) {
                box.remove(i);
            }
            weight = 0;
            System.out.println("Transfer completed");
        }
        else {
            System.out.println("Can't put different fruits in one box");
        }

    }
    public void fruitTransferVer2(Box a){
        if (box.get(0) instanceof Orange && a.checkInstance()){
            this.box.addAll(a.box);
            a.box.clear();
            System.out.println("Transfer completed");
        } else if (box.get(0) instanceof Apple && !a.checkInstance()){
            this.box.addAll(a.box);
            a.box.clear();
            System.out.println("Transfer completed");
        }
        else {
            System.out.println("Can't put different fruits in one box");
        }

    }


    private boolean checkInstance(){
       if(box.get(0) instanceof Orange){
           return true;
       }
       return false;
    }
}
