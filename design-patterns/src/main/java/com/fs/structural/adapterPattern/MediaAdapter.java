package com.fs.structural.adapterPattern;

import com.fs.structural.adapterPattern.media.*;

public class MediaAdapter implements MediaPlayer {

    MediaHandler mediaHandler;

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(MediaHandler mediaHandler) {
        this.mediaHandler = mediaHandler;
    }

    @Override
    public void play(AudioType audioType, String fileName) {
            advancedMusicPlayer = getAdvancedMediaPlayer(audioType);
            advancedMusicPlayer.playMedia(fileName);
    }

    private AdvancedMediaPlayer getAdvancedMediaPlayer(AudioType audioType) {
        if(audioType.equals(AudioType.VLC) ){
            return new VlcPlayer(mediaHandler);
        } else {
            return new Mp4Player(mediaHandler);
        }
    }
}
