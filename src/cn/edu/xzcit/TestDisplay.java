package cn.edu.xzcit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class TestDisplay extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestDisplay frame = new TestDisplay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestDisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   System.out.println(e.paramString());
			}
			
		});
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("\u5927\u5BB6\u597D");
		lblNewLabel.setToolTipText("Hi Test");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setLabelFor(contentPane);
		lblNewLabel_1.setSize(new Dimension(50, 50));
		lblNewLabel_1.setInheritsPopupMenu(false);
		lblNewLabel_1.setIcon(null);
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
	}

}
