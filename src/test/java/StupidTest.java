import com.burgaggle.collections.BubbleBathSort;

import java.util.ArrayList;
import java.util.List;

public class StupidTest {

    private static final List<String> IDIOTS;

    static {
        IDIOTS = new ArrayList<>();
        IDIOTS.add("Pete");
        IDIOTS.add("Jay");
        IDIOTS.add("Tim");
        IDIOTS.add("Brandon");
        IDIOTS.add("Mike");
        IDIOTS.add("Potato Salad");
        IDIOTS.add("Normally, both your asses would be dead as fucking fried chicken, but you happen to pull this shit while I'm in a transitional period so I don't wanna kill you, I wanna help you. But I can't give you this case, it don't belong to me. " +
                "Besides, I've already been through too much shit this morning over this case to hand it over to your ass.");
    }

    public static void main(String[] args) {
        BubbleBathSort.sort(IDIOTS)
        .forEach(i -> {
            System.out.println(i + "\n");
        });
    }

}
