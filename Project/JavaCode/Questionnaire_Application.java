import java.awt.*;import java.awt.event.*;
import javax.swing.*;

public class Questionnaire_Application extends JFrame {
	
	public Questionnaire_Application() {
        JFrame frame = new JFrame("Frame");
        frame.setLayout(new GridLayout(3, 2));

        JPanel button_panel = new JPanel(new GridLayout(1,5));
        JPanel text_panel = new JPanel(new GridLayout(2,0));
        JPanel next_button_panel = new JPanel();

        //------------------------------------------------//
        
        JLabel jlabel = new JLabel("Doctor Assisting questionnaire");
        //jlabel.setFont(new Font("Verdana",1,15));
        jlabel.setHorizontalAlignment(SwingConstants.LEFT);

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton option1 = new JRadioButton("Personal Info");
        JRadioButton option2 = new JRadioButton("Quiz 1");
        JRadioButton option3 = new JRadioButton("Quiz 2");
        JRadioButton option4 = new JRadioButton("Quiz 3");
        JRadioButton option5 = new JRadioButton("Quiz 4");

        JButton exit = new JButton("NEXT");
        exit.setPreferredSize(new Dimension(100,50));
        
        //------------------------------------------------//
        
        option1.addActionListener(new ActionListener(){
            @Override
          public void actionPerformed(ActionEvent evt){personal_info();}
           });
        //------------------------------------------------//
        
        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);
        buttonGroup.add(option4);
        buttonGroup.add(option5);

        button_panel.add(option1);
        button_panel.add(option2);
        button_panel.add(option3);
        button_panel.add(option4);
        button_panel.add(option5);

        text_panel.add(jlabel);
        next_button_panel.add(exit);

        frame.add(text_panel);
        frame.add(button_panel);
        frame.add(next_button_panel);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    private void personal_info() { //write down personal info of patient
    	System.out.println("yes");
    }
    
    public static void main(String[] args) {
    	Questionnaire_Application qa = new Questionnaire_Application();
    }
    
}
