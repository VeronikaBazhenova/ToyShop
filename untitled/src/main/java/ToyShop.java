import java.util.PriorityQueue;
import java.util.Random;
    public class ToyShop {
        private PriorityQueue<toy> toyQueue;

        public ToyShop() {
            toyQueue = new PriorityQueue<>();
        }

        public void addToy(toy toy) {
            toyQueue.add(toy);
        }

        public int getRandomToyId() {
            Random random = new Random();
            int randomNumber = random.nextInt(10);

            int cumulativeWeight = 0;
            for (toy toy : toyQueue) {
                cumulativeWeight += toy.getFrequency();
                if (randomNumber < cumulativeWeight) {
                    return toy.getId();
                }
            }
            return -1;
        }

        public toy getToyById(int randomToyId) {
            for (toy toy : toyQueue) {
                if (toy.getId() == randomToyId) {
                    return toy;
                }
            }
            return null;
        }
    }
