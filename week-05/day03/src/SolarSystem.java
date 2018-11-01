import java.util.*;

public class SolarSystem {

    public static void main(String[] args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        System.out.println(putSaturn(planetList));

    }

    public static ArrayList<String> putSaturn (ArrayList<String> insertPlanet) {

        insertPlanet.add(5, "Saturn");

        return insertPlanet;

    }
}
