package com.fs.structural.adapterPattern;

import com.fs.structural.adapterPattern.media.MediaHandler;
import com.fs.structural.adapterPattern.media.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    MediaHandler mediaHandler;

    public AudioPlayer(MediaHandler mediaHandler) {
        this.mediaHandler = mediaHandler;
    }

    @Override
    public void play(AudioType audioType, String fileName) throws UnknownAudioTypeException {

        if(audioType == null) {
            throw new UnknownAudioTypeException();
        }

        //inbuilt support to play mp3 music files
        if(audioType.equals(AudioType.MP3)){
            mediaHandler.playMp3(fileName);
        }
        //mediaAdapter is providing support to play other file formats
        else if(audioType.equals(AudioType.VLC) || audioType.equals(AudioType.MP4)){
            mediaAdapter = new MediaAdapter(mediaHandler);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            throw new UnknownAudioTypeException();
        }
    }
}
