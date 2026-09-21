package com.training.quest4;

public abstract class WindowsMediaPlayer implements IMediaPlayer{

	    @Override
	    public void playMusic() {
	        System.out.println("Play mp3 files");
	    }

	    @Override
	    public void playVideo() {
	        System.out.println("Play mp4 files");
	    }

}
