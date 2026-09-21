package com.training.quest2;

public class RarExtractor implements IExtractor {

	@Override
	public void extractFiles(String filename) {
		System.out.println(
	            "Extracting from rar => files as .txt, as .jpeg, as .doc files"
	        );
	}

}
