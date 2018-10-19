package convertidor;
import javax.swing.JOptionPane;

public class Convertidor {
    
    public static void main(String[] args) {
        String t;
        int time;
        
        t = JOptionPane.showInputDialog(null,"Ingresa los minutos que quieras convertir a segundos");
        
        time = Integer.parseInt(t);
        
        time = time * 60;
        
        JOptionPane.showMessageDialog(null,"En segundos es: "+ time);
    }
}
