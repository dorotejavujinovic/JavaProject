package projekatD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class small extends game {

	JButton[][] grid = new JButton[6][6];
	

		
	public small() {
		
		smallButtons();
		
		main.add(smallGame, BorderLayout.CENTER);
	}

	L2 l2 = new L2();
	
	Random random = new Random();
	
	private void smallButtons() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				
				grid[i][j] = new JButton("");
				
				grid[i][j].addActionListener(l2);
				
				smallGame.add(grid[i][j]);
				
				switch(random.nextInt(3)) {
				  case 0:
					  grid[i][j].setBackground(Color.BLUE);
				    break;
				  case 1:
					  grid[i][j].setBackground(Color.RED);
				    break;
				  default:
					  grid[i][j].setBackground(Color.GREEN);
				}
				
			}
		}
		
	}

	private class L2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < grid.length; i++) {
				
				for (int j = 0; j < grid.length; j++) {
					
				
				if (e.getSource() == grid[i][j]) {	
			
						if (i<5) {
						if(grid[i+1][j].getBackground() == grid[i][j].getBackground()) {
							grid[i+1][j].setBackground(Color.red);
						}
					}
						if (j<5) {
							
						if(grid[i][j].getBackground() == grid[i][j+1].getBackground()) { 
							grid[i][j+1].setBackground(Color.red);
						}
					}
						if (j>0) {
						if(grid[i][j].getBackground() == grid[i][j-1].getBackground()) { 
							grid[i][j-1].setBackground(Color.red);
						}
					}
						if (i>0) {
						if(grid[i][j].getBackground() == grid[i-1][j].getBackground()) { 
							grid[i-1][j].setBackground(Color.red);
						}
					}
						
						
						grid[i][j].setBackground(Color.red);
						
							}
					
				}
			}
		}
			
		}
		
	}

