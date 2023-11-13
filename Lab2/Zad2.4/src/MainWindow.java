import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private JPanel panel;
    private JComboBox<String> input, output;
    private JTextField textInput;
    private JLabel result;
    private JButton convert;

    public MainWindow() throws HeadlessException{
        setTitle("Konwerter jednostek");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,780);
        setLocationRelativeTo(null);
        panel = new JPanel();
        input = new JComboBox<>(new String[]{"Metry" , "Centymetry", "Kilometry", "Mile", "Gramy", "Miligramy","Kilogramy"});
        output = new JComboBox<>(new String[]{"Metry" , "Centymetry", "Kilometry", "Mile", "Gramy", "Miligramy","Kilogramy"});
        textInput = new JTextField(10);
        result = new JLabel("Wynik : ");
        convert = new JButton("Przelicz");
        panel.add(input);
        panel.add(output);
        panel.add(textInput);
        panel.add(result);
        panel.add(convert);
        add(panel);
        setVisible(true);
    }




    public JButton getConvert() {
        return convert;
    }

    public JComboBox<String> getInput() {
        return input;
    }

    public JComboBox<String> getOutput() {
        return output;
    }

    public JLabel getResult() {
        return result;
    }

    public void setResult(JLabel result) {
        this.result = result;
    }

    public JTextField getTextInput() {
        return textInput;
    }


    public JPanel getPanel() {
        return panel;
    }
}
