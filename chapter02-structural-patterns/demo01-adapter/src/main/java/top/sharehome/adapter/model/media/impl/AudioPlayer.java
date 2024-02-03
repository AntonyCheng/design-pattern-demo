package top.sharehome.adapter.model.media.impl;

import top.sharehome.adapter.model.AudioType;
import top.sharehome.adapter.model.media.MediaPlayer;

/**
 * MP3播放器类
 *
 * @author AntonyCheng
 */

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(AudioType audioType) {
        //播放 mp3 音乐文件的内置支持
        if (AudioType.MP3 == audioType) {
            System.out.println("播放MP3");
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (AudioType.VLC == audioType || AudioType.MP4 == audioType) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType);
        }
        // 不支持的音频文件提示
        else {
            System.out.println("无效的音频文件...");
        }
    }
}
