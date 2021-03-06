import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {

		// http://textfiles.com/100/captmidn.txt
		
		File file = new File("/Users/cheri/Desktop/captmidn.txt");
		Scanner scan = new Scanner(file);
		
// This reads in lines of a document.		
		
//		while(scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}
		
		
// Or this exports those lines into a new file.
		
		String fileContent = "This is a new file created today.  ";
		while(scan.hasNextLine()) {
			fileContent= fileContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("/Users/cheri/Desktop/newfile.txt");
		writer.write(fileContent);
		writer.close();
	}

}
