package fgolewski.lab05;

import javax.swing.*;

import java.awt.*;

import static javax.swing.UIManager.getSystemLookAndFeelClassName;

public class Main05 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }
        var frame = new EditorFrame();
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
