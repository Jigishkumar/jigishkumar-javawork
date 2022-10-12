package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {

	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("upasana.txt");//open
			String content="Welcome to the world of java";
			w.write(content);//does the writing
			w.close();//close the file
			System.out.println("file written successfully");
		}
		catch (IOException e) {
			//TODO AUTO-generated catch block
			e.printStackTrace();
		}

	}

}
