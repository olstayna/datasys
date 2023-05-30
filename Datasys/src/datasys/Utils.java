package datasys;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Utils {
    
    public void setIconImage(JFrame jframe) {
        jframe.setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/logo_colorido.png"));
    }
}
