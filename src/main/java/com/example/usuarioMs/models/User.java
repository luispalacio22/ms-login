package com.example.usuarioMs.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "usuario", unique = true, length = 20)
    private String username;

    @NotNull
    @Column(name = "password", length = 10)
    private String password;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    @Column(length = 100)
    private String email;


}
