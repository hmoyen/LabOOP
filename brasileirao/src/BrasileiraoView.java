import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BrasileiraoView extends JFrame {

    JFrame f;    
    
    public void setTabela(HashMap<String,Time> map) {
        JTable table=new JTable(map.size(),2);
        int row=0;
        for(Map.Entry<String,Time> entry: map.entrySet()){
                table.setValueAt(entry.getKey(),row,0);
                table.setValueAt(entry.getValue(),row,1);
                row++;
        }

            table.setBounds(30,40,200,300);          
            JScrollPane sp=new JScrollPane(table);    
            f.add(sp);          
            f.setSize(300,400);    
            f.setVisible(true);    
    }
}
