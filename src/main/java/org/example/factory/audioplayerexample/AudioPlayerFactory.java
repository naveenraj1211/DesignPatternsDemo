package org.example.factory.audioplayerexample;

public class AudioPlayerFactory {

    public static AudioPlayer createAudioPlayer(MediaFormat mediaFormat, int volume, double playBackRate) {
        return switch (mediaFormat)
        {
            case MP3 -> new MP3Player(volume, playBackRate);
            case WAV -> new WAVPlayer(volume, playBackRate);
            case FLAC -> new FLACPlayer(volume, playBackRate);
        };
    }
}