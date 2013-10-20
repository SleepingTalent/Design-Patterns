package com.fs.structural.adapterPattern.media;

import com.fs.structural.adapterPattern.AudioType;
import com.fs.structural.adapterPattern.UnknownAudioTypeException;

public interface MediaPlayer {
    public void play(AudioType audioType, String fileName) throws UnknownAudioTypeException;
}
