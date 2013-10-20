package com.fs.structural.adapterPattern;

import com.fs.common.BaseUnitTest;
import com.fs.structural.adapterPattern.media.MediaHandler;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class AudioPlayerTest extends BaseUnitTest{

    @InjectMocks
    AudioPlayer audioPlayer;

    @Mock
    MediaHandler mediaHandler;

    @Before
    public void setUp() {
        //audioPlayer = new AudioPlayer();

        /*AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi"); */
    }

    @Test(expected = UnknownAudioTypeException.class)
    public void play_throwsExpection_whenAudioTypeIsNull() throws UnknownAudioTypeException {
        audioPlayer.play(null, "one.aiff");
    }

    @Test(expected = UnknownAudioTypeException.class)
    public void play_throwsExpection_whenAudioTypeIsNotExpected() throws UnknownAudioTypeException {
        audioPlayer.play(AudioType.UKNOWN, "one.aiff");
    }

    @Test
    public void play_callsExpectedMethod_whenMp3Played() throws UnknownAudioTypeException {
        audioPlayer.play(AudioType.MP3, "one.mp3");
        verify(mediaHandler, times(1)).playMp3(eq("one.mp3"));
    }

    @Test
    public void play_callsExpectedMethod_whenMp4Played() throws UnknownAudioTypeException {
        audioPlayer.play(AudioType.MP4, "one.mp4");
        verify(mediaHandler, times(1)).playMp4(eq("one.mp4"));
    }

    @Test
    public void play_callsExpectedMethod_whenVlcPlayed() throws UnknownAudioTypeException {
        audioPlayer.play(AudioType.VLC, "one.vlc");
        verify(mediaHandler, times(1)).playVlc(eq("one.vlc"));
    }
}
