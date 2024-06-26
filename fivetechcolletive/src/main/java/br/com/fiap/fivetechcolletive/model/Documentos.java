package br.com.fiap.fivetechcolletive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Documentos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocumentos;
    
    @NotBlank(message = "O CPF é obrigatório")
    private String cpf;
    
    @NotBlank(message = "O RG é obrigatório")
    private String rg;
}
