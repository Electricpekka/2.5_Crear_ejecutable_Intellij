import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

    public Main() {
        JLabel lblSaludo = new JLabel("Hola Mundo. Creando mi primer ejemplo");
        add(lblSaludo);

        /*Tamaño ventana*/
        this.setSize(200, 200);

        /*Titulo ventana*/
        this.setTitle("Pablo");

        /*Cerrar ventana*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}