import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GameFrame extends JFrame implements ActionListener {
	
	GamePanel panel = new GamePanel();
	 public JButton playAgainButton;
	
	
	GameFrame(){
		
		panel.setVisible(true);
		
		
		this.setTitle("Snake");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		playAgainButton = new JButton();
		playAgainButton.setText("Play Again");
		playAgainButton.setSize(100, 25);
		playAgainButton.setLocation(panel.SCREEN_WIDTH - 100, 0);
		playAgainButton.addActionListener(this);
		playAgainButton.setVisible(true);
		
		
		this.add(playAgainButton);
		this.add(panel);
		this.pack();
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == playAgainButton) {
			this.remove(panel);
			panel = new GamePanel();
			this.add(panel);
			panel.requestFocusInWindow();
			SwingUtilities.updateComponentTreeUI(this);
			
			}
			
		}
	
	
}
