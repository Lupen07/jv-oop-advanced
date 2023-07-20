package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();
    private static Random random = new Random();

    public static Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
