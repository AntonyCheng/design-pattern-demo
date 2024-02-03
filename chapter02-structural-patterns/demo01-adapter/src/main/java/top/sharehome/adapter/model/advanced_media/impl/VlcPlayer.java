package top.sharehome.adapter.model.advanced_media.impl;

import top.sharehome.adapter.model.advanced_media.AdvancedMediaPlayer;

/**
 * VLC播放器类
 *
 * @author AntonyCheng
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc() {
        System.out.println("播放VLC");
    }

    @Override
    public void playMp4() {
    }
}
