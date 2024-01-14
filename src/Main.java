import javax.swing.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Francis Aconda
        // contenedor de la pantalla
//        //creo un objeto de la clase JFrame
          JFrame frame = new JFrame ("Primera pantalla");
          frame.setContentPane(new forma2().MenuPrincipal);
//        //defino un boton para cerrar
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize (200,200);

          //Muestra todos los elementos qu existen
          frame.pack();


//        //creo un objeto de la clase JButton, creo un boton, el cual mostrará la palabra click
//        JButton button1=new JButton("Click");
//        JButton button2=new JButton("Atras");
//        //traigo el contenido del batón hacia la ventana
//        frame.getContentPane().add(button1);
//        frame.getContentPane().add(button2);
//        // Muestra lo que se creo del frame
          frame.setVisible(true);





    }
}

