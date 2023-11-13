import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MainWinLogic extends JFrame {
    private MainWindow mainWindow;
    private JFileChooser fileChooser;

    public MainWinLogic(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        fileChooser = new JFileChooser();
        setListeners();
    }


    private void setListeners(){
        mainWindow.getCloseProgram().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        mainWindow.getNewFile().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newDocument();
            }
        });

        mainWindow.getSaveFile().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDocument();
            }
        });

        mainWindow.getOpenFile().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDocument();
            }
        });
    }

    private void newDocument(){
        mainWindow.getTextArea().setText("");
    }

    private void saveDocument(){

        int returnVal = fileChooser.showSaveDialog(mainWindow);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(mainWindow.getTextArea().getText());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving the file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void openDocument(){

        int returnVal = fileChooser.showOpenDialog(mainWindow);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                mainWindow.getTextArea().setText(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error reading the file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
