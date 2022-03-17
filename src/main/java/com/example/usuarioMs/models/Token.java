package com.example.usuarioMs.models;

import org.springframework.stereotype.Component;

@Component
public class Token {
    private String token;
    private boolean autenticacion;

    public boolean getAutenticacion() {
        return autenticacion;
    }

    public void setAutenticacion(boolean autenticacion) {
        this.autenticacion = autenticacion;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
