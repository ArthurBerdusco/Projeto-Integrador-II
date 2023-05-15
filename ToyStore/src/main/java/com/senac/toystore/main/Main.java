package com.senac.toystore.main;

import com.senac.toystore.view.login.Login;
import javax.swing.UIManager;


public class Main {

    public static void main(String[] args) {
        try {
            //"javax.swing.plaf.metal.MetalLookAndFeel"  ~~METAL
            //"com.sun.java.swing.plaf.windows.WindowsLookAndFeel" ~~ WINDOWS
            //"javax.swing.plaf.nimbus.NimbusLookAndFeel":  ~~ NIMBUS
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.put("Table.focusCellBackground", UIManager.getColor("Table.background"));
            new Login().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
