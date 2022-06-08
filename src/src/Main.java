package src;
import java.util.ArrayList;
import java.util.Comparator;

class Plane {
    String name;
    String color;
    int pilots;
    int age;
    int weight;
    Plane(String name, String color,int pilots, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    String getName() {
        return name;
    }
    String getColor() {
        return color;
    }
    int getPilots() {
        return pilots;
    }
    int getAge() {
        return age;
    }
    int getWeight() {
        return weight;
    }
    public void print() {
        String RESULT = String.format("Літак %s %s кольору Ліаку лише %s років важить літак : %s кг", this.getName(), this.getColor(),this.getAge(),this.getWeight());
        System.out.println(RESULT);
    }
}
public class Main {
    public static final ArrayList<Plane> planes = new ArrayList<>();
    public static void main(String[] args) {
        planes.add(new Plane("«Мрія»", "white",2,  34, 285000 ));
        planes.add(new Plane("Airbus 380", "yellow",2,  17, 276800 ));
        planes.add(new Plane("Ан-2", "green",2,  45, 3300 ));

        System.out.println("Сортування по віку(за збільшенням) літаків");
        planes.sort(Comparator.comparing(Plane::getAge));
        planes.forEach(Plane::print);
        System.out.println("Сортування по вазі(за зменшенням) літаків");
        planes.sort(Comparator.comparing(Plane::getWeight,Comparator.reverseOrder()));
        planes.forEach(Plane::print);

    }
}
