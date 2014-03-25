package dibujable;
import java.awt.Font;
import java.awt.Graphics;


import com.me.mygdxgame.animacion.Animado;



public class Puntuacion implements Dibujable,Animado {

	private int x;
	private int y;
	private boolean visible;
	private String str="";
	private int a;
	
	public Puntuacion(int x,int y){
		this.x=x;
		this.y=y;
		this.setVisible(true);
	}
	
	

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void dibuja(Graphics g) {
		if(isVisible()){
			Font fuente=new Font("Monospaced", Font.BOLD, 20);
			g.setFont(fuente);
			g.drawString(str, x, y);
		}
	}
private boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}
public class Puntuacio {

}
@Override
public void anima() {
	// TODO Auto-generated method stub
	
   }
}