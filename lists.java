
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class lists extends JPanel {

    lists(){

        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(8);
        
        this.setLayout(layout);
        this.setBackground(Color.BLACK);
    }

    public void updateNumbers(){
        Component[] listItems = this.getComponents();

        for(int i = 0; i < listItems.length; i++){
            if(listItems[i] instanceof tasks){
                ((tasks)listItems[i]).changeIndex(i+1);
            }
        }
    }

    public void removeCompletedTasks(){
        for(Component c : getComponents()){
            if(c instanceof tasks){
                if(((tasks)c).getState()){
                    remove(c);
                    updateNumbers();
                }
            }
        }
    }
    
}
