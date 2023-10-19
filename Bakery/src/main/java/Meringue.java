public class Meringue extends Pastry {
    public Meringue() {
        super("Meringue", 1.5);
    }

    public Meringue(String name, double price) {
        super(name, price);
    }

    @Override
    public void bake() {
        System.out.println("Baking a sweet meringue!");
    }
}
