
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class titleBar extends JPanel //JPanel represents certain controls
{
   titleBar(){  //Constructor
    this.setPreferredSize(new Dimension(500,90));
    this.setBackground(Color.blue);
    this.setBorder(BorderFactory.createLineBorder(Color.PINK,8));

    JLabel titleText = new JLabel("To Do List");
    titleText.setPreferredSize(new Dimension(300,150));
    titleText.setFont(new Font("Monospaced", Font.BOLD, 50));
    titleText.setHorizontalAlignment(JLabel.CENTER);
    titleText.setVerticalAlignment(JLabel.NORTH);
    titleText.setForeground(Color.PINK);

    this.add(titleText);
   } 
    
}
