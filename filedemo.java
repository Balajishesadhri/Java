package Balaji;

import java.io.IOException;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class filedemo {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/balaji/Downloads/Balaji.txt");
//        //  System.out.print(file_obj.createNewFile()); // to create file
//	//	System.out.println(file_obj.exists());
//	//	System.out.println(file_obj.lastModified());
//		Date dd = new Date(file.lastModified());
//	//	System.out.println(dd);
//	//	System.out.println(dd.getDay());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		System.out.println(file.getName());
//		System.out.println(file.mkdir()); // to create file
//		System.out.println(file.isDirectory());
//		// System.out.println(file.mkdirs()); // to create sub folders
		
//		
//	FileWriter pen = new FileWriter(file,true);
//		pen.write("hi \n");
//		pen.write("I love u");
//		pen.flush();
//		pen.close();
//		
//		
FileReader fr = new FileReader(file);

//System.out.println(fr.read());
int i = fr.read();
while(i!=-1){

char c = (char)i;
System.out.print(c);
i=fr.read();
}
	}

}
