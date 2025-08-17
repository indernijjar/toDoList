
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class tasks extends JPanel{

    private JLabel index;
    private JTextField taskName;
    private JButton complete;
    private boolean checked;

    tasks(){        //Constructor

        this.setPreferredSize(new Dimension(70,70));
        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel();
        index.setPreferredSize(new Dimension(40,30));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setFont(new Font("Monospaced",Font.BOLD,20));
        this.add(index,BorderLayout.WEST);

        taskName = new JTextField("Enter Task!");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.WHITE);
        taskName.setHorizontalAlignment(JTextField.LEFT);
        this.add(taskName,BorderLayout.CENTER);

        complete = new JButton("done?");
        complete.setPreferredSize(new Dimension(60,30));
        complete.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
        this.add(complete,BorderLayout.EAST);


    }
        public JButton getComplete(){
            return complete;
        }

    
        public void changeIndex(int num){
            this.index.setText((num+""));
            this.revalidate();
        }

        public boolean getState(){
            return checked;
        }


        public void changeState(){
            this.setBackground(Color.GREEN);
            taskName.setBackground(Color.GREEN);
            checked = true;
            revalidate();
        }
    
}
