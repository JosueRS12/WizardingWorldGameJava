
package graphic;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Loader {
    
    public static BufferedImage ImageLoader(String path){
        try {
            return ImageIO.read(Loader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
