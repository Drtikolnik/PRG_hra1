import java.util.ArrayList;

public class Charakter {

    private String name;
    private int hp;
    private int attack;
    private ArrayList<String> inventory;


    public Charakter(String name) {
        this.name = name;
        inventory = new ArrayList<>();

    }


    public void generateStats() {
        this.hp = (int)(Math.random() * (100 - 50 + 1)) + 50;
        this.attack = (int)(Math.random() * (20 - 5 + 1)) + 5;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    // ⭐ BONUS 2: odebrání itemu
    public void removeItem(int index) {
        try{
            inventory.remove(index-1);
        }catch(IndexOutOfBoundsException e){
            IO.println("Error: Item not found");
        }

    }



    public void printInfo() {
        IO.println("Name: " +name);
        IO.println("HP: " +hp);
        IO.println("Attack: " +attack);

        for (int i = 0; i < inventory.size(); i++) {
            IO.println(i+1+ ". Item:" +inventory.get(i));
        }

    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }
}