import java.awt.*;
import java.util.Date;
import java.util.Random;

public class Background {
    private static Color color;
    private static Date startTime = new Date();
    private static Color currentColor;
    static public Color generateColor() {
            long currentTime = System.currentTimeMillis();
            long diffDate = currentTime - startTime.getTime();

                Random rnd = new Random();
                Color color = new Color(rnd.nextInt());
                currentColor = color;
                return color;


    }
}