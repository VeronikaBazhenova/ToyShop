import java.io.FileWriter;
import java.io.IOException;

    public class toy implements Comparable<toy> {
        private int id;
        private String name;
        private int frequency;

        public toy(int id, String name, int frequency) {
            this.id = id;
            this.name = name;
            this.frequency = frequency;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        @Override
        public String toString() {
            return "Toy{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", frequency=" + frequency +
                    '}';
        }

        @Override
        public int compareTo(toy otherToy) {
            return Integer.compare(this.frequency, otherToy.frequency);
        }
    }
