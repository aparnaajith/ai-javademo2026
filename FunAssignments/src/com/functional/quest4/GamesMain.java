package com.functional.quest4;

public class GamesMain {

	public static void main(String[] args) {

		IGames indoorGames = () -> {
			System.out.println("----INDOOR GAMES------");
			System.out.println("Cricket");
			System.out.println("Football");
		};
		indoorGames.showGames();
		IGames outdoorGames = () -> {
			System.out.println("----INDOOR GAMES------");
			System.out.println("Chess");
			System.out.println("Carroms");
		};
		System.out.println();
		outdoorGames.showGames();
	}
}