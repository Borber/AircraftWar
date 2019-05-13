package com.borber.toolkits;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * @author BORBER
 */
public class GameUtil {
    private GameUtil(){}
    public static Image getImage(String path){
        BufferedImage bi = null;
        try{
        URL u = GameUtil.class.getClassLoader().getResource(path);
        if(u != null){
            bi = ImageIO.read(u);
        }
        }catch (IOException e){
            e.printStackTrace();
        }
        return bi;
    }
}
