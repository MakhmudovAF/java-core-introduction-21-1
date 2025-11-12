import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        Forest.season = season;
        updateHaresColor();
    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        updateHaresColor();
    }

    private static void updateHaresColor() {
        String newColor = season.equals("зима") ? "белый" : "серо-рыжий";
        MountainHare.setColor(newColor);
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}