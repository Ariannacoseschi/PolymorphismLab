import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Pastry> pastries;

    public Bakery() {
        pastries = new ArrayList<>();
    }

    public void addPastry(Pastry pastry) {
        pastries.add(pastry);
    }

    public void bakeAll() {
        for (Pastry pastry : pastries) {
            pastry.bake();
        }
    }

    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.addPastry(new Croissant());
        bakery.addPastry(new Meringue());
        bakery.addPastry(new Doughnut());
        bakery.addPastry(new Cupcake());

        bakery.bakeAll();
    }

}






