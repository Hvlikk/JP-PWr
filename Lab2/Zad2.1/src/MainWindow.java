import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainWindow extends JFrame{
    private JFrame mainWindow;
    private JPanel colorPanel;
    private JTextField colorTextField;


    public MainWindow() throws HeadlessException {
        mainWindow = new JFrame();
        mainWindow.setTitle("Aplikacja");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(800, 500);
        mainWindow.setLocationRelativeTo(null); //centering frame

        JPanel topPanel = new JPanel();
        topPanel.setSize(800, 300);
        topPanel.setBackground(Color.black);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        colorTextField = new JTextField(20);
        JButton button = new JButton("Zmien kolor! :)");
        colorPanel = new JPanel();

        mainWindow.add(topPanel, BorderLayout.NORTH);
        topPanel.add(colorTextField, BorderLayout.NORTH);
        topPanel.add(button, BorderLayout.CENTER);
        mainWindow.add(colorPanel, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor();
            }
        });
        mainWindow.setVisible(true);
    }

    public void show(){
        mainWindow.setVisible(true);
    }

    public void hide(){
        mainWindow.setVisible(false);
    }

    public void changeColor(){

        String colorName = colorTextField.getText().toLowerCase();
        Color newColor = null;

        switch (colorName){
            case "zielony":
                newColor = Color.green;
                break;
            case "czerwony":
                newColor = Color.red;
                break;
            case "zolty":
                newColor = Color.yellow;
                break;
            case "czarny":
                newColor = Color.black;
                break;
            case "bialy":
                newColor = Color.white;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Nieprawidłowa nazwa koloru!", "Błąd", JOptionPane.ERROR_MESSAGE);
        }

        colorPanel.setBackground(newColor);
    }
}
