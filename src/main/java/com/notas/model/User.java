package com.notas.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;

    public User(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean guardarNota(List<String> notas) {
        
        String separador = "----------------------------------";

        List<String> nuevasNotas = new ArrayList<>(); 
        for (int i = 0; i < notas.size(); i++) {
            nuevasNotas.add(separador);
            nuevasNotas.add(notas.get(i));
        }

        String filePath = "data/users_data/" + email + ".txt";
        try {
            Files.write(Paths.get(filePath), nuevasNotas, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            return true;
        } catch (IOException e) {  //Se utiliza IOException debido a que se realizan operaciones de lectura y escritura de archivos --> https://learn.microsoft.com/es-es/dotnet/api/system.io.ioexception?view=net-8.0
            System.out.println("❌ No se pudieron guardar las notas para: " + email);
            e.printStackTrace();
            return false;
        }
    }
    
}
