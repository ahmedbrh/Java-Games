
public class Carre {
private int x ;
 private int y ;
char c ;
public Carre() {
	
}
public Carre(int i , int j , char k) {                                         
	if(i < 0 | i >9) {
		x = (int)(Math.random()*9);
	}else {
		x = i ;
	}
	if(j < 0 | j >19) {
		y = (int)(Math.random()*19);
	}else {
		y =j ;
	}
	
	
	c =k ;

}
boolean peutDescendre(Grille g) {
	
	if(y+1<20 && g.cases[x][y+1]==null ) {
		return(true);
	
}else {
	return(false);
}
}

void descendre(Grille g) {
	if(peutDescendre(g)==true) {
		
	
		g.viderCase(x , y);
		y=y+1;
		g.ajouterCarre(this);
		g.affichage();
	
}else {
	System.out.println("NON !");
}
}
boolean peutGauche(Grille g) {
	if(x-1>=0 && g.cases[x-1][y]==null ) {
		return(true);
	
}else {
	return (false);
}
}
boolean peutDroite(Grille g) {
	
	if(x+1<10 && g.cases[x+1][y]==null ) {
		return(true);
	
}else {
	return(false);
}
}


void gauche(Grille g) { 
	if(peutGauche(g)==true) {
		g.viderCase(x,y);
		x=x-1;
		g.ajouterCarre(this);
		g.affichage();
		
	}else {
		System.out.println("NoN");
	}
	
}
void droite(Grille g) {
	if(peutDroite(g)==true) {
		g.viderCase(x,y);
		x=x+1;
		g.ajouterCarre(this);
		g.affichage();
	}else {
		System.out.println("NON");
	}
	
}
public void setX(int g) {
	this.x=g;
}
public void setY(int g) {
	this.y=g;
}
public int getX() {
	
	return this.x ;
}
public int getY() {
	                                     
	return this.y ;
}

}
