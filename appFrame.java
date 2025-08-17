
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;

public class appFrame extends JFrame // JFrame represents framed window
{

    private titleBar title;
    private lists list;
    private buttons button;

    private JButton addTask;
    private JButton deleteTask;

    appFrame(){         //Constructor

        this.setSize(500 , 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new titleBar();
        list = new lists();
        button = new buttons();

        this.add(title,BorderLayout.NORTH); //Have to add this in frame for title bar
        this.add(button, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        addTask = button.getAddTask();
        deleteTask = button.getDeleteTask();

        addListeners();

    }
        public void addListeners(){

            addTask.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e){
                    tasks task = new tasks();
                    list.add(task);
                    list.updateNumbers();
                    task.getComplete().addMouseListener(new MouseAdapter() {
                        
                        @Override
                        public void mousePressed(MouseEvent e){
                            task.changeState();
                            revalidate();
                        }
                        
                    });
                    revalidate();
                }
                
            });

                 deleteTask.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e){
                        list.removeCompletedTasks();
                        repaint();
                    }
                            
                        });
        }
        
    }   
        
     

