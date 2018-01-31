package cfranc.hanoi;

public class Hanoi {
	
	Tour tourInit;
	Tour tourInter;
	Tour tourDest;
	
	int n;

	

	public Hanoi(Tour Tinit, Tour Tinter,Tour Tdest,int nb){
		this.tourInit=Tinit;
		this.tourInter=Tinter;
		this.tourDest=Tdest;
		this.n=nb;
	}

	
	public Hanoi(){
		tourInit = new Tour();
		tourInter = new Tour();
		tourDest = new Tour();
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		tourInit.empiler(grand);
		tourInit.empiler(moyen);
		tourInit.empiler(petit);
	}

	
	
	public void bougerSommet(Tour from, Tour to) {
		tourInit = new Tour();
		tourInter = new Tour();
		tourDest = new Tour();
		// TODO ...
		tourInter = from.depiler();
		try{
		to.empiler(tourInter);
		}catch(FullTowerException e){}
	}

	public void deplacer(int nbDisque, Tour from, Tour to, Tour by){
		if (nbDisque > 0) {
			deplacer(nbDisque-1, from, to, by);
			bougerSommet(from, to);
			deplacer(nbDisque-1, by, to, from);
		}
	}

	public void jouer() {
		deplacer(tourInit.taille(), tourInit, tourDest, tourInter);
	}

	public static void main(String[] args) {
		// Compléter la classe Hanoi pour résoudre le jeux avec 3 disques :
		
		// Editer par Hicham 
		Tour Tinit = new Tour(3);
		Tour Tinter = new Tour(3);
		Tour Tdest = new Tour(3);

		Hanoi game ;//= new Hanoi();

		try{
		Tinit.empiler(new Disque(3));
		Tinit.empiler(new Disque(2));
		Tinit.empiler(new Disque(1));
		game = new Hanoi(Tinit,Tinter,Tdest,3);
		
		System.out.println(game.tourInit.estVide());
		System.out.println(game.tourDest.estVide());
		game.jouer();
		System.out.println(game.tourInit.estVide());
		System.out.println(game.tourDest.estVide());
		
		
		}catch(FullTowerException e){}


		
		
		// Compléter la classe Hanoi pour résoudre le jeux avec n disques :
		int n =100;
		Hanoi gameN = new Hanoi(n);
		System.out.println(gameN.tourInit.estVide());
		System.out.println(gameN.tourDest.estVide());
		gameN.jouer();
		System.out.println(gameN.tourInit.estVide());
		System.out.println(gameN.tourDest.estVide());
		
	}

}
