
package graphic;

import graphic.Loader;
import java.awt.image.BufferedImage;

public class Assets {
    
    public static BufferedImage player, enemyFire, enemyIce, health, red, blue, green, key;    
    
    public static void init(){
        player = Loader.ImageLoader("/wizards/mago.png");
        enemyFire = Loader.ImageLoader("/wizards/fire.png");
        enemyIce = Loader.ImageLoader("/wizards/ice.png");
        health = Loader.ImageLoader("/wizards/potion.png");
        red = Loader.ImageLoader("/lasers/laserRed.png");
        blue = Loader.ImageLoader("/lasers/laserBlue.png");
        green = Loader.ImageLoader("/lasers/laserGreen.png");
        key = Loader.ImageLoader("/key/key.png");

    }
}
