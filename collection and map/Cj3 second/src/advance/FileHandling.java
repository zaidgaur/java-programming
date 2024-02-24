package advance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
   
      File file=new File("D:\\zaid\\abc.txt");
   
    try {
		FileWriter fw=new FileWriter("D:\\zaid\\abc.txt");
		fw.write(" hey advance topic is complete");
		fw.flush();
		System.out.println("write operation completed ");
	} catch (IOException e) {
		e.printStackTrace();
	}
    
    try {
		FileWriter fw=new FileWriter(file);
		fw.write(" hey advance topic is complete");
		fw.flush();
		System.out.println("write operation completed ");
	} catch (IOException e) {
		e.printStackTrace();
	}
    
         
	}

}
