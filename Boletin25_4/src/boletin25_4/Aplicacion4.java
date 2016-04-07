package boletin25_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class Aplicacion4 implements ActionListener{
    JFrame marco1,marco2;
    JPanel panel1,panel2;
    JButton bAccesoV2;
    
    public void ventana1(){
        marco1 = new JFrame("Exercicio 4 Venta 1");
            marco1.setSize(500,500);
        panel1 = new JPanel();
        bAccesoV2 = new JButton("Preme para ir a venta 2");
        
        bAccesoV2.addActionListener(this);
        
        panel1.add(bAccesoV2);
        marco1.add(panel1);
        
        marco1.setLocationRelativeTo(null);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true);
    }
    
    public void ventana2(){
         marco2 = new JFrame("Exercicio 4 Venta 2");
            marco2.setSize(500,500);
        panel2 = new JPanel();
 
        marco2.add(panel2);
        marco2.setLocationRelativeTo(null);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setVisible(true);
        marco1.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
        
        if(obx == bAccesoV2)
            ventana2();
            
    }
}
