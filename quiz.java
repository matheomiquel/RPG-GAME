import java.util.Scanner;
public class quiz{
    public static boolean menu_quiz(){
	Scanner s = new Scanner(System.in);
	String answer;

	cleaner.clean();

	System.out.println("Bienvenue dans le quiz");


	System.out.println("la réponse a LA  question est ?");
	answer = s.nextLine();
	cleaner.clean();
	if(answer.contains("42")){
	    System.out.println("Correct");
	    try {
		Thread.sleep(500);
	    }catch(InterruptedException e){}
	    
	}
	else
	    {
		System.out.println("Wrong");
		win.menu_lose();
	    }

	System.out.println("Dans quel film la trouve t-on ?");
	answer = s.nextLine();
	cleaner.clean();
	if(answer.contains("H2G2")){
	    System.out.println("Correct");
	    try {
		Thread.sleep(500);
	    }catch(InterruptedException e){}
	}
	else
	    {
		try {
		    Thread.sleep(500);
		}catch(InterruptedException e){}
		
		win.menu_lose();
	    }
	
	
	System.out.println("Ce film est il inspirer de livres  ?");
	answer = s.nextLine();
	cleaner.clean();
	if(answer.contains("oui") || answer.contains("y")){
	    System.out.println("Correct");
	}
	else
	    {
		try {
		    Thread.sleep(500);
		}catch(InterruptedException e){}
		
		win.menu_lose();
	    }
		
	System.out.println("C'est une trilogie en combien de volumes ?");
	answer = s.nextLine();
	cleaner.clean();
	if(answer.contains("5")){
	    System.out.println("Correct");
	}
	else
	    {
		try {
		    Thread.sleep(500);
		}catch(InterruptedException e){}
		cleaner.clean();
		win.menu_lose();
	    }
	System.out.println("Bravo  vous avez reussi ce jeu !!!");
	return true;
    }
}