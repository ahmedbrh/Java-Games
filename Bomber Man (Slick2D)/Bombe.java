import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Bombe {
private int x ,y ;
Image image ;
private double temps ;
public double getTemps() {
	return temps;
}
public void setTemps(double temps) {
	this.temps = temps;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public Bombe(int x , int y) throws SlickException {
	image = new Image("images/bombe.png");
	this.x=x;
	this.y=y;
	
}
void dessiner(Graphics g) {
	g.drawImage(image, x*30, y*30);
}
boolean doitExploser(int delta) {
	
		temps=temps+delta;
		if(temps>=2000) {
			temps=0;
			return(true);
		}else {
			return(false);
		}
	
}
void exploser(Grille g) {
if(g.grille[this.y+1][this.x]==1) {
	g.grille[this.y+1][this.x]=0;
}
if(g.grille[this.y-1][this.x]==1) {
	g.grille[this.y-1][this.x]=0;
}
if(g.grille[this.y][this.x+1]==1) {
	g.grille[this.y][this.x+1]=0;
}
if(g.grille[this.y][this.x-1]==1) {
	g.grille[this.y][this.x-1]=0;
}
}
boolean exploser(Personnage p) {
	boolean b = false;
	if((p.x/30)==this.x+1 & (p.y/30)==this.y  ) {
		b=true;
	}
	if((p.x/30)==this.x-1 & (p.y/30)==this.y) {
		b=true;
	}
	if((p.x/30)==this.x & (p.y/30)==this.y+1) {
		b=true;
	}
	if((p.x/30)==this.x & (p.y/30)==this.y-1) {
		b=true;
	}
	if((p.x/30)==this.x & (p.y/30)==this.y) {
		b=true;
	}
	return(b);
}
}
