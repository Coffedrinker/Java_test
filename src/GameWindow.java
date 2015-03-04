import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;




public class GameWindow extends JFrame {
	private static final long serialVersionUID = 3971174969567487817L;
	public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameWindow();
	}
	
	public GameWindow(){
		super("Awesome window");
		setBounds(screenSize.width/6, screenSize.height/6, screenSize.width * 2 / 3 , screenSize.height * 2 / 3 );
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

}
