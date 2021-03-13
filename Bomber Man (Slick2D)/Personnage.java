import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Personnage {
 int x,y;
private Image image ;
public Personnage(int x , int y) throws SlickException {
	this.x=x*30;
	this.y=y*30;
	this.image =  new Image("images/bomberman.png");
	
}
public void Gauche(Grille g) {
	if(g.grille[this.y/30][(this.x/30)-1]==0) {
		this.x=this.x-30;
}
}
public void Droite(Grille g) {
	if(g.grille[this.y/30][(this.x/30)+1]==0) {
		this.x=this.x+30;
}
}
public void Haut(Grille g) {
	if(g.grille[(this.y/30)-1][this.x/30]==0) {
		this.y=this.y-30;
}
}
public void Bas(Grille g) {
	if(g.grille[(this.y/30)+1][this.x/30]==0) {
		this.y=this.y+30;
}

}
void dessiner(Graphics g) {
	g.drawImage(image, x, y);
	
}

}
