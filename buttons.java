
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class buttons extends JPanel{

    private JButton addTask;
    private JButton deleteTask;
    


    buttons(){      //Constructor

        this.setPreferredSize(new Dimension(150,75));
        this.setBackground(Color.BLUE);

        addTask = new JButton("Add Task");
        addTask.setBorder(BorderFactory.createLineBorder(Color.PINK,8));
        addTask.setFont(new Font("Sans-serif", Font.BOLD, 30));
        addTask.setForeground(Color.PINK);
        

        this.add(addTask);

        this.add(Box.createHorizontalStrut(50));

        deleteTask = new JButton("Delete Task");
        deleteTask.setBorder(BorderFactory.createLineBorder(Color.PINK,8));
        deleteTask.setFont(new Font("Sans-serif", Font.BOLD, 30));
        deleteTask.setForeground(Color.PINK);


        this.add(deleteTask);
        
        }
        public JButton getAddTask(){
            return addTask;

    }
        public JButton getDeleteTask(){
            return deleteTask;
        }
    
}
