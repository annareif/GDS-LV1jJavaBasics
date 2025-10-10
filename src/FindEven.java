public class FindEven {

    public static void main(String[] args) {

        int input = 10;
        int count = 0;

        // solange mein start kleiner gleich 10 ist, prüfe ob der Wert gerade ist
        // wenn gerade, auf der Konsole ausgeben
        //count um 1 erhöhen

        while (count <=10) {
            if (count % 2 == 0) {
                System.out.println("Gerade Zahl: " + count);

            }

            count++;
        }



    }
}
