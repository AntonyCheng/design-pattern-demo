package top.sharehome.adapter;

import top.sharehome.adapter.model.AudioType;
import top.sharehome.adapter.model.media.impl.AudioPlayer;

/**
 * 适配器设计模式
 *
 * @author AntonyCheng
 */

public class AdapterPatternDemo {

    /**
     * 方法入口
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(AudioType.MP3);
        audioPlayer.play(AudioType.VLC);
        audioPlayer.play(AudioType.MP4);
    }

}
