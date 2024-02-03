package top.sharehome.adapter.model.advanced_media.impl;

import top.sharehome.adapter.model.advanced_media.AdvancedMediaPlayer;

/**
 * MP4播放器类
 *
 * @author AntonyCheng
 */

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc() {

    }

    @Override
    public void playMp4() {
        System.out.println("播放MP4");
    }
}
