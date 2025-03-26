package com.notas.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    private static final String USERS_FILE = Paths.get("data", "users.txt").toString();

    public static boolean registerUser(String email, String password) {
        String hashedPassword = Authenticator.hashPassword(password);
        String userInfo = email + ":" + hashedPassword;

        try {
            Files.write(Paths.get(USERS_FILE), (userInfo + System.lineSeparator()).getBytes(StandardCharsets.UTF_8), //el lineSeparator es básicamente un salto de línea un \n
                    StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.out.println("No se pudo registrar el usuario: " + email);
            e.printStackTrace();
        }
        return false;
    }

    public static boolean verifyValidEmail(String correo) {
        return correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"); //retorna true si el correo concuerda con e patron
    }

    public static boolean verifyValidPassword(String password) {
        if (password.length() < 6){ 
            return false; 
        } else {
            return true;
        }
    }

    public static boolean validateUserCreado (String email) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(USERS_FILE), StandardCharsets.UTF_8);
            for (String line : lines) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].trim().equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo de usuarios.");
            e.printStackTrace();
        }
        return false;
    }
}
