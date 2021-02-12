package projekatD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;



public class game extends JFrame{

	JPanel help = new JPanel(new GridLayout());
	
	JPanel game = new JPanel(new FlowLayout());
	
	JPanel main = new JPanel(new BorderLayout());
	
	JPanel difficulty = new JPanel(new BorderLayout());
	
	JPanel smallGame = new JPanel();
	
	JPanel bigGame = new JPanel();
	
	JFrame frame;
	
	JButton save,load, numMoves, replay, newGameBut;
	
	JCheckBox small, big;

	public static void main(String[] args) {
		
		new game();

	}
	
	public game() {
		frame = new JFrame();
		frame.setSize(850,750);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("The Game!");
		
		save = new JButton("SAVE");
		load = new JButton("LOAD");
		numMoves = new JButton("NO. MOVES");
		replay = new JButton("REPLAY");
		newGameBut = new JButton("NEWGAME");
		
		ButtonListener saveListen = new ButtonListener();
		ButtonListener1 loadListen = new ButtonListener1();
		ButtonListener2	hintListen = new ButtonListener2();
		ButtonListener4 replayListen = new ButtonListener4();
		
		
		save.addActionListener(saveListen);
		load.addActionListener(loadListen);
		numMoves.addActionListener(hintListen);
		replay.addActionListener(replayListen);
		
		help.add(load);
		help.add(save);
		help.add(numMoves);
		help.add(replay);
		
		help.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10),
				BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK)));
		
		small = new JCheckBox("Easy game");
		big = new JCheckBox("Hard game");
		
		ButtonGroup size = new ButtonGroup();
		
		size.add(small);
		size.add(big);
		
		Border difficultyBorder = BorderFactory.createTitledBorder("Set difficulty");
		
		difficulty.setBorder(difficultyBorder);
		
		difficulty.add(small, BorderLayout.BEFORE_FIRST_LINE);
		difficulty.add(big, BorderLayout.CENTER);
		
		newGameBut = new JButton("Start");
		
		L1 l1 = new L1();
		
		newGameBut.addActionListener(l1);
		
		small.setSelected(true);
		
		smallGame = new JPanel(new GridLayout(6,6));
		
		bigGame = new JPanel(new GridLayout(10,10));
		
		difficulty.add(newGameBut, BorderLayout.SOUTH);
		
		frame.add(main);
		
		frame.add(difficulty, BorderLayout.SOUTH);
		
		frame.add(help, BorderLayout.NORTH);
		
		frame.setVisible(true);
	}
	
	private class L1 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == newGameBut) {
				if (small.isSelected()) {
					new small();
					frame.setVisible(false);
				}else {
					new big();
					frame.setVisible(false);
				}
			}
		}
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ButtonListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ButtonListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

	
	private class ButtonListener4 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == replay) {
				
				if (small.isSelected()) {
					new small();
					frame.setVisible(false);
					
				}
				
				if (big.isSelected()) {
					new big();
					frame.setVisible(false);
					
				}
			}
		}
	}

}
