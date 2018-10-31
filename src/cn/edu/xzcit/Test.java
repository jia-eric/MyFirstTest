/**
 * 
 */
package cn.edu.xzcit;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author jiaeric
 *
 */
public class Test extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @param args
	 */
	  public  Test(){
		   
		   add(new Display());
		   setSize(300,200);
		   setVisible(true);
		   
	   }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  new Test();
	}
    
	
	class Display extends JPanel implements Runnable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Display(){
			
			setSize(200, 200);			
			//new Thread(new Display()).start();
//			Thread  run = new Thread(this);
//			run.start();
			new Thread(this).start();
		}
 
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
		    new Ball(10, 10).draw(g);
		    new Ball(20, 20).draw(g);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
		
		
		
		
		
	}
	
	
	
}
