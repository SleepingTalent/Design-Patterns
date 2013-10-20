package com.fs.structural.adapterPattern.media;

public class Mp4Player implements AdvancedMediaPlayer {

    MediaHandler mediaHandler;

    public Mp4Player(MediaHandler mediaHandler) {
        this.mediaHandler = mediaHandler;
    }

    @Override
    public void playMedia(String fileName) {
        mediaHandler.playMp4(fileName);
    }
}
