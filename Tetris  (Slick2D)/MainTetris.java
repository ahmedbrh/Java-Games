
public class MainTetris {
	
	public static void main(String[] args) {
		Grille g = new Grille();
		Carre k = new Carre(3,3,'c');
	Forme f = new Forme(0);
Carre[] co = new Carre[1];
co[0]= k;
g.Ajouterforme(f);
System.out.println(f.peutDescendre(g));
	g.affichage();
	
	
	
		ZoneSaisie z = new ZoneSaisie();
		
		
		// D�commenter pour g�n�rer une instruction "Bas" toutes les secondes
		z.descenteAuto(); 
		
		// Boucle principale du programme
		boolean fin = false;
		while (!fin) {
		

			// Gestion du clavier + Descente r�guli�re
			int touche = z.getTouche();
			switch (touche) {
			case 1: // Si la fl�che du haut est press�e
				System.out.println("Haut");
f.tourner(g);
				break;
			case 2: // Si la fl�che du bas est press�e
				
				System.out.println("Bas");
				
			f.descendre(g);
			if(f.peutDescendre(g)==false ) {
				for(int i = 0 ; i<4;i++) {
					if(g.lignePleine(f.Carres[i].getY())) {
						g.supprimerLigne(f.Carres[i].getY());
					}
				}
			f = new Forme((int)(Math.random()*4));
					
			
					
				}
			
				break;
			case 3: // Si la fl�che de droite est press�e
				System.out.println("Droite");
				f.droite(g);
				break;
			case 4: // Si la fl�che de gauche est press�e
				System.out.println("Gauche");
				f.gauche(g);
				break;
			default:
				break;
			}

		}

		System.out.println("Fin");
		System.exit(1);
		System.out.println(co);
	}
	
}
