package boletin25_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class Aplicacion1 implements ActionListener{
    JFrame marco;
    JPanel panel1;
    JButton bPremer;
    JLabel etiqueta;
    
    public void ventana(){
        marco = new JFrame("Exercicio 1");
        marco.setSize(500,500);
        panel1 = new JPanel();
        bPremer = new JButton("Premer");
        etiqueta = new JLabel();
        
        bPremer.addActionListener(this);
        
        panel1.add(bPremer);
        panel1.add(etiqueta);
        
        marco.add(panel1);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Premiches o boton");
    }
}
