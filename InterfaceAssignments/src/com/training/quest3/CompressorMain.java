package com.training.quest3;

public class CompressorMain {

	public static void main(String[] args) {

		IFileCompressor filecompressor;
		filecompressor=new ZipCompressor();
		filecompressor.compressFile(
				"file1.txt",
				"file2.txt",
				"image.jpeg"
		);
		System.out.println();
		filecompressor=new JarCompressor();
		filecompressor.compressFile(
				 "Student.class",
	             "Employee.class",
	             "Product.class"
		);
		System.out.println();
		filecompressor=new RarCompressor();
		filecompressor.compressFile(
				"document.txt",
                "photo.jpeg",
                "resume.doc"
		);
		System.out.println();
	}

}
