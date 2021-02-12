package projekatD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class big extends game{
	JButton[][] bigGrid = new JButton[10][10];
	
	public big() {
		bigButtons();
		
		main.add(bigGame, BorderLayout.CENTER);
	}
	
	L3 l3 = new L3();
	
	Random bigRandom = new Random();
	
	private void bigButtons() {
		for (int i = 0; i < bigGrid.length; i++) {
			for (int j = 0; j < bigGrid.length; j++) {
				
				bigGrid[i][j] = new JButton("");
				
				bigGrid[i][j].addActionListener(l3);
				
				bigGame.add(bigGrid[i][j]);
				
				switch(bigRandom.nextInt(5)) {
				  case 0:
					  bigGrid[i][j].setBackground(Color.BLUE);
				    break;
				  case 1:
					  bigGrid[i][j].setBackground(Color.RED);
				    break;
				  case 2:
					  bigGrid[i][j].setBackground(Color.MAGENTA);
					  break;
				  case 3:
					  bigGrid[i][j].setBackground(Color.ORANGE);
					  break;
				  default:
					  bigGrid[i][j].setBackground(Color.GREEN);
				}
			}
		}
	}
	
	private class L3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < bigGrid.length; i++) {
				
				for (int j = 0; j < bigGrid.length; j++) {
					
				
				if (e.getSource() == bigGrid[i][j]) {	
			
						if (i<9) {
						if(bigGrid[i+1][j].getBackground() == bigGrid[i][j].getBackground()) {
							bigGrid[i+1][j].setBackground(Color.red);
						}
					}
						if (j<9) {
							
						if(bigGrid[i][j].getBackground() == bigGrid[i][j+1].getBackground()) { 
							bigGrid[i][j+1].setBackground(Color.red);
						}
					}
						if (j>0) {
						if(bigGrid[i][j].getBackground() == bigGrid[i][j-1].getBackground()) { 
							bigGrid[i][j-1].setBackground(Color.red);
						}
					}
						if (i>0) {
						if(bigGrid[i][j].getBackground() == bigGrid[i-1][j].getBackground()) { 
							bigGrid[i-1][j].setBackground(Color.red);
						}
					}
						
						
						bigGrid[i][j].setBackground(Color.red);
						
							}
			
					}
		
			}
		}	
	}
}