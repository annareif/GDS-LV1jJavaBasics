public class Tagesabschnitt {
    public static void main(String[] args) {

        int uhrzeit = 6;

        if (uhrzeit >5 && uhrzeit <= 9) {
            System.out.println("Früh");
        } else if (uhrzeit > 9 && uhrzeit <= 12) {
            System.out.println("Vormittag");
        } else if (uhrzeit > 12 && uhrzeit <= 16) {
            System.out.println("Nachmittag");
        } else if (uhrzeit> 16 && uhrzeit <= 20) {
            System.out.println("Abend");
        }else
            System.out.println("Nacht");

    }
}
