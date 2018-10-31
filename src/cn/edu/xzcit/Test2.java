/**
 * 
 */
package cn.edu.xzcit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

/**
 * @author jiaeric
 *
 */
public class Test2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public Test2() {

		add(new Display());
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test2();
	}

	class Display extends JPanel {

		/**
		 * 
		 */

		private static final long serialVersionUID = 1L;
		Random random = new Random();
		private int[] highTemperature = { 28, 27, 32, 30, 31, 27, 27, 27, 28, 28 };
		private int[] lowTemperature = { 19, 19, 19, 18, 20, 18, 16, 15, 16, 19 };
		private int offSet = 50; // 位置偏置

		public Display() {

			setSize(200, 200);
			setBorder(new LineBorder(Color.YELLOW));
			// new Thread(new Display()).start();
//			Thread  run = new Thread(this);
//			run.start();
			Timer timer = new Timer(100, new mylistener());
			timer.start();
			// Graphics g ;

		}

		class mylistener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// repaint();
			}

			// return null;
		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
//		    new Ball(10, 10).draw(g);
//		    int num = random.nextInt(this.getWidth())+1;
//		    new Ball(num, 20).draw(g);
//		    g.setColor(Color.BLUE);
//		    g.draw3DRect(100, 100, 50, 50, false);
//		    g.setColor(Color.BLACK);
			// g.setFont(new Font(null,Font.BOLD,30));
			// g.drawLine(0, 0, 100, 100);

			g.drawLine(offSet, this.getHeight() - offSet, this.getWidth() - offSet, this.getHeight() - offSet); // x轴
			g.drawLine(offSet, this.getHeight() - offSet, offSet, 0); // y轴
			g.drawString("历史温度曲线", this.getWidth() - 2 * offSet, this.getHeight() - 2 * offSet);
			for (int i = 0; i < 9; i++) {
				g.setColor(Color.RED);
				// g.setFont(new Font(null,Font.BOLD,30));
				g.drawLine(i * 70 + 50, highTemperature[i], (i + 1) * 70 + 50, highTemperature[i + 1]);
			}
			for (int i = 0; i < 9; i++) {
				g.setColor(Color.BLUE);
				// g.setFont(new Font(null,Font.BOLD,30));
				g.drawLine(i * 70 + 50, lowTemperature[i], (i + 1) * 70 + 50, lowTemperature[i + 1]);
			}

		}

		
	}

}
