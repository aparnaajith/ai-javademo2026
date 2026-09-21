package com.training.quest2;

import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter z for zip, j for jar, r for r");
		String choice = scanner.nextLine();
		IExtractor extractor;
		if (choice.equalsIgnoreCase("z")) {
			extractor = new ZipExtractor(); 
			extractor.extractFiles("examples.zip");
		} else if (choice.equalsIgnoreCase("j")){
			extractor = new JarExtractor(); 
			extractor.extractFiles("examples.zip");

		}else if (choice.equalsIgnoreCase("r")){
			extractor = new RarExtractor(); 
			extractor.extractFiles("examples.zip");

		}else {
			System.out.println("Invalid file type");}
		
		scanner.close();
	}

}
