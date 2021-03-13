import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Timer;
import javax.swing.JFrame;

public class ZoneSaisie extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private Image backgroundImage;
	private int derniereTouche;
	Timer timer;
	ActionListener action = new ActionListener ()
    {
      // Méthode appelée à chaque tic du timer
      public void actionPerformed (ActionEvent event)
      {
        derniereTouche = 2;
      }
    };


	public int getTouche() {
		int res = derniereTouche;
		derniereTouche = 0;
        try {
            Thread.sleep(40);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
		return res;
	}

	public ZoneSaisie() {
		super("Tetris");

		try {
			backgroundImage = ImageIO.read(new File("Tetris-game-boy.jpg"));
		} catch (IOException e) {
		}
		addKeyListener(this);
		setSize(150, 150);
		setVisible(true);
		timer = new Timer(1000,action);
	}
	
	public void descenteAuto() {
		timer.start();
	}

	public void setVitesseDescente(int vitesse) {
		timer = new Timer(vitesse,action);
		timer.start();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(backgroundImage, 0, 0, null);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			derniereTouche = 1;
		} 
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            derniereTouche = 2;
        }
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			derniereTouche = 3;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			derniereTouche = 4;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	
}
