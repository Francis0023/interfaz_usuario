import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forma2 {
    private JButton OKButton;
    private JTextField llenarnombre;
   JPanel MenuPrincipal;
    private JLabel textobd;

    public forma2() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba botton");
                textobd.setText("Prueba2 botton");

                textobd.setText(llenarnombre.getText());
            }
        });
    }
}
