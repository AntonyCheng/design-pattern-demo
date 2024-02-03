package top.sharehome.adapter.model.media;

import top.sharehome.adapter.model.AudioType;

/**
 * 媒体播放器接口
 *
 * @author AntonyCheng
 */

public interface MediaPlayer {

    /**
     * 播放音频（默认MP3）
     */
    void play(AudioType audioType);

}
