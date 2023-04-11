package me.dio.academia.digital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL) // se eu excluir a matricula, excluo o aluno
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private LocalDateTime dataMatricula = LocalDateTime.now();
}
