package me.dio.academia.digital.entity.form;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlunoForm {
    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;
}
