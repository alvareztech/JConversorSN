package com.danyalvarez.jconversorsn;

import javax.swing.*;

/**
 * JConversorSN
 * @author Daniel Alvarez
 */
public class Main {
    public static void main(String[] args) {
        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName())) {
                try {
                    UIManager.setLookAndFeel(laf.getClassName());
                } catch (Exception ex) {
                }
            }
        }
        Conversor X = new Conversor();
        X.setVisible(true);
    }
}
