package boletin25_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class Aplicacion2 implements ActionListener{
    JFrame marco;
    JPanel panel1;
    JButton bProg,bBases;
    
    public void ventana(){
        marco = new JFrame("CURSO DAM");
            marco.setSize(500,500);
        panel1 = new JPanel();
        bProg = new JButton("Programacion");
        bBases = new JButton("Bases");
        
        bProg.addActionListener(this);
        bBases.addActionListener(this);
        
        panel1.add(bProg);
        panel1.add(bBases);
        
        marco.add(panel1);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object obx = e.getSource();
       if(obx == bProg)
           marco.setTitle("Programacion");
       else
           marco.setTitle("Bases de Datos");
    }
}
