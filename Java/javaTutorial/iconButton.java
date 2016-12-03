import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class iconButton extends JFrame{
    private JButton reg;
    private JButton custom;

    public iconButton(){
        super("the title");

        setLayout(new FlowLayout());

        reg = new JButton("Regular Button");
        add(reg);


        Icon yellow = new ImageIcon(getClass().getResource("yellow_button.png"));
        Icon black = new ImageIcon(getClass().getResource("black_button.png"));

        custom = new JButton("Custom", yellow);
        //RolloverIcon appears whenever the cursor hovers over the button
        custom.setRolloverIcon(black);

        add(custom);

        handlerClass handler = new handlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);

    }

    private class handlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}
