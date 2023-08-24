package com.bliblioteca.models.autor;

import com.bliblioteca.models.livro.Livro;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name ="autor")
public class Autor {
    private String nome;
    @ManyToMany(mappedBy = "autores")
    private List<Livro> livros;

}
