package com.edwin.main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ERRz {

	private JFrame fframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ERRz window = new ERRz();
					window.fframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ERRz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fframe = new JFrame();
		fframe.setBounds(100, 100, 450, 300);
		fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
