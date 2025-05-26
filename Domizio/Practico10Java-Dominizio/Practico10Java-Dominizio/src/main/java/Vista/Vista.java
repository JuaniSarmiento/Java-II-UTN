<<<<<<< HEAD
package Vista;

import Modelo.Contador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vista extends JFrame {
    private static Contador contador = new Contador(0, 0, 0);
    private static boolean corriendo = false;
    private static boolean pausado = false;
    private static Thread hilo;

    public static void main(String[] args) {
        JFrame vista = new JFrame("Cronómetro Deluxe");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setSize(400, 250);
        vista.setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Campos de tiempo
        JTextField hora = crearCampoTiempo();
        JTextField minuto = crearCampoTiempo();
        JTextField segundo = crearCampoTiempo();

        // Panel de campos
        JPanel camposPanel = new JPanel(new FlowLayout());
        camposPanel.setBackground(new Color(30, 30, 30));
        camposPanel.add(hora);
        camposPanel.add(minuto);
        camposPanel.add(segundo);

        // Botones
        JButton btnIniciar = crearBoton("Iniciar", new Color(46, 204, 113));
        JButton btnPausar = crearBoton("Pausar", new Color(241, 196, 15));
        JButton btnDetener = crearBoton("Detener", new Color(231, 76, 60));
        JButton btnSeguir = crearBoton("Seguir", new Color(52, 152, 219));

        // Panel de botones
        JPanel botonesPanel = new JPanel(new FlowLayout());
        botonesPanel.setBackground(new Color(30, 30, 30));
        botonesPanel.add(btnIniciar);
        botonesPanel.add(btnPausar);
        botonesPanel.add(btnSeguir);
        botonesPanel.add(btnDetener);

        // Agregar todo al panel principal
        panel.add(camposPanel);
        panel.add(Box.createVerticalStrut(20));
        panel.add(botonesPanel);

        vista.add(panel);
        vista.setVisible(true);

        // Acción: Iniciar
        btnIniciar.addActionListener(e -> {
            if (hilo == null || !hilo.isAlive()) {
                corriendo = true;
                pausado = false;
                hilo = new Thread(() -> {
                    while (corriendo) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            return;
                        }

                        if (!pausado) {
                            avanzarTiempo();
                            SwingUtilities.invokeLater(() -> {
                                hora.setText(String.format("%02d", contador.getHora()));
                                minuto.setText(String.format("%02d", contador.getMinuto()));
                                segundo.setText(String.format("%02d", contador.getSegundo()));
                            });
                        }
                    }
                });
                hilo.start();
            }
        });

        // Acción: Pausar
        btnPausar.addActionListener(e -> pausado = true);

        // Acción: Seguir
        btnSeguir.addActionListener(e -> {
            if (corriendo && pausado) {
                pausado = false;
            }
        });

        // Acción: Detener
        btnDetener.addActionListener(e -> {
            corriendo = false;
            pausado = false;
            contador = new Contador(0, 0, 0);
            hora.setText("00");
            minuto.setText("00");
            segundo.setText("00");
        });
    }

    private static void avanzarTiempo() {
        int s = contador.getSegundo() + 1;
        int m = contador.getMinuto();
        int h = contador.getHora();

        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }

        contador = new Contador(h, m, s); // actualiza contador
    }

    private static JTextField crearCampoTiempo() {
        JTextField campo = new JTextField("00", 3);
        campo.setFont(new Font("Consolas", Font.BOLD, 36));
        campo.setHorizontalAlignment(JTextField.CENTER);
        campo.setEditable(false);
        campo.setBackground(new Color(44, 62, 80));
        campo.setForeground(Color.WHITE);
        return campo;
    }

    private static JButton crearBoton(String texto, Color color) {
        JButton boton = new JButton(texto);
        boton.setBackground(color);
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        return boton;
    }
}
=======
package Vista;

import Modelo.Contador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vista extends JFrame {
    private static Contador contador = new Contador(0, 0, 0);
    private static boolean corriendo = false;
    private static boolean pausado = false;
    private static Thread hilo;

    public static void main(String[] args) {
        JFrame vista = new JFrame("Cronómetro");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setSize(500, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField hora = new JTextField("00", 10);
        JTextField minuto = new JTextField("00", 10);
        JTextField segundo = new JTextField("00", 10);

        hora.setEditable(false);
        minuto.setEditable(false);
        segundo.setEditable(false);

        JButton empezar = new JButton("Empezar");
        JButton pausar = new JButton("Pausar");
        JButton reiniciar = new JButton("Reiniciar");

        // Mnemonics (tecla de acceso rápido)
        empezar.setMnemonic('E');
        pausar.setMnemonic('P');
        reiniciar.setMnemonic('R');

        panel.add(new JLabel("Horas"));
        panel.add(new JLabel("Minutos"));
        panel.add(new JLabel("Segundos"));
        panel.add(new JLabel());
        panel.add(new JLabel());
        
        // Fila 1: etiquetas
        JPanel fila1 = new JPanel(new FlowLayout());
        fila1.add(new JLabel("Horas"));
        fila1.add(new JLabel("Minutos"));
        fila1.add(new JLabel("Segundos"));

// Fila 2: campos de texto
        JPanel fila2 = new JPanel(new FlowLayout());
        fila2.add(hora);
        fila2.add(minuto);
        fila2.add(segundo);

// Fila 3: botones
        JPanel fila3 = new JPanel(new FlowLayout());
        fila3.add(empezar);
        fila3.add(pausar);
        fila3.add(reiniciar);

// Agregar las filas al panel principal
       panel.add(fila1);
        panel.add(fila2);
        panel.add(fila3);

        vista.add(panel);
        vista.add(panel);
        vista.setVisible(true);

        // Botón Empezar
        empezar.addActionListener(e -> {
            if (hilo == null || !hilo.isAlive()) {
                corriendo = true;
                pausado = false;
                hilo = new Thread(() -> {
                    while (corriendo) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            return;
                        }

                        if (!pausado) {
                            avanzarTiempo();
                            SwingUtilities.invokeLater(() -> {
                                hora.setText(String.format("%02d", contador.getHora()));
                                minuto.setText(String.format("%02d", contador.getMinuto()));
                                segundo.setText(String.format("%02d", contador.getSegundo()));
                            });
                        }
                    }
                });
                hilo.start();
            }
        });

        // Botón Pausar
        pausar.addActionListener(e -> pausado = true);

        // Botón Reiniciar
        reiniciar.addActionListener(e -> {
            corriendo = false;
            pausado = false;
            contador = new Contador(0, 0, 0);
            hora.setText("00");
            minuto.setText("00");
            segundo.setText("00");
        });

        // ENTER activa botón con foco
        KeyAdapter enterKey = new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    ((JButton) e.getSource()).doClick();
                }
            }
        };

        empezar.addKeyListener(enterKey);
        pausar.addKeyListener(enterKey);
        reiniciar.addKeyListener(enterKey);
    }

    private static void avanzarTiempo() {
        int s = contador.getSegundo() + 1;
        int m = contador.getMinuto();
        int h = contador.getHora();

        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }

        contador = new Contador(s, m, h); // actualizar con nuevos valores
    }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
