import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class basicWindow extends JFrame{
    private JLabel item1;

    public basicWindow(){
        //Set the title bar message
        super("The title bar");

        //Set the layout as a new FlowLayout
        setLayout(new FlowLayout());

        //create the item for the window and make the message (parameter)
        item1 = new JLabel("This is a sentence");

        //this message will appear when item1 is hovered over
        item1.setToolTipText("This is gonna show up on hover");

        //Add this to the screen
        add(item1);
    }
}
