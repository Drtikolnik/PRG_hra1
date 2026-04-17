import java.util.*;

public class Game {

    Scanner sc = new Scanner(System.in);

    // Postup metody: jméno → vytvoření postavy → staty → itemy → menu
    public void start() {
        System.out.println("Program začal.");
        System.out.println("Zadej jméno:");
        String name = sc.nextLine();
        name = name.trim();
        name = name.toLowerCase();
        StringBuilder sb = new StringBuilder(name);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        Charakter player = new Charakter(name);

        player.generateStats();

        for(int i = 0; i < 3; i++) {
            IO.println("Jaký item chceš přidat?");
            String item = sc.nextLine();
            player.addItem(item);
        }

        int choice = 5;
        System.out.println();

        // 🎓 ZÁKLAD 11: menu
        do {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1 - vypiš postavu");
            System.out.println("2 - souboj");

            System.out.println("3 - přidej item");
            System.out.println("4 - odeber item");

            System.out.println("5 - konec");
            System.out.println("-------------------------------------------------------------------");
            choice = sc.nextInt(); sc.nextLine();


            if (choice == 1) {
                player.printInfo();
            }

            if (choice == 2) {
                Charakter enemy = new Charakter("Beggar");
                enemy.generateStats();
                fight(player, enemy);
            }

            if (choice == 3) {
                IO.println("Jaký item chceš přidat?");
                String item = sc.nextLine();
                player.addItem(item);
            }

            if (choice == 4) {
                IO.println("Jaký item chceš odebrat? - zadej ID");
                int id = sc.nextInt();
                sc.nextLine();
                player.removeItem(id);
            }

            System.out.println();
        } while (choice != 5);

        System.out.println("Program skončil.");
    }


    public int damageRoll(Charakter aOrB, int critHitChance){
        int damage = aOrB.getAttack();
        int critHitRoll = (int)(Math.random() * (100 - 1 + 1)) + 1;
        if(critHitRoll <= critHitChance) {
            damage *= 3;
        }
        return damage;
    }


    public void fight(Charakter a, Charakter b) {

        System.out.println("Souboj začíná!");


        while (a.getHp() > 0 || b.getHp() > 0) {
            //výpis hp
            IO.println(a.getName()+ " má " +a.getHp()+ " HP");
            IO.println(b.getName()+ " má " +b.getHp()+ " HP");

            //zeptání a použití lektvaru
            if(a.getInventory().contains("lektvar")) {
                IO.println("Chceš použít lektvar? - ano/ne");
                String pouzitLektvar = sc.nextLine().toLowerCase().trim();
                if (pouzitLektvar.equals("ano")) {
                    a.getInventory().remove("lektvar");
                }
            }

            //fight
            int damage = damageRoll(a, 20);
            b.setHp(b.getHp() - damage);
            IO.println(a.getName()+ " dal " +damage+ " damage");

            if (b.getHp() > 0) {
                damage = damageRoll(b, 20);
                a.setHp(a.getHp() - damage);
                IO.println(b.getName()+ " dal " +damage+ " damage");
            }

        }
        //vítěz
        String winner;
        if (a.getHp() > 0) {
            winner = a.getName();
        }else{
            winner = b.getName();
        }
        System.out.println("Vítěz souboje: " + winner);

    }
}