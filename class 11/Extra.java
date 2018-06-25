import java.io.*;
import java.util.*;
class Extra {
	static ArrayList al =new ArrayList();
	public static void dir(File file) throws IOException {	
	
				File[] arr1 = file.listFiles();
				for(File file1 : arr1) {
				if(file1.isDirectory()){
					dir(file1);
				}
				else{
					System.out.println(file1.getAbsolutePath());
					al.add(file1.getAbsolutePath());
				}
				}
			}
			
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:/Users/Ossn/Desktop/abc.csv");
		f1.createNewFile();
		File f = new File("C:/Users/Ossn/Desktop/Training");
		if(f.isDirectory()){
			dir(f);
		}
		else{

		}
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		Iterator i = al.iterator();
		while(i.hasNext()) {
			bw.write((String)i.next());
			bw.newLine();
		}
		bw.flush();
		
	}
}