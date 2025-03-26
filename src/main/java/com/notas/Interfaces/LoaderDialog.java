package com.notas.Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LoaderDialog extends JDialog {

    public LoaderDialog(Frame parent, String message) {
        super(parent, true);
        setUndecorated(true); 
        initComponents(message);
        setSize(500, 350);
        setLocationRelativeTo(parent);
        
    }

    private void initComponents(String message) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.GRAY);


        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/loaderGif.gif"));
        JLabel gifLabel = new JLabel(icon, JLabel.CENTER);
        gifLabel.setOpaque(true);
        gifLabel.setBackground(Color.WHITE);
        panel.add(gifLabel, BorderLayout.CENTER);

        JLabel label = new JLabel(message, JLabel.CENTER);
        label.setForeground(Color.WHITE);
        panel.add(label, BorderLayout.SOUTH);
        

        add(panel);
    }

    
}
