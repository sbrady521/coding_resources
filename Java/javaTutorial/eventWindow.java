import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class eventWindow extends JFrame{
    private JTextField textItem1;
    private JTextField textItem2;
    private JTextField textItem3;
    private JPasswordField passwordItem;

    public eventWindow(){
        super("The title");
        setLayout(new FlowLayout());

        textItem1 = new JTextField(10);
        add(textItem1);

        textItem2 = new JTextField("Enter text here");
        add(textItem2);

        textItem3 = new JTextField("uneditable", 20);
        textItem3.setEditable(false);
        add(textItem3);

        //JPasswordField types are shown as dots
        passwordItem = new JPasswordField("mypass");
        add(passwordItem);

        //Here we create a handler class which will make an item listen for an eventWindow
        theHandler handler = new theHandler();
        textItem1.addActionListener(handler);
        textItem2.addActionListener(handler);
        textItem3.addActionListener(handler);
        passwordItem.addActionListener(handler);

    }

    //classes created within another class automatically inherit its characteristics
    //The handler class must implement ActionListener
    private class theHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String message = "";

            //event.getSource will return which item on the screen the event occured on
            //In this case it is searching for an 'enter'

            //getActionCommand returns whatever was entered into the item before the user pressed enter
            if(event.getSource() == textItem1){
                message = String.format("field 1: %s", event.getActionCommand());
            } else if(event.getSource() == textItem2){
                message = String.format("field 2: %s", event.getActionCommand());
            } else if(event.getSource() == textItem3){
                message = String.format("field 3: %s", event.getActionCommand());
            } else if(event.getSource() == passwordItem){
                message = String.format("Password Field: %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, message);
        }
    }

}
