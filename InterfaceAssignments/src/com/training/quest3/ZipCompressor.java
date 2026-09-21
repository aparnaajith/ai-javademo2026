package com.training.quest3;

public class ZipCompressor implements IFileCompressor {

	@Override
	public void compressFile(String... files) {
		System.out.println("Compressed as zip file");
		for (String file : files) {
			System.out.println(file);
			
		}

	}

}
