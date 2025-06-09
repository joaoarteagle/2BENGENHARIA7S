package com.avajava.avaEliel.DTOs;

import com.avajava.avaEliel.enums.Roles;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegisterRequest {
    @NotBlank(message = "Nome Obrigátorio")
    @Size(min = 2, max = 50, message = "Nome deve ter entre 2 e 50 caracteres")
    private String name;

    @NotBlank(message = "Email Obrigatório")
    @Email(message = "Email deve ser Válido")
    private String email;

    @NotBlank(message = "Senha é Obrigatória")
    @Size(min = 6, message = "A senha deve conter no minimo 6 caracteres")
    private String password;


    @NotNull(message = "Role é Obrigatória")
    private Roles role;


    public RegisterRequest(){

    }

    public RegisterRequest(String name, String email, String password, Roles role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Roles getRole() {
        return role;
    }
}
