package com.training.quest2;

public class JarExtractor implements IExtractor {

	@Override
	public void extractFiles(String filename) {
		System.out.println(
	            "Extracting from jar => files as .txt, as .jpeg, as .doc files"
	        );
	}

}
