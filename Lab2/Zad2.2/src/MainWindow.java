import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MainWindow extends JFrame{
    private JFrame mainWindow;
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JButton newFile, openFile, saveFile, closeProgram;

    public MainWindow() throws HeadlessException{
        JMenuBar menuBar = new JMenuBar();
        mainWindow = new JFrame();
        mainWindow.setTitle("Notatnik");
        mainWindow.setSize(1200,1200);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        menuBar = new JMenuBar();
        mainWindow.add(menuBar);
        mainWindow.setJMenuBar(menuBar);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        mainWindow.add(scrollPane);


        newFile = new JButton("Nowy");
        openFile = new JButton("Otworz");
        saveFile = new JButton("Zapisz");
        closeProgram = new JButton("Zamknij");

        menuBar.add(newFile);
        menuBar.add(openFile);
        menuBar.add(saveFile);
        menuBar.add(closeProgram);
    }

    public void show(){
        mainWindow.setVisible(true);
    }

    public JButton getCloseProgram() {
        return closeProgram;
    }

    public JButton getNewFile() {
        return newFile;
    }

    public JButton getOpenFile() {
        return openFile;
    }

    public JButton getSaveFile() {
        return saveFile;
    }

    public JFrame getMainWindow() {
        return mainWindow;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setCloseProgram(JButton closeProgram) {
        this.closeProgram = closeProgram;
    }

    public void setMainWindow(JFrame mainWindow) {
        this.mainWindow = mainWindow;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public void setNewFile(JButton newFile) {
        this.newFile = newFile;
    }

    public void setOpenFile(JButton openFile) {
        this.openFile = openFile;
    }

    public void setSaveFile(JButton saveFile) {
        this.saveFile = saveFile;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
}
