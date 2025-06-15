package com.avajava.avaEliel.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UpdateUserRequest {
    @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
    private String username;

    @Email(message = "Email deve ser válido")
    private String login;

    @Size(min = 6, message = "Senha deve ter pelo menos 6 caracteres")
    private String password;


    public UpdateUserRequest() {
    }

    public UpdateUserRequest(String username, String login, String password) {
        this.username = username;
        this.login = login;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
