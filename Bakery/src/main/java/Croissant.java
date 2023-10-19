public class Croissant extends Pastry {
    public Croissant() {
        super("Croissant", 2.5);
    }

    public Croissant(String name, double price) {
        super(name, price);
    }

    @Override
    public void bake() {
        System.out.println("Baking a delicious croissant!");
    }
}

