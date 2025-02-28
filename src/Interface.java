import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Interface extends JFrame implements ActionListener {

    JButton ButX;
    JButton ButY;
    JButton commit;
    JComboBox combo;

    int x, y, z;
    String mode = "";

    Interface(){
        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel label = new JLabel("Enter X, Y and select operation");


        ButX = new JButton("X");
        ButX.addActionListener(this);
        ButY = new JButton("Y");
        ButY.addActionListener(this);
        combo = new JComboBox(new String[]{"EAE","QS"});
        commit = new JButton("commit");
        commit.addActionListener(this);

        add(combo);
        add(label);
        add(commit);
        add(ButX);
        add(ButY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ButX){
            x = Integer.parseInt(JOptionPane.showInputDialog("Enter int"));
        } else if (e.getSource()==ButY) {
            y = Integer.parseInt(JOptionPane.showInputDialog("Enter int"));
        } else if (e.getSource()==commit) {
            mode = (String) combo.getSelectedItem();
            IFStatement.ComplexFunction(x,y,mode);
        }
    }
}
