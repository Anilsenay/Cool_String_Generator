import java.util.Scanner;
public class RandomCharacterGenerator{

	public static void main(String[] args) throws InterruptedException{
                Scanner in = new Scanner(System.in);
                System.out.print("What would you like to do?\n"
                + "1- Generate random characters \n"
                + "2- Generate an input string with a cool way ;D \n"
                + "Write your choice (1 or 2) : ");
		int choice = Integer.parseInt(in.nextLine());
		if(choice == 1)	{
                	System.out.print("How many characters do you want? : ");
                	int longOfChars = in.nextInt();
			System.out.print("Select the speed (1 = slow, 2 = normal, 3 = faster) : ");
			int speed = in.nextInt();
                	System.out.println();
			randomGenerator(longOfChars, speed);
			System.out.println();
			stringGenerator("CODED BY ANIL ŞENAY");
		}
		if(choice == 2) {
			System.out.print("Which string do you want to print as a cool way? : ");
			String str = in.nextLine();
			System.out.println();
			stringGenerator(str);
			System.out.println();
			stringGenerator("CODED BY ANIL ŞENAY");
		}
	}

	public static void randomGenerator (int longOfChars, int speed) throws InterruptedException{
		for(int j = 0; j < longOfChars; j++){
			for(int i = 0; i < 100; i++){

				System.out.print((char)(Math.random()*50+49));
				Thread.sleep((4-speed) * (long)2.5);
				if(i < 99){
				System.out.print("\b");
				}
			}
		}
		System.out.println();
	}
        public static void stringGenerator (String str) throws InterruptedException{
                for(int j = 0; j < str.length(); j++){
                        for(int i = 0; i < 100; i++){
				if(i<99){
                                System.out.print((char)(Math.random()*50+49));
                                Thread.sleep(2);
                                }
				if(i < 99){
                                System.out.print("\b");
                                }
				if(i == 99)
				System.out.print(str.charAt(j));
                        }
                }
                System.out.println();
        }

}
