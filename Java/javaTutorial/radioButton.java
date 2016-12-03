import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class radioButton extends JFrame{
    private JTextField text;
    private Font plainT;
    private Font boldT;
    private Font iandbT;
    private Font italicT;
    private JRadioButton plainB;
    private JRadioButton boldB;
    private JRadioButton italicB;
    private JRadioButton iandbB;
    private ButtonGroup group;

    public radioButton(){
        super("the title");
        setLayout(new FlowLayout());

        text = new JTextField("This is some text", 14);

        plainT = new Font("Serif", Font.PLAIN, 14);
        boldT = new Font("Serif", Font.BOLD, 14);
        italicT = new Font("Serif", Font.ITALIC, 14);
        iandbT = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

        plainB = new JRadioButton("plain", true);
        boldB = new JRadioButton("bold", false);
        italicB = new JRadioButton("italic", false);
        iandbB = new JRadioButton("bold and italic", false);

        add(plainB);
        add(boldB);
        add(italicB);
        add(iandbB);

        group = new ButtonGroup();
        group.add(plainB);
        group.add(boldB);
        group.add(italicB);
        group.add(iandbB);
    }
}
