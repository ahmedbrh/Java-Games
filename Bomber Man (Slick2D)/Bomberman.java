import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Bomberman extends BasicGame {
	
	private Grille g;
	private Personnage perso;
	ArrayList<Bombe> b = new ArrayList<Bombe>();

	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new Bomberman("Bomberman"));
		app.setShowFPS(false);
		app.start();
		
	}
	
	public Bomberman(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		
		g.dessiner(arg1);
		for(int i =0 ; i<b.size();i++) {
		b.get(i).dessiner(arg1);
		}
		perso.dessiner(arg1);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		g = new Grille();
		perso = new Personnage(1,1);
		int v = (int)(Math.random()*3)+1;
		System.out.println(v);
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
	Input	input = arg0.getInput();
		if(input.isKeyPressed(Input.KEY_UP)) {
			perso.Haut(g);
		}
		if(input.isKeyPressed(Input.KEY_DOWN)) {
			perso.Bas(g);
		}
		if(input.isKeyPressed(Input.KEY_LEFT)) {
			perso.Gauche(g);
		}
		if(input.isKeyPressed(Input.KEY_RIGHT)) {
			perso.Droite(g);
		}
		if(input.isKeyPressed(Input.KEY_SPACE) & b.size()==0) {
			b.add(new Bombe(perso.x/30,perso.y/30));
		}
		for(int i =0;i<b.size();i++) {
			if(b.get(i).doitExploser(arg1)) {
				b.get(i).exploser(g);
				
				if(b.get(i).exploser(perso)) {
					arg0.exit();
				}
				
				b.remove(i);
			}
				
			
		}
	}

	

}
