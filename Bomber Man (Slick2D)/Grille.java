import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
public class Grille {
int grille[][] = new int[13][19];
Image image_vide ;
Image image_obstacle_1 ;
Image image_obstacle_2 ;
	public Grille() throws SlickException {
		image_vide = new Image("images/vide.png");
		image_obstacle_1 = new Image("images/obstacle_indestructible.png");
		 image_obstacle_2 = new Image("images/obstacle_destructible.png");
		 for(int i = 0;i<13;i++) {
			 int r1 =  (int)(Math.random() * (2)) ;
			 for(int j = 0 ; j<19;j++) {
				 int r2 = (int)(Math.random() * (2)) ;
				 if(r1 ==r2) {
					 grille[i][j]=0;
				 }else {
					 grille[i][j]=1;
				 }
				 
			 }
		 }
				 for(int i =0 ; i<13;i++) {
			 grille[i][0]=2;
			 grille[i][18]=2;
		 }
		 for(int i =0 ; i<19;i++) {
			 grille[0][i]=2;
			 grille[12][i]=2;
		 }
		 for(int i = 0 ; i<13;i++) {
			 for(int j = 0 ; j<19 ; j++) {
				 if(i%2 ==0 & j%2==0) {
					 grille[i][j]=2;
				 }
			 }
		 }
		 grille[1][1]=0;
		 grille[1][2]=0;
		 grille[2][1]=0;
		 grille[10][17]=0;
		 grille[11][17]=0;
		 grille[11][16]=0;
		 
	}
	void dessiner(Graphics g) {
		int t = 30;
		int r = 30;
		for(int i = 0; i<13;i++) {
		
		t=t+30;
		}
		for(int i = 0; i<19;i++) {
			
			r=r+30;
			}
		for(int i =0 ; i<13;i++) {
			for(int j =0 ;j<19;j++) {
				if(grille[i][j]==0) {g.drawImage(image_vide ,j*30,i*30); }
				if(grille[i][j]==1) {g.drawImage(image_obstacle_2 ,j*30,i*30); }
				if(grille[i][j]==2) {g.drawImage(image_obstacle_1 ,j*30,i*30); }
			}
		}

	}
	int typeCase(int x,int y) {
		
		int i = (int)x/30;
		int j = (int)y/30;
		return grille[i][j];
	}

}
