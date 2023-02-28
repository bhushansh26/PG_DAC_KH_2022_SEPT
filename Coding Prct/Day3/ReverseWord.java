import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
		
		for(int i =0 ; i<words.length ; i++)
		{
			String nstr ="";
			for(int j=0; j <words[i].length() ; j++)
			{
				char ch = words[i].charAt(j);
				nstr = ch+nstr;	
			}	
			System.out.print(nstr+" ");
		}
    }
}
