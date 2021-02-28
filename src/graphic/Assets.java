
package graphic;

import graphic.Loader;
import java.awt.image.BufferedImage;

public class Assets {
    
    public static BufferedImage player;
    
    public static void init()
    {
        player = Loader.ImageLoader("/wizards/mago.png");
    }
}
