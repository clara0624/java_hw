package lecture20190630;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainClass {


	public static void main(String[] args) {
		JFrame frame = new JFrame("snake");
		frame.setContentPane(new GamePanel());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setPreferredSize(new Dimension(GamePanel.WIDTH,GamePanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		

	}

}
