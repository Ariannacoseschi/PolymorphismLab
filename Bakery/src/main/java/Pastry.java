
import java.util.ArrayList;
import java.util.List;


    public abstract class Pastry {
        private String name;
        private double price;


        public Pastry(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public abstract void bake();
    }




