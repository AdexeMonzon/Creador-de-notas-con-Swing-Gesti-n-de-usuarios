package com.notas.app;

import com.notas.Interfaces.LoginView;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
   public static void main(String args[]) {
    
       
       try {
            // Cambiar LookAndFeel a Nimbus (si está disponible)
            UIManager. setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
            InstantiationException | IllegalAccessException e) {
            System.out.println("Metal no está disponible.");
            }
       
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new LoginView().setVisible(true);
        }
    });
}
}
