

    import java.util.ArrayList;

    public class Zoo {

        private ArrayList<Animal> animals;

        public Zoo() {
            this.animals = new ArrayList<>();
        }

        public int countAnimals(){
            return this.animals.size();
        }

        public void addAnimal(Animal animal){
            this.animals.add(animal);
        }

        public int countBirdEggs(){
            int totalEggs = 0;
            for (int i = 0; i < this.animals.size(); i++){
                Bird animal = (Bird) this.animals.get(i);
                animal.layEgg();
                totalEggs += 1;

            }
            return totalEggs;
        }

        public void greetAnimal (){
            for (Animal animal : this.animals){
                animal.makeNoise();
            }
        }
    }

