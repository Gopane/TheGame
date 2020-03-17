package Utils;

import javafx.scene.media.AudioClip;

import java.io.File;

public class Music {


    //添加背景音乐
    public static void playMusic()
    {
        AudioClip ac;
        ac = new AudioClip(new File("src/image/abc.mp3").toURI().toString());
        ac.play();   //开始播放
        ac.setCycleCount(1000);  //设置循环次数
    }
}
