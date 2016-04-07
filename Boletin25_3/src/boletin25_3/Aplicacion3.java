package boletin25_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class Aplicacion3 implements ActionListener{
    JFrame marco;
    JPanel panel1;
    JLabel lEtiqueta;
    JButton bSaudo,bDespedida;
    
    public void ventana(){
     marco = new JFrame("Exercicio 3");
        marco.setSize(500,500);
     panel1 = new JPanel();
     lEtiqueta = new JLabel();
     bSaudo = new JButton("Saudo");
     bDespedida= new JButton("Despedida");
        bSaudo.addActionListener(this);
        bDespedida.addActionListener(this);
        
     panel1.add(lEtiqueta);
     panel1.add(bSaudo);
     panel1.add(bDespedida);
     
     marco.add(panel1);
     marco.setLocationRelativeTo(null);
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     marco.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
        if(obx == bSaudo)
            lEtiqueta.setText("Un saudo a DAM");
        else
            lEtiqueta.setText("Fin do programa");
    }
}
