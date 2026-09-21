package com.training.quest3;

public class RarCompressor implements IFileCompressor {

	@Override
	public void compressFile(String... files) {
		System.out.println("Compressed as rar file");
		for (String file : files) {
			System.out.println(file);
			
		}

	}

}
