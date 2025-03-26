package com.notas.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.notas.model.User;

public class GestorUsuarios {
     private static final String USERS_DATA_FOLDER = Paths.get("data", "users_data").toString();

    public static User loadUserInfo(String email) {
        String fileName = email + ".txt";
        String filePath = Paths.get(USERS_DATA_FOLDER, fileName).toString();
        if (Files.exists(Paths.get(filePath))) {
            return new User(email);
        } else {
            System.out.println("❌ No se encontró el archivo para el usuario: " + email);
        }
        return null;
    }



    public static void crearTxtUser(String email) {
        String fileName = email + ".txt";
        String filePath = Paths.get(USERS_DATA_FOLDER, fileName).toString();
        try {
            Files.createFile(Paths.get(filePath));
            System.out.println("✔ Archivo creado para el usuario: " + email);
        } catch (IOException e) {
            System.out.println("❌ No se pudo crear el archivo para el usuario: " + email);
            e.printStackTrace();
        }
    }
}
