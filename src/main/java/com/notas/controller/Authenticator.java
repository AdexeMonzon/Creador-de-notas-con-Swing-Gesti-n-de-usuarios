package com.notas.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Authenticator {

    private static final String USERS_FILE = Paths.get("data", "users.txt").toString();

    // Metodo que verifica la info del usuario
    public static boolean verifyCredentials(String email, String password) {
        String hashedPassword = hashPassword(password);
        try {
            List<String> lines = Files.readAllLines(Paths.get(USERS_FILE), StandardCharsets.UTF_8);
            for (String line : lines) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].trim().equals(email) && parts[1].trim().equals(hashedPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo de usuarios.");
            e.printStackTrace();
        }
        return false;
    }

    
    // Método que hashear la contraseña
    public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al generar hash de contraseña.", e);
        }
    }
}
