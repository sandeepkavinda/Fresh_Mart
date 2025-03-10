package model;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class AppIcon {
    public void setIcon(JFrame jFrame) {
        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource/icon.png")));
    }
}
