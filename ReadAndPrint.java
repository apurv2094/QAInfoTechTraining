import java.io.*;
public class ReadAndPrint {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\apurv\\Desktop\\new_file.txt");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    String st;
	    while ((st = br.readLine()) != null)
	    	System.out.println(st);
	}
}
