package top.sharehome.adapter.model.media.impl;

import top.sharehome.adapter.model.AudioType;
import top.sharehome.adapter.model.advanced_media.AdvancedMediaPlayer;
import top.sharehome.adapter.model.advanced_media.impl.Mp4Player;
import top.sharehome.adapter.model.advanced_media.impl.VlcPlayer;
import top.sharehome.adapter.model.media.MediaPlayer;

/**
 * MediaPlayer适配器
 *
 * @author AntonyCheng
 */

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(AudioType audioType) {
        if (AudioType.VLC == audioType) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (AudioType.MP4 == audioType) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(AudioType audioType) {
        if (AudioType.VLC == audioType) {
            advancedMusicPlayer.playVlc();
        } else if (AudioType.MP4 == audioType) {
            advancedMusicPlayer.playMp4();
        }
    }
}
