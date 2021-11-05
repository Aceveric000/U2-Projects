import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class RPGCharacterGUI {

    static JTextField inputField1, inputField2, inputField3, inputField4,InputField5;
    static JLabel results;


    public RPGCharacterGUI(){


        JFrame window = new JFrame("RPG");
        JPanel panel = new JPanel();

        JLabel inputNum1 = new JLabel("How many girls he get? out of 5.   ");
        JLabel inputnum2 = new JLabel("            How buff is bro? out of 5.  " );
        JLabel inputnum3 = new JLabel("            How cool is he? out of 5.  ");
        JLabel inputnum4 = new JLabel("            how fast is he? ott of 5.  ");


        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        inputField3 = new JTextField(10);
        inputField4 = new JTextField(9);


        JButton Button = new JButton("CALCULATE THE MADNESS");
        results = new JLabel("MUAAHAHHAAHAHH");

        window.setSize(800, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        //listeners her bro
        Button.addActionListener(new buttonListener());

        panel.add(inputNum1);
        panel.add(inputField1);
        panel.add(inputnum2);
        panel.add(inputField2);
        panel.add(inputnum3);
        panel.add(inputField3);
        panel.add(inputnum4);
        panel.add(inputField4);


        panel.add(           Button);
        panel.add(results);




        window.add(panel);

        window.setVisible(true);
    }

    private static class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int inputNum1 = Integer.parseInt(inputField1.getText());
            int inputnum2 = Integer.parseInt(inputField2.getText());
            int inputnum3 = Integer.parseInt(inputField3.getText());
            int inputnum4 = Integer.parseInt(inputField4.getText());
            DecimalFormat round = new DecimalFormat("##");

String Math = round.format (inputNum1 * .5 + inputnum2*.5 +inputnum3*.5 + inputnum4*.5);





            results.setText("\nHe get girls =" + inputNum1 * .5 + " " +
                    "Charcater is mad buff fr = " +inputnum2 * .5 + " " +
                    "He is cool for real = " + inputnum3 * .5 + " " +
                    "Hes Fater then Usain Bolt = " + inputnum4 * .5 + " Out of 10 your battle stat is. " + Math + "/10");





        }
    }
}