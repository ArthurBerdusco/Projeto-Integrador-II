package com.senac.main;

import com.senac.principal.TelaPrincipal;
import javax.swing.UIManager;


public class Main {

    public static void main(String[] args) {
        try {
            //"javax.swing.plaf.metal.MetalLookAndFeel"  ~~METAL
            //"com.sun.java.swing.plaf.windows.WindowsLookAndFeel" ~~ WINDOWS
            //"javax.swing.plaf.nimbus.NimbusLookAndFeel":  ~~ NIMBUS
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.put("Table.focusCellBackground", UIManager.getColor("Table.background"));

            TelaPrincipal sistema = new TelaPrincipal();
            sistema.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
