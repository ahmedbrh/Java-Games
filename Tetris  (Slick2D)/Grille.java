
public class Grille {
Carre[][] cases= new Carre[10][20];
public Grille() {
	for(int i =0 ; i<20;i++) {
		for(int j=0;j<10;j++) {
			cases[j][i]= new Carre();
			cases[j][i]= null;
		}
	}
	
}
void ajouterCarre(Carre c) {
	if(cases[c.getX()][c.getY()]==null) {
		cases[c.getX()][c.getY()]=c ;
	}else {
		
	}
}
void affichage() {
	for(int i =0; i<10;i++) {
		if(i ==0) {System.out.print(" ");}
		if( i ==9) {
			System.out.println("-");
		}else {
			System.out.print("-");
			
		}
	}
for(int i =0; i<20;i++) {
	System.out.print("|");
	for(int j =0 ; j<10 ; j++) {
		if(cases[j][i]!=null) {
		System.out.print(cases[j][i].c);
		}else {
			System.out.print(" ");
		}
	}
	System.out.println("|");

	if(i==19) {for(int p =0; p<10;p++) {if(p==0) {System.out.print(" ");}else{System.out.print("-");}}}
		
		
	
}
	
}
boolean estLibre(int x , int y) {
	if(x>10 | x<0 | y >20 | y<0) {
		return(false);
	}
	if(cases[x][y]==null) {
		return(true);
	}else {
		return(false);
	}
	
}
void viderCase(int x , int y) {
	
	if(x>10 | x<0 | y >20 | y<0) {
		cases[x][y]=cases[x][y];
	}else {
		cases[x][y]=null;	
	}
}
boolean lignePleine(int l) {
	int t=0;
	for(int i = 0 ; i<10;i++) {
	if(cases[i][l]!=null) {t++;}
	}
	if(t==10) {return(true);}else {return(false);}
}
void supprimerLigne(int l) {
	for(int i = 0 ; i<10;i++) {
		cases[i][l]=null;
	}
	for(int i=0;i<10;i++) {
		for(int e = l ; e>1; e--) {
			cases[i][e]=cases[i][e-1];
		}
	}
	
}
void Ajouterforme(Forme f) {
	for(int i =0 ; i<4;i++) {
	ajouterCarre(f.Carres[i]);
	}
}
}

