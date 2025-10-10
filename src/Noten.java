public class Noten {

    public static void main(String[] args) {

        //5 Fächer, 5 Noten, Array mit Noten aus allen Fächern

        int[] noten = new int[5];
        noten[0] = 1;
        noten[1] = 2;
        noten[2] = 3;
        noten[3] = 4;
        noten[4] = 5;

        for (int i=0; i<noten.length; i++) {
            System.out.println("Note: " + noten[i]);
        }
    }
}
