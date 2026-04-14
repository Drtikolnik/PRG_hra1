import java.util.*;

public class Game {

    Scanner sc = new Scanner(System.in);

    // Postup metody: jméno → vytvoření postavy → staty → itemy → menu
    public void start() {
        System.out.println("Program začal.");
        // 🎓 ZÁKLAD 6: načtení jména
        System.out.println("Zadej jméno:");
        String name = "";

        // TODO načti jméno (patří do 🎓 ZÁKLAD 6)

        /* 🎓 ZÁKLAD 3: úprava jména
          - odstraň mezery na začátku a konci (trim())
         - nastav první písmeno jako velké */

        // TODO uprav name (patří do 🎓 ZÁKLAD 6)


        // 🎓 ZÁKLAD 8: vytvoř hráče (vytvoř novou instanci Character se jménem hráče)
        Character player = null;

        // 🎓 ZÁKLAD 9: vygeneruj staty hráče (generateStats())

        /* 🎓 ZÁKLAD 10: načti 3 itemy
         hint: zkus použít for cyklus */


        int choice = 5;
        System.out.println();

        // 🎓 ZÁKLAD 11: menu
        do {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1 - vypiš postavu");
            System.out.println("2 - souboj");

            /* ⭐ BONUS 3: přidávání a odebrání itemů uživatelem pomocí menu - zde jen odkomentuj, více níže
            System.out.println("3 - přidej item");
            System.out.println("4 - odeber item"); */

            System.out.println("5 - konec");
            System.out.println("-------------------------------------------------------------------");
            // TODO načti volbu (patří do 🎓 ZÁKLAD 11)


            if (choice == 1) {
                // TODO vypiš postavu (patří do 🎓 ZÁKLAD 11)
            }

            if (choice == 2) {
                // TODO vytvoř nepřítele (Character) (patří do 🎓 ZÁKLAD 11)
                // TODO zavolej fight() (patří do 🎓 ZÁKLAD 11)
            }

            // ⭐ BONUS 3:
            if (choice == 3) {
                // TODO načti item a přidej ho (patří do ⭐ BONUS 3)
            }

            if (choice == 4) {
                // TODO načti index a odeber item (patří do ⭐ BONUS 3)
            }

            System.out.println();
        } while (choice != 5);

        System.out.println("Program skončil.");
    }

    /**
     * 🎓 ZÁKLAD 12: metoda fight
     *
     * Metoda simuluje souboj mezi dvěma postavami.
     * Postavy se střídají v útocích, dokud mají oba více než 0 HP.
     *
     * Průběh:
     * - nejdříve útočí postava {@code a} na {@code b}
     * - pokud {@code b} přežije, útočí zpět na {@code a}
     *
     * ⭐ BONUS 4:
     * - kritický zásah (20% šance na vyšší poškození)
     *
     * ⭐ BONUS 5:
     * - pokud má postava item "lektvar", může se vyléčit
     *
     * Na konci metoda vypíše vítěze.
     *
     * @param a první postava (začíná)
     * @param b druhá postava
     */
    public void fight(Character a, Character b) {

        System.out.println("Souboj začíná!");

        /* hint: zkus použít while cyklus
         - cyklus běží dokud mají oba HP > 0
         - a útočí na b  ( patří do 🎓 ZÁKLAD 12)*/

        // ⭐ BONUS 4: kritický zásah =  s pravděpodobností 20 % způsobí 3x vyšší poškození

        // TODO kontrola jestli b žije (patří do 🎓 ZÁKLAD 12)

        // ⭐ BONUS 5: pokud má hráč "lektvar", může se vyléčit (čili v poli item, položku s nazvem "lektvar")

        // TODO b útočí na a (patří do 🎓 ZÁKLAD 12)

        // TODO výpis vítěze (patří do 🎓 ZÁKLAD 12)
    }
}