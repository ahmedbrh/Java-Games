
public class Forme {
Carre[] Carres = new Carre[4];
int id ;
int xc;
int yc;
public Forme(int id) {
	for(int i = 0 ; i<4 ; i++) {
		Carres[i]=new Carre();
		Carres[i].c='c';
		
	}  
	if(id ==0) {
		Carres[0].setX(4);
		Carres[0].setY(0);
				Carres[1].setX(5);
				Carres[1].setY(0);
				Carres[2].setX(6);
				Carres[2].setY(0);
				Carres[3].setX(6);	
				Carres[3].setY(1);
					
								
								this.id=0;
								xc=Carres[2].getX();
								yc=	Carres[2].getY();
	}
	if(id ==1) {
	
								
								Carres[0].setX(5);
								Carres[0].setY(0);
								Carres[1].setX(5);
								Carres[1].setY(1);
								Carres[2].setY(2);
								Carres[2].setX(5);
								Carres[3].setY(3);
								Carres[3].setX(5);		
				
												this.id=1;
												xc=Carres[2].getX();
												yc=	Carres[2].getY();
								
								
								
	}
	if(id ==2) {
	
								
								Carres[0].setX(5);
								Carres[0].setY(0);
								Carres[1].setX(5);
								Carres[1].setY(1);
								Carres[2].setX(6);
								Carres[2].setY(1);
								Carres[3].setX(6);	
								Carres[3].setY(2);
									
												
												this.id=2;
												xc=Carres[2].getX();
												yc=	Carres[2].getY();
								
								
								
	}
	if(id ==3) {

								
								Carres[0].setX(5);
								Carres[0].setY(0);
								Carres[1].setX(5);
								Carres[1].setY(1);
								Carres[2].setX(4);
								Carres[2].setY(0);
								Carres[3].setX(4);
								Carres[3].setY(1);
										
												
												this.id=3;
												xc=Carres[0].getX();
												yc=	Carres[0].getY();
								
								
	}
	if(id ==4) {
	
								
								Carres[0].setX(5);
								Carres[0].setY(0);
								Carres[1].setX(5);
								Carres[1].setY(1);
								Carres[2].setX(4);
								Carres[2].setY(1);
								Carres[3].setX(6);
								Carres[3].setY(1);
										
												
												this.id=4;
												xc=Carres[1].getX();
												yc=	Carres[1].getY();
	}
}
	boolean endessousappartientForme(Grille g , int b) {
		int c = 0;
		for(int i =0 ; i<4 ; i++) {
			if(this.Carres[b].getY()+1<20) {
			if(g.cases[this.Carres[b].getX()][this.Carres[b].getY()+1]==this.Carres[i]) { c++;}
			
		}
		}
		if(c>=1) {return(true);}else {return(false);}
		
	}
	boolean adroiteappartientForme(Grille g , int b) {
		int c = 0;
		for(int i =0 ; i<4 ; i++) {
			if(this.Carres[b].getX()+1<10) {
			if(g.cases[this.Carres[b].getX()+1][this.Carres[b].getY()]==this.Carres[i]) { c++;}
			
			}
		}
		if(c>=1) {return(true);}else {return(false);}
		
	}
	boolean agaucheappartientForme(Grille g , int b) {
		int c = 0;
		for(int i =0 ; i<4 ; i++) {
			if(this.Carres[b].getX()-1>0) {
			if(g.cases[this.Carres[b].getX()-1][this.Carres[b].getY()]==this.Carres[i]) { c++;}
			
		}
		}
		if(c>=1) {return(true);}else {return(false);}
		
	}

boolean peutDescendre(Grille g) {
	int ct=0;

	for(int i =0 ; i<4;i++) {
		
			if(this.Carres[i].peutDescendre(g)==true | endessousappartientForme(g,i)==true  ) {ct++;}
			
		
	

	
}
	if(ct==4) {return(true);}else {return(false);}
}
boolean peutDroite(Grille g) {

	int ct=0;

	for(int i =0 ; i<4;i++) {
		
			if(this.Carres[i].peutDroite(g)==true | adroiteappartientForme(g,i)==true  ) {ct++;}
			
		
	

	
}
	if(ct==4) {return(true);}else {return(false);}

}
boolean peutGauche(Grille g) {

	int ct=0;

	for(int i =0 ; i<4;i++) {
		
			if(this.Carres[i].peutGauche(g)==true | agaucheappartientForme(g,i)==true  ) {ct++;}
			
		
	

	
}
	if(ct==4) {return(true);}else {return(false);}

}
void descendre(Grille g) {
	if(this.peutDescendre(g)){
	for(int m = 0 ; m<4; m++) {
		g.viderCase(this.Carres[m].getX(), this.Carres[m].getY());
		}
		
	for(int i =0;i<4;i++) {
		
		this.Carres[i].setY(this.Carres[i].getY()+1)  ;
		this.yc=yc+1;
	}
		g.Ajouterforme(this);
		
		g.affichage();
	}else {
		System.out.println("NON");
	}

}
void droite(Grille g) {
	if(this.peutDroite(g)){
		for(int m = 0 ; m<4; m++) {
			g.viderCase(this.Carres[m].getX(), this.Carres[m].getY());
			}
			
		for(int i =0;i<4;i++) {
			
			this.Carres[i].setX( this.Carres[i].getX()+1) ;
			this.xc=xc+1;
		}
			g.Ajouterforme(this);
			
			g.affichage();
		}else {
			System.out.println("NON");
		}

}
	void gauche(Grille g) {
		if(this.peutGauche(g)){
			for(int m = 0 ; m<4; m++) {
				g.viderCase(this.Carres[m].getX(), this.Carres[m].getY());
				}
				
			for(int i =0;i<4;i++) {
				this.Carres[i].setX(this.Carres[i].getX()-1);
				
				this.xc=xc-1;
			}
				g.Ajouterforme(this);
				
				g.affichage();
			}else {
				System.out.println("NON");
			}
		

}
	void tourner(Grille g) {
		Carre o = new Carre();
		for(int i =0 ; i<4 ; i++) {
			g.viderCase(this.Carres[i].getX(), this.Carres[i].getY());
		}
		for(int i = 0 ; i<4 ; i++) {
			
			
			o.setX(this.Carres[i].getX()-this.xc);
			o.setY(this.Carres[i].getY()-this.yc);
			Carres[i].setX(-o.getY()+this.xc);
			Carres[i].setY(o.getX()+this.yc);
		}
		g.Ajouterforme(this);
		g.affichage();
	}
	
	
	
}
