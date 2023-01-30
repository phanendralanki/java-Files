import java.io.File;
import java.io.IOException;
import java.util.*;
public class FileHandling{
	public static void main(String[] args)throws IOException{

/*
		//To check the file existence 
		System.out.println(f.exists());		

		//File creation
		File f = new File("D:\\java\\core Java\\java files\\resume.txt");
		//File f = new File("D:/java/core Java/java files");
		//System.out.println(f.createNewFile());

		//file deletion
		//System.out.println(f.delete());
		
		*/
	
/*
		File f = new File("D:\\java\\core Java\\java files\\resume.txt");
		if(f.exists())
			f.delete();
		System.out.println(f.createNewFile());
*/
		//file hiding
/*
		File f = new File("D:\\java\\core Java\\java files\\resume.txt");
		System.out.println(f.isHidden());
		System.out.println(f.canWrite()); //read only files checking 
		f.setWritable(true); //to change read only to write mode
*/

/*
		//folder creation - mkdir(for single folder), mkdirs(for more than one folder)
		File f = new File("D:\\java\\core Java\\java files\\resume");
		System.out.println(f.mkdir());
		System.out.println(f.delete());
*/

		File f = new File("D:\\java\\core Java\\java files");
		System.out.println(Arrays.toString(f.list()));
		System.out.println(Arrays.toString(f.listFiles()));
	}
}	


//Absolute path(full path - entire location)
//Relative path - ./fileName

//seperators => / \