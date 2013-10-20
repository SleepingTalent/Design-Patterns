package com.fs.structural.adapterPattern.media;

public class VlcPlayer implements AdvancedMediaPlayer {

    MediaHandler mediaHandler;

    public VlcPlayer(MediaHandler mediaHandler) {
        this.mediaHandler = mediaHandler;
    }

    @Override
    public void playMedia(String fileName) {
       mediaHandler.playVlc(fileName);
    }
}
