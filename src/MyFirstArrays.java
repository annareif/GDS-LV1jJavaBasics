public class MyFirstArrays {

    public static void main(String[] args) {

        // array: platzhalter für mehrere Werte des gleichen Typs
        // array von int, array von double, array string
        // arrays haben eine definierte Länge!!
        // Platz muss voher definiert werden


        String[] warenkorb = new String[4]; // 4 Strings haben Platz

        //initialisierung per Default Wert
        // bei String -> null
        // bei int -> 0
        //Werte hinzufügen

        warenkorb[0] = "Apfel";
        warenkorb[1] = "Milch";
        warenkorb[2] = "Butter";
        warenkorb[3] = "Honig";

        //2. Möglichkeit der Initialisierung
        String[] names = {"max", "susi", "john"};

        int[] noten = {1,2,3,4};
        // Länger: 4
        //höchster Index: 3

        //Zugriff auf ein array erfolgt über den Index

        String produkt1 = warenkorb[0];
        String produkt2 = warenkorb[1];
        String produkt3 = warenkorb[2];
        String produkt4 = warenkorb[3];

        // mittels schleifen über ein array iterieren

        //Wie lange soll meine Schleife laufen, Länge des Arrays
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }
    }
}
