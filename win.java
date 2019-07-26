import java.util.Scanner;
import java.util.InputMismatchException;

public class win {
    public static void menu_win(){
	cleaner.clean();
	
	int choice = 0;
	System.out.println("BRAVO VOUS AVEZ FINI LE JEU !!!");

	while(choice != 1 && choice != 2){
	    System.out.println("1: Quitter le jeu ");
	    System.out.println("2: Rejouez au jeu ");
	    try{
	    Scanner sc1 = new Scanner(System.in);
	    choice = sc1.nextInt();
	    }catch (InputMismatchException e) {
		cleaner.clean();
		System.out.println("Vous n'avez pas mis un nombre !");
		choice = 0;
	    }
	}
	if(choice == 1)
	    {
		cleaner.clean();
		System.exit(0);
	    }
	main.truc();
    }
    
    public static void menu_lose(){
	cleaner.clean();
	int choice = 0;
        System.out.println("dommage vous avez perdu  !!!");
	
        while(choice != 1 && choice != 2){
            System.out.println("1: Quitter le jeu ");
            System.out.println("2: Rejouez au jeu ");
            try{
		Scanner sc1 = new Scanner(System.in);
		choice = sc1.nextInt();
		if(choice == 0 || choice > 2)
		    System.out.println("Vous n'avez pas rentré une bonne valeur");
	    }catch (InputMismatchException e) {
                cleaner.clean();
                System.out.println("Vous n'avez pas mis un nombre !");
                choice = 0;
            }
        }
        if(choice == 1){
	    cleaner.clean();
	    System.exit(0);
	}
        main.truc();
    }
}