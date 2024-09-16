package org.example.factory.audioplayerexample;

public abstract class AudioPlayer {
    private int volume;
    private double playBackRate;

    public AudioPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    public abstract void setVolume(int volume);
    public abstract int getVolume();
    public abstract double getPlayBackRate();


    public abstract MediaFormat supportsType();
}