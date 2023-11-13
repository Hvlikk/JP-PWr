import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWinLogic {

    private MainWin mainWin;
    private Database database;

    public MainWinLogic(MainWin mainWin, Database database){
        this.database = database;
        this.mainWin = mainWin;
        setListeners();
    }

    public void setListeners(){

        mainWin.getAddProduct().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                database.getDatabase().add(new Product(mainWin.getTextField().toString()));
            }
        });

        mainWin.getRemoveProduct().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index
                database.getDatabase().remove(index);
            }
        });
    }

    public Database getDatabase() {
        return database;
    }
}
