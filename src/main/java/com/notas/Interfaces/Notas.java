package com.notas.Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import com.notas.controller.notesController;
import com.notas.model.User;

public class Notas {
    private User user;
    private JFrame ventana;
    private JLabel header, titulo, tituloBuscar;
    private JTextField tituloNota, textoBuscar;
    private JTextArea textoNota;
    private DefaultListModel<String> almacenamientoNotas;
    private JList<String> listaNotasGuardadas;
    private JButton botonGuardar, botonEditar, botonEliminar, botonLimpiar, botonBuscar, botonTutorial;
    Color fondoOscuro, letrasColor, botonOscuro, bordeColor;

    public Notas(String email) {
        ventana = new JFrame(email);
        user = new User(email);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1600, 900);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout(10, 10));
        
        // colores que van a tener los distintons elementos
        fondoOscuro = new Color(32, 36, 33);
        letrasColor = new Color(231, 234, 230);
        botonOscuro = new Color(52, 53, 58);
        bordeColor = new Color(112, 104, 107);

        ventana.getContentPane().setBackground(fondoOscuro);



        JPanel panelHeader = new JPanel(new FlowLayout());
        panelHeader.setBackground(fondoOscuro);
        header = new JLabel("NOTILAB");
        header.setFont(new Font("Tahoma", Font.BOLD, 70));
        header.setForeground(letrasColor);
        panelHeader.setBorder(BorderFactory.createLineBorder(bordeColor, 1));

      
        ImageIcon icono = new ImageIcon(getClass().getResource("/logo.png"));
        Image img = icono.getImage().getScaledInstance(65, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(img);
        JLabel logo = new JLabel(iconoRedimensionado);
        panelHeader.add(header);
        panelHeader.add(logo, FlowLayout.LEFT);
        ventana.add(panelHeader, BorderLayout.NORTH);



        JPanel panelGeneral = new JPanel(new BorderLayout());
        panelGeneral.setBackground(fondoOscuro);
        panelGeneral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        JPanel panelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER, 25, 10));
        panelTitulo.setBackground(fondoOscuro);
        titulo = new JLabel("Título de la nota:");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
        titulo.setForeground(new Color(189, 189, 189));
        tituloNota = new JTextField(25);
        diseñoInputs(tituloNota);
        panelTitulo.add(titulo);
        panelTitulo.add(tituloNota);


        textoNota = new JTextArea();
        textoNota.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 15));
        textoNota.setBorder(BorderFactory.createCompoundBorder(textoNota.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        textoNota.setBackground(botonOscuro);
        textoNota.setForeground(letrasColor);
        textoNota.setCaretColor(letrasColor);


        JScrollPane scrollTexto = new JScrollPane(textoNota);
        scrollTexto.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 1));
        scrollTexto.setBackground(fondoOscuro);
        scrollTexto.getViewport().setBackground(botonOscuro); 

        panelGeneral.add(panelTitulo, BorderLayout.NORTH);
        panelGeneral.add(scrollTexto, BorderLayout.CENTER);
        ventana.add(panelGeneral, BorderLayout.CENTER);



        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setBackground(fondoOscuro);
        panelLista.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));



        tituloBuscar = new JLabel("Buscardor: ");
        tituloBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
        tituloBuscar.setForeground(new Color(189, 189, 189));
        textoBuscar = new JTextField(10);
        diseñoInputs(textoBuscar);




        JPanel panelBuscar = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 11));
        panelBuscar.setBackground(fondoOscuro);
        panelBuscar.add(tituloBuscar);
        panelBuscar.add(textoBuscar);
        botonBuscar = new JButton("Buscar");
        diseñoDeBotoneBuscar(botonBuscar, botonOscuro, letrasColor); 

        panelBuscar.add(botonBuscar);



        almacenamientoNotas = new DefaultListModel<>();
        almacenamientoNotas = notesController.loadUserNotes(email);
        listaNotasGuardadas = new JList<>(almacenamientoNotas);
        listaNotasGuardadas.setBackground(botonOscuro);
        listaNotasGuardadas.setForeground(letrasColor);




        JScrollPane scrollLista = new JScrollPane(listaNotasGuardadas);
        scrollLista.setBackground(fondoOscuro);
        scrollLista.getViewport().setBackground(botonOscuro); 
        scrollLista.setBorder(BorderFactory.createCompoundBorder(textoNota.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        scrollLista.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 1));



        panelLista.add(panelBuscar, BorderLayout.NORTH);
        panelLista.add(scrollLista, BorderLayout.CENTER);
        ventana.add(panelLista, BorderLayout.WEST);

        


        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 5));
        panelBotones.setBackground(fondoOscuro);
        panelBotones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        botonGuardar = new JButton("Guardar nueva nota");
        botonEditar = new JButton("Guardar cambios");
        botonEliminar = new JButton("Eliminar");
        botonLimpiar = new JButton("Limpiar");
        botonTutorial = new JButton("Cómo se utiliza");
        



        diseñoDeBotones(botonGuardar, botonOscuro, letrasColor);
        diseñoDeBotones(botonEditar, botonOscuro, letrasColor);
        diseñoDeBotones(botonEliminar, new Color(187, 6, 0  ), letrasColor);
        diseñoDeBotones(botonLimpiar, botonOscuro, letrasColor);
        diseñoDeBotones(botonTutorial, botonOscuro, letrasColor);



        panelBotones.add(botonGuardar);
        panelBotones.add(botonEditar);
        panelBotones.add(botonEliminar);
        panelBotones.add(botonLimpiar);
        panelBotones.add(botonTutorial);

        ventana.add(panelBotones, BorderLayout.SOUTH);

        actionListeners();

        ventana.setVisible(true);
    }

    private void diseñoDeBotones(JButton boton, Color fondo, Color texto) {
        boton.setBackground(fondo);
        boton.setForeground(texto);
        boton.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 1));
        boton.setPreferredSize(new Dimension(150, 40));
        boton.setFocusPainted(false);
    }

    private void diseñoDeBotoneBuscar(JButton boton, Color fondo, Color texto) {
        boton.setBackground(fondo);
        boton.setForeground(texto);
        boton.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 1));
        boton.setPreferredSize(new Dimension(90, 20));
        boton.setFocusPainted(false);
    }

    public void diseñoInputs (JTextField textField) {
        textField.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 15));
        textField.setBackground(botonOscuro);
        textField.setForeground(letrasColor);
        textField.setCaretColor(letrasColor);
        textField.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 1));
    }

    public void actionListeners () {
        botonGuardar.addActionListener(e -> guardarNota());
        botonEditar.addActionListener(e -> editarNota());
        botonEliminar.addActionListener(e -> eliminarNota());
        botonLimpiar.addActionListener(e -> limpiarNota());
        botonTutorial.addActionListener(e -> listenerTutorial());
        botonBuscar.addActionListener(e -> buscanota());

        listaNotasGuardadas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    verNota();
                }
            }
        });
    }

    public void listenerTutorial() {


        JPanel panelGeneralTutorial = new JPanel();

        JDialog dialogo = new JDialog(ventana, "Cómo se utiliza", true);
        dialogo.setSize(700, 300); 
        dialogo.setLayout(new BorderLayout());
        dialogo.setLocationRelativeTo(ventana);
    
        JPanel panelDialogo = new JPanel(new BorderLayout());
        panelDialogo.setBackground(new Color(32, 36, 33));
    
        
        JPanel panelTexto = new JPanel();
        panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.Y_AXIS)); 
        panelTexto.setBackground(new Color(32, 36, 33));
        panelTexto.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
    
        
        JLabel labelGuardarNuevaNota = new JLabel("- |Guardar nueva nota| Guardará una nota nueva");
        JLabel labelGuardarCambios = new JLabel("- |Guardar cambios| Guardará LOS CAMBIOS que se hagan dentro de una nota YA CREADA");
        JLabel labelEliminar = new JLabel("- |Eliminar| Eliminará la o las notas de la lista izquierda, podrá eliminar varias manteniendo pulsado el CTRL y click");
        JLabel labelLimpiar = new JLabel("- |Limpiar| Limpiará TODOS los carácteres de la nota");
        JLabel labelBuscar = new JLabel("- |Buscar| Buscará las notas que encuentre dentro de la lista de notas según el texto que se inserte en el buscador");
    
        
        labelGuardarNuevaNota.setForeground(letrasColor);
        labelGuardarCambios.setForeground(letrasColor);
        labelEliminar.setForeground(letrasColor);
        labelLimpiar.setForeground(letrasColor);
        labelBuscar.setForeground(letrasColor);
    
        
        labelGuardarNuevaNota.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelGuardarCambios.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelEliminar.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelLimpiar.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelBuscar.setAlignmentX(Component.LEFT_ALIGNMENT);
    
        
        panelTexto.add(labelGuardarNuevaNota);
        panelTexto.add(Box.createRigidArea(new Dimension(0, 20))); 
        panelTexto.add(labelGuardarCambios);
        panelTexto.add(Box.createRigidArea(new Dimension(0, 20))); 
        panelTexto.add(labelEliminar);
        panelTexto.add(Box.createRigidArea(new Dimension(0, 20))); 
        panelTexto.add(labelLimpiar);
        panelTexto.add(Box.createRigidArea(new Dimension(0, 20))); 
        panelTexto.add(labelBuscar);
    
        
        JPanel panelBoton = new JPanel();
        panelBoton.setBackground(new Color(32, 36, 33));
    
        JButton botonCerrar = new JButton("Aceptar");
        botonCerrar.setBackground(botonOscuro);
        botonCerrar.setForeground(letrasColor);
        botonCerrar.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 1));
        botonCerrar.setPreferredSize(new Dimension(100, 30));
        botonCerrar.setFocusPainted(false);
        botonCerrar.addActionListener(e -> dialogo.dispose());
        panelBoton.add(botonCerrar);
    
        
        panelDialogo.add(panelTexto, BorderLayout.CENTER);
        panelDialogo.add(panelBoton, BorderLayout.SOUTH);
        dialogo.add(panelDialogo);
        dialogo.setVisible(true);
    }


    public void popUpError(String mensaje) {
        JDialog dialogo = new JDialog(ventana, "Error de Selección", true);
        dialogo.setSize(300, 130);
        dialogo.setLayout(new BorderLayout());
        dialogo.setLocationRelativeTo(ventana);
    
        JPanel panelDialogo = new JPanel(new BorderLayout());
        panelDialogo.setBackground(new Color(32, 36, 33));
        
        
        JPanel panelTextoDialogo = new JPanel();
        panelTextoDialogo.setBackground(new Color(32, 36, 33));
        JLabel etiqueta = new JLabel(mensaje);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panelTextoDialogo.add(etiqueta, BorderLayout.CENTER); 
    
        JPanel panelBoton = new JPanel();
        panelBoton.setBackground(new Color(32, 36, 33));
    
        JButton botonCerrar = new JButton("Aceptar");
        botonCerrar.setBackground(botonOscuro);
        botonCerrar.setForeground(letrasColor);
        botonCerrar.setBorder(BorderFactory.createLineBorder(new Color(120, 120, 120), 1));
        botonCerrar.setPreferredSize(new Dimension(100, 30));
        botonCerrar.setFocusPainted(false);
        botonCerrar.addActionListener(e -> dialogo.dispose());
        panelBoton.add(botonCerrar);
    
        panelDialogo.add(panelBoton, BorderLayout.SOUTH); 
        panelDialogo.add(panelTextoDialogo, BorderLayout.CENTER);
        dialogo.add(panelDialogo);
        dialogo.setVisible(true);
    }

    public void cargarNotas() {
        
    }

    public void guardarNota () {
        String tituloDeNota = tituloNota.getText();
        String cuerpoDeNota = textoNota.getText();

        if (tituloDeNota.equals("") && cuerpoDeNota.equals("")) {
            popUpError("La nota está vacía");
        } else {
            almacenamientoNotas.addElement("• Título: " + tituloDeNota + "  |  " + cuerpoDeNota);
            limpiarNota();
            user.guardarNota(notesController.castDefaultListModelToList(almacenamientoNotas));
        }
    }

    public void editarNota () {
        int eleccion = listaNotasGuardadas.getSelectedIndex();
        almacenamientoNotas.set(eleccion, "• Título: " + tituloNota.getText() + "  |  " + textoNota.getText());
    }

    public void eliminarNota () {
        int[] eleccion = listaNotasGuardadas.getSelectedIndices();
        int confirmacionEliminarNota = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar las notas seleccionadas?", "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
        
        
        if (eleccion.length <= 0) {
            popUpError("No hay notas seleccionadas!");
        } else {
            if (eleccion.length > 0 && confirmacionEliminarNota == JOptionPane.YES_OPTION) {
                for (int i = eleccion.length - 1; i >= 0; i--) {
                    almacenamientoNotas.remove(eleccion[i]);
                }
            }
        }   
    }

    public void limpiarNota () {
        tituloNota.setText("");
        textoNota.setText("");
    }

    public void buscanota() {
        String notaBuscada = textoBuscar.getText().toLowerCase();
    
        ListSelectionModel selectionModel = listaNotasGuardadas.getSelectionModel();
    
        for (int i = 0; i < almacenamientoNotas.size(); i++) {
            if (almacenamientoNotas.getElementAt(i).toLowerCase().contains(notaBuscada)) {
                selectionModel.addSelectionInterval(i, i);
            }
        }
    }

    public void verNota () {
        String notaSeleccionada = listaNotasGuardadas.getSelectedValue();

        
        if (notaSeleccionada!=null) { 
            //Tuve que buscar el split correcto (no hecho por mi)
            String[] partes = notaSeleccionada.split(" \\| ", 2);
            String titulo = partes[0].replace("• Título: ", "").trim();
            String contenido = partes.length > 1 ? partes[1].trim() : "";



            tituloNota.setText(titulo);
            textoNota.setText(contenido);
        }
    }
    
}


