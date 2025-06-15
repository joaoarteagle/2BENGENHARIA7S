package com.avajava.avaEliel.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UpdateUserRequest {

    @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
    private String name;

    @Email(message = "Email deve ser válido")
    private String email;

    @Size(min = 6, message = "Senha deve ter pelo menos 6 caracteres")
    private String password;

    // Construtores
    public UpdateUserRequest() {}

    public UpdateUserRequest(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters e Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
