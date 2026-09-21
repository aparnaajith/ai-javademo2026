package com.training.quest3;

public class JarCompressor implements IFileCompressor {

	@Override
	public void compressFile(String... files) {
		System.out.println("Compressed as jar file");
		for (String file : files) {
			System.out.println(file);
			
		}

	}

}
