
package PlataformaEducativa;

import java.awt.Graphics;
import java.awt.Image;
 
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLogin extends JPanel{
    
    // Atributo que guardara la imagen de Background que le pasemos.
    private Image background;
    private JLabel Usuario = new JLabel();

    // Metodo que es llamado automaticamente por la maquina virtual Java cada vez que repinta
    public void paint(Graphics g) {

        background = new ImageIcon(getClass().getResource("/Recursos/FondoRegistro.jpg")).getImage();
        
    	g.drawImage(background, 0, 0, getWidth(), getHeight(), this);

	// Mandamos que pinte la imagen en el panel
	setOpaque(false);
        setEnabled(true);
	super.paint(g);
    }
    
    

      
    
}
