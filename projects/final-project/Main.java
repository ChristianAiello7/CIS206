import java.util.LinkedList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    List<Mountain> mountains = new LinkedList<>();

    mountains.add(new Mountain("Chimborazo", "Ecuador", 20549));
    mountains.add(new Mountain("Matterhorn", "Switzerland", 14692));
    mountains.add(new Mountain("Olympus", "Greece", 9573));
    mountains.add(new Mountain("Everest", "Nepal", 29029));
    mountains.add(new Mountain("Mount Marcy", "United States", 5344));
    mountains.add(new Mountain("Mount Mitchell", "United States", 6684));
    mountains.add(new Mountain("Zugspitze", "Switzerland", 9719));

    printMountainsDetail(mountains);
    System.out.println();

    Mountain mountain = mountainMinElevation(mountains);
    System.out.printf("Shortest mountain: %s, Elevation: %.2f ft\n", mountain.getName(),
        mountain.getElevation());
    }

    public static double minElevation(List<Mountain> mountains) {
        return mountains.stream().mapToDouble(Mountain::getElevation).min().orElse(0.0);
    }

    public static Mountain mountainMinElevation(List<Mountain> mountains) {
        Mountain mountain = mountains.get(0);
        for (int i = 1; i < mountains.size(); i++) {
        Mountain m = mountains.get(i);
        if (m.getElevation() < mountain.getElevation()) {
            mountain = m;
    }
    }
        return mountain;
    }

    public static void printMountainsDetail(List<Mountain> mountains) {
        System.out.printf("%-15s %-15s %-18s %-18s\n", "Mountain", "Country", "Elevation in feet",
        "Elevation in meters");
        for (Mountain mountain : mountains) {
        System.out.printf("%-15s %-15s %-18f %-18f\n", mountain.getName(), mountain.getCountry(),
            mountain.getElevation(), mountain.toMeters());
    }
    }
    }
