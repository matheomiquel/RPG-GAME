public class Map {
    
    // Variable
    
    
    private int nbCol;
    private int nbLig;
    private boolean key1;
    private boolean key2;
    private boolean key3;
    


    private boolean win_allu;
    private boolean win_plusminus;
    private boolean win_quiz;

    // GAME

    private int game_allumette_ligne = 3;
    private int game_allumette_colone = 10;
    
    private int game_plusminus_ligne = 9;
    private int game_plusminus_colone = 3;
    
    private int game_quiz_ligne = 3;
    private int game_quiz_colone = 13;

    
    
    //KEY

    private int key_allumette_ligne = 8;
    private int key_allumette_colone = 5;
    
    private int key_plusminus_ligne = 11;
    private int key_plusminus_colone = 2;
    
    private int key_quiz_ligne = 8;
    private int key_quiz_colone = 10;
    


    public void setKey(boolean key)
    {
        this.key1 = key1;
    }
 
    public boolean getKey()
    {
        return key1;
    }


    private char [][] map;
    // Constructeur
    
    public Map(int c, int l) {
	
	this.nbLig = l;
	this.nbCol = c;
        
	map = new char[nbLig][nbCol];
	
    }
    
    
    
    public char getCase(int l, int c) {
	
        return map[l][c];
         
    }
    
    
    
    public void afficher() {
	
        for(int i = 0; i < nbLig ; i++) {
	    
            for(int j = 0 ; j < nbCol ; j++) {
		
                System.out.print(" | " + map[i][j]);
            }
	    
            System.out.println(" | ");
        }
	
        System.out.println();
	
    }
    

    public void placer(int c, int l, char t) {
		
	//jeu Allumettes
	
	if(c == key_allumette_colone && l == key_allumette_ligne)
	    this.key1 = true;

	
	
	if(c == game_allumette_colone && l == game_allumette_ligne && key1 && !win_allu){
	    win_allu = Allumette.menu_allumette();
	    if(win_allu == false)
		System.exit(0);
	}
	else if(c == game_allumette_colone && l == game_allumette_ligne && !key1)
	    System.out.println("vous n'avez pas la clé pour jouer a ce jeu");
	
	

	
	//jeu plusminus
	
	
	if(c == key_plusminus_colone && l == key_plusminus_ligne)
            this.key2 = true;
	
	
	if(c == game_plusminus_colone && l == game_plusminus_ligne && key2 && !win_plusminus){
	    win_plusminus = PlusMinus.menu_PlusMinus();
	    if(win_plusminus == false)
		System.exit(0);
	}
	else if(c == game_plusminus_colone && l == game_plusminus_ligne && !key2)
	    System.out.println("vous n'avez pas la clé pour jouer a ce jeu");
	
	
	// jeu quiz

	if(c == key_quiz_colone && l == key_quiz_ligne)
            this.key3 = true;
	
	
	if(c == game_quiz_colone && l == game_quiz_ligne && key3 && !win_quiz){
	    win_quiz = quiz.menu_quiz();
	    if(win_quiz == false)
		System.exit(0);
	}
	else if(c == game_quiz_colone && l == game_quiz_ligne && !key3)
	    System.out.println("vous n'avez pas la clé pour jouer a ce jeu");

	if(win_plusminus && win_allu && win_quiz)
	    win.menu_win();
	map[l][c] = t;
    }
    public void actualiser() {
	
	for(int i = 0; i < nbLig ; i++) {
	    for(int j = 0 ; j < nbCol ; j++) {
		
		map[i][j] = ' ';
		//game

		if(i == game_allumette_ligne && j == game_allumette_colone && !win_allu)
		    map[i][j] = 'A';
		if(i == game_plusminus_ligne && j == game_plusminus_colone && !win_plusminus)
		    map[i][j] = 'M';
		if(i == game_quiz_ligne && j == game_quiz_colone && !win_quiz)
		    map[i][j] = 'Q';
		
		   

		// keys
		if(i == key_allumette_ligne && j == key_allumette_colone && !key1)
		    map[i][j] = 'a';
		if(i == key_plusminus_ligne && j == key_plusminus_colone && !key2)
		    map[i][j] = 'm';
		if(i == key_quiz_ligne && j == key_quiz_colone && !key3)
		    map[i][j] = 'q';
		
	    }
	}
	
    }
}