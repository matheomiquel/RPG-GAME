//import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class PlusMinus {
    
    public static boolean menu_PlusMinus(){
	cleaner.clean();
	System.out.println("bienvenur dans le PlusMinus game");
	int i = 0;
	int random = 0 + (int)(Math.random() * ((100 - 0) + 1));
	return (game(i, random));
	
    }

    public static boolean game( int i,int random){
	
	String input = null;
	int number = 0;
	do{
	    try {
		
		System.out.println("veuillez rentrer une valeur entre 0 et 100");
		System.out.println("tour: " + (i + 1));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		input = bufferedReader.readLine();
		number = Integer.parseInt(input);
		System.out.println();
		if(number <= 100 || number == 2048 )
		    {
			i++;
			if(number == 2048)
			    {
				cleaner.clean();
				System.out.println("vous avez gagner en trichant bravo");
				System.out.println();
				return true;
			    }
			else if(number < random)
			    {
				System.out.println("Higher");
				try {
				    Thread.sleep(1000);
				}catch(InterruptedException e){}
			    }
			else if(number > random)
			    {
				System.out.println("Lower");
				try {
				    Thread.sleep(1000);
				}catch(InterruptedException e){}
			    }
			
			else
			    {		
				cleaner.clean();
				System.out.println("vous avez gagner en " + i + " coup, bien joué");
				System.out.println();
				return true;
			    }
		    }
		else{
		    System.out.println("Valeur rentrée incorect ");
		    try {
			Thread.sleep(1000);
		    }catch(InterruptedException e){}
		    
		}
		System.out.println("");
		
		if(i == 10){
		    cleaner.clean();
		    System.out.println("vous avez dépassé la limite de 10 coup. Vous avez perdu");
		    win.menu_lose();
		}
	    } catch (NumberFormatException ex) {
		System.out.println("Vous n'avez pas mis un nombre !");
		try {
		    Thread.sleep(1000);
		}catch(InterruptedException e){}
		//System.out.println("tour: " + i);
		
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	    
	    cleaner.clean();
	
	}while(i < 10);
	return true;
    }
    
}