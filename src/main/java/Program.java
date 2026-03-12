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
    }
}