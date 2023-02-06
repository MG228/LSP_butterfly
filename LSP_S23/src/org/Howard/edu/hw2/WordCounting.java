/**
* Name: Maya Griffin
*/

package org.Howard.edu.hw2;

import java.nio.file.*;;


public class WordCounting {
	public static String readFileAsString(String fileName) throws Exception
	{
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(null)));
		return data;
	}
	
	public static void main(String[] args) throws Exception
	{ 
		String data = readFileAsString("C:\\User\\maya3\\Desktop\\name");
	}
	

}
