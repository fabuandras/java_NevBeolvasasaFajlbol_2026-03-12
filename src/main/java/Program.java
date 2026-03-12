import java.util.Map;

public class Program {

    public static void main(String[] args) {

        Nevem n = new Nevem();


        System.out.println("\n1. feladat: \n\tMelyik betűből mennyi van?");

        Map<Character, Integer> map = n.betuDb();

        Object[] kulcsok = map.keySet().toArray();

        for (int i = 0; i < kulcsok.length; i++) {

            Character c = (Character) kulcsok[i];

            System.out.println(c + " = " + map.get(c));
        }


        System.out.println("\n\n2. feladat: \n\tMonogram");
        System.out.println(n.monogram());


        System.out.println("\n\n3. feladat: \n\tCseréljük fel a Vezetéknév első két betűjét a Keresztnév első két betűjével.");
        System.out.println(n.csere());


        System.out.println("\n\n4. feladat: \n\tABC sorrend");

        Map<Character, Integer> map2 = n.betuDbABC();

        Object[] kulcsok2 = map2.keySet().toArray();

        for (int i = 0; i < kulcsok2.length; i++) {

            Character c = (Character) kulcsok2[i];

            System.out.println(c);
        }
    }
}