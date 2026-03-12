import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Nevem {

    private String vezeteknev;
    private String keresztnev;

    public Nevem() {

        try {

            File fajl = new File("src/nev.txt");
            Scanner sc = new Scanner(fajl);

            if (sc.hasNextLine()) {

                String sor = sc.nextLine();
                String[] adat = sor.split(" ");

                vezeteknev = adat[0];
                keresztnev = adat[1];
            }
            sc.close();

        } catch (FileNotFoundException e) {

        }
    }


    // 1. feladat: Melyik betűből mennyi van?

    public Map<Character, Integer> betuDb() {

        Map<Character, Integer> map = new LinkedHashMap<>();

        String nev = vezeteknev + keresztnev;

        for (int i = 0; i < nev.length(); i++) {

            char karakter = nev.charAt(i);

            if (map.containsKey(karakter)) {
                map.put(karakter, map.get(karakter) + 1);
            } else {
                map.put(karakter, 1);
            }
        }

        return map;
    }


    // 2. feladat
    public String monogram() {

        return "" + vezeteknev.charAt(0)
                + keresztnev.charAt(0);
    }


    // 3. feladat
    public String csere() {

        String ujVezetek =
                keresztnev.substring(0, 2)
                        + vezeteknev.substring(2);

        String ujKereszt =
                vezeteknev.substring(0, 2)
                        + keresztnev.substring(2);

        return ujVezetek + " " + ujKereszt;
    }


    // 4. feladat ABC sorrend
    public Map<Character, Integer> betuDbABC() {

        Map<Character, Integer> map = new TreeMap<>();

        String nev = vezeteknev + keresztnev;

        for (int i = 0; i < nev.length(); i++) {

            char karakter = nev.charAt(i);

            if (map.containsKey(karakter)) {
                map.put(karakter, map.get(karakter) + 1);
            } else {
                map.put(karakter, 1);
            }
        }

        return map;
    }
}