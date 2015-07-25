import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printTextFile("introText.txt");

		System.out.println("Now, what's your name again?");
		Scanner scanName = new Scanner(System.in);
		String userName = scanName.nextLine();
		
		printTextFile("bellIntro.txt");
		
		int health = 10;
		
		
		Player newPlayer = new Player(10, 5, 5, 5);
		
		System.out.println((char)27+"[01;31m This text is red."+(char)27+"[00;00m");
	    System.out.println((char)27+"[01;32m This text is green."+(char)27+"[00;00m");
	}


	
	public static void printTextFile(String txtHere) {

		File textFile = new File(txtHere);
		try{
			Scanner scanFile = new Scanner(textFile);

			while(scanFile.hasNextLine()){
				String newString = scanFile.nextLine();
				System.out.println(newString);

			}


		}

		catch (FileNotFoundException e){
			System.out.println("You dun goofed");
		}


	}
}