package com.training.quest4;


import java.util.Scanner;

public class PlayerDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    

        System.out.println("Enter media player: vlc or windows");
		String choice=scanner.nextLine();
		
		if(choice.equalsIgnoreCase("vlc")) {
		IMediaPlayer player = new VLCMediaPlayer (); 
		player. playVideo(); 
		}
		else if (choice.equalsIgnoreCase("windows")) {

            IMediaPlayer player = new WindowsMediaPlayer11();

            player.playMusic();
            player.playVideo();
            player.downloadMusic();

		 } else {

	            System.out.println("Invalid media player");
	        }

	        scanner.close();

	}

}
