import java.util.Scanner;
class Words {
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a sentence");
   String Sentence = s.nextLine();
   int words=1;
   int length = Sentence.length();
    for(int i=0;i<length;i++) {
		if(Sentence.charAt(i)==' ') {
			words++;
			
		}
	}
   System.out.println("number of words in this sentence are "+words);	
 }
}