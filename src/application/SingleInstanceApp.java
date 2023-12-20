package application;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SingleInstanceApp {

    private static final int PORT = 9999;
    private static final String HOST = "localhost";
    private static ServerSocket serverSocket;
    private static ApplicationFrame mainFrame;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(PORT);
            new Thread(() -> {
                while (true) {
                    try (Socket socket = serverSocket.accept(); BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                        String message = in.readLine();
                        if ("BringToFront".equals(message)) {
                            bringToFront();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            createMainWindow();
        } catch (IOException e) {
            try {
                Socket clientSocket = new Socket(HOST, PORT);
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println("BringToFront");
                clientSocket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void createMainWindow() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    UIManager.put("MenuBar[Enabled].backgroundPainter", new Color(0, 0, 0));
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        mainFrame = new ApplicationFrame();
        mainFrame.setVisible(true);
    }

    private static void bringToFront() {
        if (mainFrame != null) {
            mainFrame.setState(JFrame.ICONIFIED); // Minimiza a janela
            mainFrame.setExtendedState(mainFrame.getExtendedState() & ~JFrame.ICONIFIED); // Restaura a janela
            mainFrame.toFront(); // Traz a janela à frente
        }
    }
}
