public class Personnage {
     
    private String nom;     
    private int hp;
    private int xPerso;
    private int yPerso;
    
    // Constructeur
     
    public Personnage(){
	
        this.nom = "";
	
	this.hp = 320; 
        
	xPerso = 0;
        yPerso = 0;
    }
    
    // Getter
     
    public String getNom() {
         
        return this.nom;
    }
     
    public int getHp() {
         
        return this.hp;
    }
     
    public int getXPerso() {
         
        return this.xPerso;
    }
     
    public int getYPerso() {
         
        return this.yPerso;
    }
     
    // Setter
     
    public void setNom(String n) {
         
        this.nom = n;
    }
     
    public  void setHp(int hp) {
	
        this.hp = hp;
    }
     
    public void setXPerso(int newX) {
         
        this.xPerso = newX;
    }
     
    public void setYPerso(int newY) {
	
        this.yPerso = newY;
    }
     
    public void deplacerPersonnage(String direction,int nbCol, int nbLig ) {
	
	switch(direction) {         
	case "heal":
	    this.hp = hp + 200;
	    break;
        case "d":
	    if(this.xPerso < (nbCol - 1))
		{
		    if(this.hp == 0) {
			System.out.println("Vous avez perdu");
			win.menu_lose();
		    }
		    this.hp = hp - 10;
		    this.xPerso++;
		    if(this.hp == 0) 
			System.out.println("Vous avez perdu");
		}
	    else{
		System.out.println("Vous tenter de sortir des limites de la map !!!");
		try {
		    Thread.sleep(500);
		}catch(InterruptedException e){}
	    }
	    
	    break;
	case "q":
	    if(this.xPerso != 0)
                {
		    if(this.hp == 0) {
			System.out.println("Vous avez perdu");
			win.menu_lose();
		    }
                    this.hp = hp - 10;
                    this.xPerso--;
		    if(this.hp == 0)
			System.out.println("Vous avez perdu");
		}
            else{
                System.out.println("Vous tenter de sortir des limites de la map !!!");
		try {
		    Thread.sleep(500);
		}catch(InterruptedException e){}
	    }
	    break;
	    
	    
	    
        case "s":
	    
	    if(this.yPerso < (nbLig - 1))
                {
                    if(this.hp == 0) {
		      System.out.println("Vous avez perdu");
		      win.menu_lose();
		      }
                    this.hp = hp - 10;
                    this.yPerso++;
                    if(this.hp == 0)
                        System.out.println("Vous avez perdu");
		    System.out.println(yPerso);
                }
            else
		{
		    System.out.println("Vous tenter de sortir des limites de la map !!!");
		    try {
			Thread.sleep(500);
		    }catch(InterruptedException e){}
		}
	    break;
	    
	    
	case "z":
	    if(this.yPerso != 0)
		{
		    if(this.hp == 0) {
                        System.out.println("Vous avez perdu");
                        win.menu_lose();
		    }
                    this.hp = hp - 10;
                    this.yPerso--;
                    if(this.hp == 0)
                        System.out.println("Vous avez perdu");
                }
            else{
                System.out.println("Vous tenter de sortir des limites de la map !!!");
		try {
		    Thread.sleep(500);
		}catch(InterruptedException e){}
            }
            break;
	    
	case "exit":
	    
	    cleaner.clean();
	    System.exit(0);
	default:	    
	    
	    if(hp != 0)
		{
		    System.out.println("Ceci n'est pas une direction valide.");
		    try {
			Thread.sleep(500);
		    }catch(InterruptedException e){}
		}
	    else
		win.menu_lose();
	    break;	    
        }
    }
}