import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowLogic {

    private MainWindow mainWindow;

    public MainWindowLogic(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setListeners();
    }

    private void setListeners(){
        mainWindow.getConvert().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convert();
            }
        });
    }

    private void convert(){
        try{
            String rawInput = mainWindow.getTextInput().getText();
            double value = Double.parseDouble(rawInput);
            String inputUnit = (String) mainWindow.getInput().getSelectedItem();
            String outputUnit = (String) mainWindow.getOutput().getSelectedItem();

            double result = conversion(value, inputUnit, outputUnit);
            mainWindow.getResult().setText("Wynik : " + result + " " + outputUnit);
        }
        catch (NumberFormatException e){
            mainWindow.getResult().setText("Wprowadz poprawna liczbe!");
        }
    }

    private double conversion(double value, String inpUnit, String outpUnit){
        if (inpUnit.equals("Metry") && outpUnit.equals("Centymetry"))
            return value * 100;
        else if (inpUnit.equals("Metry") && outpUnit.equals("Kilometry"))
            return value / 1000;
        else if (inpUnit.equals("Metry") && outpUnit.equals("Mile"))
            return value / 1609.344;
        else if (inpUnit.equals("Centymetry") && outpUnit.equals("Metry"))
            return value / 100;
        else if (inpUnit.equals("Centymetry") && outpUnit.equals("Kilometry"))
            return value / 10000;
        else if (inpUnit.equals("Centymetry") && outpUnit.equals("Mile"))
            return value / 160934.4;
        else if (inpUnit.equals("Kilometry") && outpUnit.equals("Centymetry"))
            return value * 10000;
        else if (inpUnit.equals("Kilometry") && outpUnit.equals("Metry"))
            return value * 100;
        else if (inpUnit.equals("Kilometry") && outpUnit.equals("Mile"))
            return value / 1.609344;
        else if (inpUnit.equals("Mile") && outpUnit.equals("Centymetry"))
            return value * 160934.4;
        else if (inpUnit.equals("Mile") && outpUnit.equals("Metry"))
            return value * 1609.344;
        else if (inpUnit.equals("Mile") && outpUnit.equals("Kilometry"))
            return value * 1.609344;
        else if (inpUnit.equals("Miligramy") && outpUnit.equals("Gramy"))
            return value / 1000;
        else if (inpUnit.equals("Miligramy") && outpUnit.equals("Kilogramy"))
            return value / 100000;
        else if (inpUnit.equals("Gramy") && outpUnit.equals("Miligramy"))
            return value * 1000;
        else if (inpUnit.equals("Gramy") && outpUnit.equals("Kilogramy"))
            return value / 1000;
        else if (inpUnit.equals("Kilogramy") && outpUnit.equals("Gramy"))
            return value * 1000;
        else if (inpUnit.equals("Kilogramy") && outpUnit.equals("Miligramy"))
            return value * 1000000;
        else{
            mainWindow.getResult().setText("Nieprawidlowy format!");
            return value;
        }
    }
}
