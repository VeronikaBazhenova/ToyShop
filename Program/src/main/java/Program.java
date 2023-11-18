import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> idList = new ArrayList<>();
        ArrayList<Toy> toys = new ArrayList<>();

        Toy one = new Toy("кукла",3,5);
        Generate(one,idList,toys);
        Toy two = new Toy("машинка",1,1);
        Generate(two,idList,toys);
        Toy three= new Toy("мишка",2,7);
        Generate(three,idList,toys);
        Toy four= new Toy("вертолёт",6,1);
        Generate(four,idList,toys);

        Toy prize = Lottery( idList, toys);
        DelToy(prize,toys);
        try {
            FileWriter fileWriter = new FileWriter("Prize.txt");
            fileWriter.write(prize.getId() + ". " + prize.getName() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static Toy Lottery(ArrayList<Integer> idList, ArrayList<Toy> toys){
        Random random = new Random();
        int ticket = new Random().nextInt(idList.size());
        int id = idList.get(ticket);
        Toy prize = new Toy();
        for (Toy toy: toys) {
            if (toy.getId()==id) prize = toy;
            else  prize = toy;
        }
        return prize;
    }

    public static void Generate(Toy toy, ArrayList<Integer> idList, ArrayList<Toy> toys){
        int id = toy.getId();
        int chance = toy.getChance();
        for (int i = 0; i < chance; i++) {
            idList.add(id);
        }
        toys.add(toy);
    }
    
    public static void DelToy(Toy toy, ArrayList<Toy> toys){
        for (Toy item: toys) {
            if (toy.getId()==item.getId()){
                item.setQuantity(item.getQuantity()-1);
                if (item.getQuantity()<1){
                    toys.remove(item);
                }
            }

        }
    }

}

