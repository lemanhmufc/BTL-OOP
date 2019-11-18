package drawer.Road;

import Config.Config;
import drawer.drawEntity;

import java.awt.*;

public class drawRoad implements drawEntity {
    public static void draw(int posX, int posY, Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.gray);
        g2d.fillRect(posX, posY, Config.ROAD_SIZE, Config.ROAD_SIZE);
    }
}
