package GeekBrains;

public class Fruit {
    String name;

    public Fruit(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
