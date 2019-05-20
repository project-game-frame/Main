import java.util.Scanner;

/*
Name: Text Based
Description: Is a text based game
*/

public class TextBased extends Game {
	//	**Feilds**
	private static final long serialVersionUID = 1L;
	Scanner kboard=new Scanner(System.in);
	String userInput;

	
	//	**Methods**
	
	// Public methods
	
	// Returns name
	@Override
	public String getName() {
		return "Text Based";
	}

	// Runs this game
	public void run() {
		System.out.println("\f");
		System.out.println("Welcome to my GameFrame, why don't you stay awhile?");
		userInput=kboard.next();
		if (userInput.equalsIgnoreCase("no")) {
			System.out.println("This message will self destruct");
		}
		else {
			System.out.println("As you can see, here you proceed when you press a button");
			userInput=kboard.next();
			System.out.println("In the future you will be given the ability to change settings and other such");
			userInput=kboard.next();
			System.out.println("Currently this is a dead end in good style as it shows the possibility of more games while not creating more games");
			userInput=kboard.next();
			System.out.println("Clever no?");
			userInput=kboard.next();
			if (userInput.equalsIgnoreCase("no")) {
				System.out.println("This message will self destruct");
			}
			else if (userInput.equalsIgnoreCase("Yes")||userInput.equalsIgnoreCase("yes!")) {
				System.out.println("Thank you!");
			}
		}
	}
}
