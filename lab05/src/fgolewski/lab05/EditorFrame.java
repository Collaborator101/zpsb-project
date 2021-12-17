package fgolewski.lab05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EditorFrame extends JFrame {
    private JButton buttonOpen;
    private JButton buttonSave;
    private JButton buttonAbout;
    private JTextArea editText;
    private JPanel panelClient;
    private JTextPane textPane1;
    private JEditorPane editorPane1;

    public EditorFrame() {
        super("Edytor tekstowy");
        this.setContentPane(panelClient);
        this.pack();
        buttonOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
        buttonAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAboutDialog();
            }
        });
    }

    JFileChooser fileChooser;

    private JFileChooser getFileChooser() {
        if (fileChooser == null) {
            this.fileChooser = new JFileChooser();
            this.fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        }
        return fileChooser;
    }

    private void openFile() {
        var fileChooser = getFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                String content = Files.readString(Path.of(selectedFile.getAbsolutePath()));
                editText.setText(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveFile() {
        var fileChooser = getFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String content = editText.getText();
            try {
                Files.writeString(Path.of(selectedFile.getAbsolutePath()), content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showAboutDialog() {
        JOptionPane.showMessageDialog(this,
                "Informacje o programie\nTym programie",
                "O programie",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
