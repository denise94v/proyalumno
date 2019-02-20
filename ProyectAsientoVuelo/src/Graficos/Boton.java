
package Graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author hp
 */
public class Boton extends JButton implements ActionListener{

    

    public Boton(int posx,int posy,int ancho, int alto) {
    setBounds(posx, posy, ancho, alto);
    addActionListener(this);
    }
    public void CambiarN(int x,int y){
        setText((x+1)+"-"+(y+1));
    
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(Color.pink);
    }

   
        
   
}
   
