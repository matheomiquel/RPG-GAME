import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class main{

    
    private String name;
    
    public void setName(String name)
    {
        this.name = name;
    }
 
    public String getName()
    {
        return name;
    }
    
    public static void main(String[] args) {
	truc();
    }	
    
    public static void truc(){

	int nbCol = 20;
	int nbLig = 20;
	
	cleaner.clean();
	
	Personnage perso = new Personnage();
	Map worldMap = new Map(nbCol, nbLig);
	
	Scanner sc1 = new Scanner(System.in);
	
        while(true){	    
	    cleaner.clean();
            System.out.println("Bougez avec z,q,s,d!");
            System.out.println();
	    worldMap.actualiser();
	    
	    worldMap.placer(perso.getXPerso(), perso.getYPerso(), 'P');
	    
	    worldMap.afficher();
	    System.out.println("vous avez: " + perso.getHp() + "hp");
	    if(perso.getHp() == 0)
		System.out.println("Vous n'avez plus d'HP");
	    String move = sc1.nextLine();
	    perso.deplacerPersonnage(move, nbCol, nbLig);
	}
    }
}