/*
 * Created on 8 janv. 08
 */
package org.jouvieje.Fmod.Examples.Util;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class FmodExampleFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private final FmodExample example;
	private Thread thread = null;

	public FmodExampleFrame(FmodExample example) {
		super();
		this.example = example;
		initialize();
		this.setVisible(true);

		thread = new Thread(example);
		thread.start();
	}

	protected void initialize() {
		this.setTitle(example.getTitle());
		this.setSize(example.getPanel().getSize());
//		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setContentPane(example.getPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				//Attempt to stop the thread if running
				if(thread != null && thread.isAlive()) {
					try {
						thread.suspend();
						thread.interrupt();
						thread.stop();
					}
					catch(Error er) {}
					catch(Exception ex) {}
				}

				example.stop();
				dispose();
			}
		});
	}
}
