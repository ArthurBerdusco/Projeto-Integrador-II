package com.senac.main;

import com.senac.principal.TelaPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {
        try {
            //"javax.swing.plaf.metal.MetalLookAndFeel"
            //"com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
            //"javax.swing.plaf.nimbus.NimbusLookAndFeel": 
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.put("Table.focusCellBackground", UIManager.getColor("Table.background"));

            TelaPrincipal sistema = new TelaPrincipal();
            sistema.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
