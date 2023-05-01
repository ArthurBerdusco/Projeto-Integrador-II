package com.senac.utils;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

public class CampoTextoPadrao {

    public static void focar(JComponent campo) {
        campo.setBorder(BorderFactory.createLineBorder(Color.black));
        campo.setBackground(new Color(255, 255, 220));
    }

    public static void desfocar(JComponent campo) {
        campo.setBorder(BorderFactory.createLineBorder(new Color(190, 204, 200)));
        campo.setBackground(Color. WHITE);
    }
    
    
}
