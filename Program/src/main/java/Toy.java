import java.util.List;

public class Toy {
    private static int counter;
    private int id;

    {
        id = ++counter;
    }
    private String name;
    private int quantity;
    private int chance;
    public List<Integer> idList;

    public Toy(String name, int quantity, int chance) {
        this.name = name;
        if (quantity<1) this.quantity = 1;
        else this.quantity=quantity;
        if (chance>10 || chance<1) this.chance=5;
        else this.chance=chance;
    }
    public Toy(){
        this.name = "0";
        this.quantity = 0;
        this.chance = 0;
    }
    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
    @Override
    public String toString() {
        return "|| id = " + id +
                ", name = " + name + "," +
                "quantity = " + quantity;
    }
}
