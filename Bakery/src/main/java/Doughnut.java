public class Doughnut extends Pastry {
    public Doughnut() {
        super("Doughnut", 1.0);
    }

    public Doughnut(String name, double price) {
        super(name, price);
    }

    @Override
    public void bake() {
        System.out.println("Baking a tasty doughnut!");
    }
}
