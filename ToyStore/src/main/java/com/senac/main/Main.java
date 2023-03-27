package com.senac.main;

import com.senac.principal.TelaPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            TelaPrincipal sistema = new TelaPrincipal();
            sistema.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }

}
