package Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
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

    public static ImageIcon getResouce(){
       //ImageIcon imageIcon = new ()
        return null;
    }

}