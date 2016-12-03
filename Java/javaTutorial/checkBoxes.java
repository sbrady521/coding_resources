import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkBoxes extends JFrame{

    private JTextField text;
    private JCheckBox boldBox;
    private JCheckBox italicBox;

    public checkBoxes(){
        super("the title");
        setLayout(new FlowLayout());

        text = new JTextField("This is a sentence", 20);
        text.setFont(new Font("Serif", Font.PLAIN, 14));
        add(text);

        boldBox = new JCheckBox("bold");
        italicBox = new JCheckBox("italics");
        add(boldBox);
        add(italicBox);

        handlerClass theHandler = new handlerClass();
        boldBox.addItemListener(theHandler);
        italicBox.addItemListener(theHandler);
    }

    private class handlerClass implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;

            if(boldBox.isSelected() && italicBox.isSelected()){
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if(boldBox.isSelected()){
                font = new Font("Serif", Font.BOLD, 14);
            } else if(italicBox.isSelected()){
                font = new Font("Serif", Font.ITALIC, 14);
            } else{
                font = new Font("Serif", Font.PLAIN, 14);
            }

            text.setFont(font);
        }
    }
}
