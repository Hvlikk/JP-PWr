import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWin extends JFrame {
    private JFrame mainWin;
    private JList<Database> productList;
    private JButton addProduct, removeProduct;
    private JTextField textField;
    private MainWinLogic logic;

    public MainWin() throws HeadlessException{
        Database database = new Database();
        mainWin = new JFrame();
        mainWin.setTitle("Lista zakupow");
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.setSize(600,600);

        JPanel panel = new JPanel();
        textField = new JTextField(20);
        addProduct = new JButton("Dodaj");
        productList = new JList<>(logic.getDatabase());
        removeProduct = new JButton("Usun");

        panel.add(textField);
        panel.add(addProduct);
        panel.add(removeProduct);

        mainWin.add(panel);
    }

    @Override
    public void show() {
        mainWin.show();
    }


    public JButton getAddProduct() {
        return addProduct;
    }

    public JButton getRemoveProduct() {
        return removeProduct;
    }

    public JTextField getTextField() {
        return textField;
    }
}
