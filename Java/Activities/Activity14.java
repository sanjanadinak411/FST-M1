package activitiies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String text=null;
		String text1=null;
		String input="hgg";
		
		File file = new File("src/main/resources/newfile.txt");
		boolean fStatus = file.createNewFile();
		
		String newtext=FileUtils.readFileToString(file, text);
		System.out.println("Data in new file: " + newtext);
		
		File destDir = new File("src/main/resources/destDir");
		FileUtils.copyFileToDirectory(file, destDir);
		
		File newfile = new File("src/main/resources/destDir/newfile.txt");
		String dirtext=FileUtils.readFileToString(newfile, text1);
		
		System.out.println("Data in new file: " + dirtext);
		
	
		
	}
	

}
