public class Cupcake extends Pastry {
    public Cupcake() {
        super("Cupcake", 2.0);
    }

    public Cupcake(String name, double price) {
        super(name, price);
    }

    @Override
    public void bake() {
        System.out.println("Baking a colorful cupcake!");
    }
}
