import java.io.IOException;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Allumette {
    
    public static boolean menu_allumette(){
	String joueur1 = null;
	String joueur2 = null;
	String input = null;
	String joueur = null;
        int number = 0;
	int i = 0;
	int allumettes = 20 + (int)(Math.random() * ((30 - 20) + 1));
	int random = 0;
	int idk = 0;
	boolean truc = true;
	cleaner.clean();

	
	

	while(number != 1 && number != 2){
	    try {
		System.out.println("Bienvenue dans le jeu des allumettes.");
		System.out.println("mettez 1 pour jouer seul et 2 pour jouer contre un Humain");
		BufferedReader IA_Human = new BufferedReader(new InputStreamReader(System.in));
		input = IA_Human.readLine();
		number = Integer.parseInt(input);
	    } catch (NumberFormatException ex) {
		cleaner.clean();
		System.out.println("Vous n'avez pas mis un nombre !");
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
	
	if(number == 2){
	    cleaner.clean();
	    System.out.println("Nom du joueur 1");
	    BufferedReader player1 = new BufferedReader(new InputStreamReader(System.in));
	    try{
		joueur1 = player1.readLine();
	    }catch (IOException e) {
		e.printStackTrace();
	    }
	    cleaner.clean();
	    System.out.println("nom du joueur 2");
	    BufferedReader player2 = new BufferedReader(new InputStreamReader(System.in));
	    try {
		joueur2 = player2.readLine();
	    }catch (IOException e) {
		e.printStackTrace();
	    }
	    
	    System.out.println(joueur1 + " VS " + joueur2);
	    while(allumettes > 0){
		truc = true;
		
		if(number == 2){
		    try {
			cleaner.clean();
			System.out.println("il reste : " + allumettes + " allumettes");
			if((i % 2) == 0)
			    System.out.println("au tour de : " + joueur1);
			else
			    System.out.println("au tour de : " + joueur2);
			System.out.println("combien d'allumettes voulez-vous enlever (1 minimum 3 maximum).");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			input = bufferedReader.readLine();
			idk = Integer.parseInt(input);
		    } catch (NumberFormatException ex) {
			System.out.println("Vous n'avez pas mis un nombre !");
			System.out.println("retour au debut du jeu");
			break;
		    } catch (IOException e) {
			e.printStackTrace();
		    }
		    if(idk > 3){
			System.out.println("Valeur rentrer invalide: " + allumettes);
		    }
		    else{
			i++;
			allumettes = allumettes - idk;
		    }
		}
	    }
	    if((i % 2) == 1)
		{
		    cleaner.clean();
		    System.out.println(joueur1 + " a gagner cette partie!!!");
		}
	    else{
		cleaner.clean();
		System.out.println(joueur2 + " a gagner cette partie!!!");
	    }
	    System.out.println();
	}
	if(number == 1){
	    cleaner.clean();

	    while(allumettes > 0){
		truc = true;
		try{
		    number = 0;
		    System.out.println("il reste : " + allumettes + " allumettes");
		    System.out.println("combien d'allumettes voulez-vous enlever (1 minimum 3 maximum).");
		    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		    input = bufferedReader.readLine();
		    number = Integer.parseInt(input);
		} catch (NumberFormatException ex) {
		    System.out.println("Vous n'avez pas mis un nombre !");
		    try {
                        Thread.sleep(500);
                    }catch(InterruptedException e){}
		    truc = false;
		} catch (IOException e) {
		    e.printStackTrace();
		}
		if(number > 3 || number == 0){
		    cleaner.clean();
		    System.out.println("Valeur rentrer invalide: " + number);
		    System.out.println();
		    truc = false;
		    
		}
		else{
		    i++;
		    allumettes = allumettes - number;
		}
		if(allumettes <= 0 || number == 2048 ){
		    cleaner.clean();
		    System.out.println("Bravo  vous avez reussi ce jeu !!!"); 
		    System.out.println();
		    return true;
		}
		if (truc)
		    if((allumettes % 4) == 0){
			random = 1 + (int)(Math.random() * ((3 - 1) + 1));
			allumettes = allumettes - random;
		    }
		    else
			{
			    while((random - allumettes) % 4 != 0)
				random = 1 + (int)(Math.random() * ((3 - 1) + 1));
			    allumettes = allumettes - random;
			}
		if(truc)
		    {
			cleaner.clean();
			System.out.println("L\'IA à enlever: " + random + " allumettes");
		    }
		if(allumettes <= 0){
		    cleaner.clean();
		    System.out.println();
		    win.menu_lose();
		}
	    }
	    
	}
	return true;
    }
}