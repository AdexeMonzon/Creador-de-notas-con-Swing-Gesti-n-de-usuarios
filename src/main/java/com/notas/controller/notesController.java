package com.notas.controller;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

public class notesController {
    private static final String USERS_DATA_FOLDER = Paths.get("data", "users_data").toString();

    public notesController() {
    }

   public static List castDefaultListModelToList (DefaultListModel<String> modelo) {
    List<String> listaNotas = new ArrayList<>();
    for (int i = 0; i < modelo.size(); i++) {
        listaNotas.add(modelo.getElementAt(i));
    }
    return listaNotas;
   }


   public static DefaultListModel<String> loadUserNotes (String email) {
        DefaultListModel<String> listaCargada = new DefaultListModel<>();
        String fileName = email + ".txt";
        String filePath = Paths.get(USERS_DATA_FOLDER, fileName).toString();

        try {
            List<String> lineas = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);

            for (String linea : lineas) {
                if (!linea.trim().isEmpty()) { 
                    String[] notas = linea.split("----------------------------------");

                    for (String nota : notas) {
                        listaCargada.addElement(nota.trim());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de notas: " + e.getMessage());
            e.printStackTrace();
        }

        return listaCargada;
    }
}
