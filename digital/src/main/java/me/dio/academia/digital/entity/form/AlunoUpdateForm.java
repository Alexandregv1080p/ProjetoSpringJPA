package me.dio.academia.digital.entity.form;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlunoUpdateForm {
    private String nome;

    private String bairro;

    private LocalDate dataDeNascimento;
}
