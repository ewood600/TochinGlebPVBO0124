package package16;

import javax.swing.*;
import java.awt.*;

public class ColorChoice extends JFrame {
    private JTextArea textArea;

    public ColorChoice() {
        initializeUI();
    }

    private void initializeUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        JMenuBar menuBar = getjMenuBar();
        setJMenuBar(menuBar);
    }

    private JMenuBar getjMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = getjMenu();
        JMenu fontMenu = new JMenu("шрифт");
        JMenuItem timesItem = new JMenuItem("Times New Roman");
        JMenuItem sansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierItem = new JMenuItem("Courier New");
        timesItem.addActionListener(e -> setFont("Times New Roman"));
        sansSerifItem.addActionListener(e -> setFont("MS Sans Serif"));
        courierItem.addActionListener(e -> setFont("Courier New"));
        fontMenu.add(timesItem);
        fontMenu.add(sansSerifItem);
        fontMenu.add(courierItem);
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        return menuBar;
    }

    private JMenu getjMenu() {
        JMenu colorMenu = new JMenu("цвет");
        JMenuItem blueItem = new JMenuItem("синий");
        JMenuItem redItem = new JMenuItem("красный");
        JMenuItem blackItem = new JMenuItem("чёрный");
        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));
        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        return colorMenu;
    }

    private void setFont(String fontName) {
        Font currentFont = textArea.getFont();
        textArea.setFont(new Font(fontName, currentFont.getStyle(), currentFont.getSize()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorChoice().setVisible(true);
        });
    }
}
