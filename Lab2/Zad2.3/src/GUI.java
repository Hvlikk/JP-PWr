import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends JFrame {
    public void runApp() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainWin mainWindow = new MainWin();
                    //MainWinLogic mainWinLogic = new MainWinLogic(mainWindow);
                    mainWindow.show();
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}
