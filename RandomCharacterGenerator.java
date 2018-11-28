import java.util.Scanner;
public class RandomCharacterGenerator{

	public static void main(String[] args) throws InterruptedException{
                Scanner in = new Scanner(System.in);
                System.out.print("How many characters do you want? : ");
                int longOfChars = in.nextInt();
                System.out.println();
		randomGenerator(longOfChars);
	}

	public static void randomGenerator (int longOfChars) throws InterruptedException{
		for(int j = 0; j < longOfChars; j++){
			for(int i = 0; i < 100; i++){

				System.out.print((char)(Math.random()*50+49));
				Thread.sleep(10);
				if(i < 99){
				System.out.print("\b");
				}
			}
		}
		System.out.println();
	}

}
