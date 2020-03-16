package Data;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Data {

    public static BufferedImage getImage(String path){
        try {
            BufferedImage image = ImageIO.read(Data.class.getResource(path));
            return image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}