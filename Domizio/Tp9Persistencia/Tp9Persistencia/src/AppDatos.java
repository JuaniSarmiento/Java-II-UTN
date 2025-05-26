import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class AppDatos extends JFrame {
    private ArrayList<Registro> registros = new ArrayList<>();
    private final File archivo = new File("datosGuardados.ser");
    private boolean datosGuardados = false;

    public AppDatos() {
        setTitle("Gestor de Datos");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnEscribir = new JButton("Escribir archivo de datos");
        JButton btnLeer = new JButton("Leer los datos guardados");
        JButton btnTerminar = new JButton("Terminar");

        add(btnEscribir);
        add(btnLeer);
        add(btnTerminar);

        btnEscribir.addActionListener(e -> mostrarFormulario());
        btnLeer.addActionListener(e -> leerDatos());
        btnTerminar.addActionListener(e -> terminarPrograma());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void mostrarFormulario() {
        JTextField campoTexto = new JTextField(15);

        JRadioButton opcion1 = new JRadioButton("Opción A");
        JRadioButton opcion2 = new JRadioButton("Opción B");
        ButtonGroup grupoOpciones = new ButtonGroup();
        grupoOpciones.add(opcion1);
        grupoOpciones.add(opcion2);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese texto:"));
        panel.add(campoTexto);
        panel.add(new JLabel("Seleccione una opción:"));
        panel.add(opcion1);
        panel.add(opcion2);

        int result = JOptionPane.showConfirmDialog(null, panel, "Ingresar datos", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String texto = campoTexto.getText();
            String opcionElegida = opcion1.isSelected() ? "Opción A" : opcion2.isSelected() ? "Opción B" : "Ninguna";

            if (texto.isEmpty() || opcionElegida.equals("Ninguna")) {
                JOptionPane.showMessageDialog(this, "Por favor complete ambos campos.");
                return;
            }

            registros.add(new Registro(texto, opcionElegida));
            guardarDatos();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(registros);
            datosGuardados = true;
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
    }

    private void leerDatos() {
        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this, "Aún no se guardaron datos.");
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            registros = (ArrayList<Registro>) in.readObject();
            if (registros.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El archivo está vacío.");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Registro r : registros) {
                    sb.append(r.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(this, sb.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error al leer los datos: " + e.getMessage());
        }
    }

    private void terminarPrograma() {
        if (datosGuardados) {
            JOptionPane.showMessageDialog(this, "Archivo guardado en: " + archivo.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(this, "No se guardaron datos durante esta sesión.");
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppDatos::new);
    }
}
