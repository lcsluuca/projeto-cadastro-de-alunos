package view;

import javax.swing.JFrame;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestão Escolar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setContentPane(new MainView());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}