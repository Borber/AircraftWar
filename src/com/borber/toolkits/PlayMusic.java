package com.borber.toolkits;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName PlayMusic.java
 * @Description TODO
 * @createTime 2019年05月22日 12:56
 */
public class PlayMusic {
    public static void play(String filepath){
        File file = new File(filepath);
        AudioClip audioClip = null;
        try {
            audioClip = Applet.newAudioClip(file.toURL());
            audioClip.play();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void playloop(String filepath){
        File file = new File(filepath);
        AudioClip audioClip = null;
        try {
            audioClip = Applet.newAudioClip(file.toURL());
            audioClip.loop();
            Thread.sleep(5000);
        } catch (MalformedURLException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
