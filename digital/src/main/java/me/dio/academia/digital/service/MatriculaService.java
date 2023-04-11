package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;

import java.util.List;

public interface MatriculaService {
    /*
    Cria uma Matricula e salva no banco de dados
    @param form - formulario referente aos dados para criação
    @return - Aluno recém-criado
     */
    Matricula create(MatriculaForm form);

    /*Retorna a matricula que esta no banco de dados
    @param id - id do aluno que sera exibido
    @return - aluno de acordo com o id fornecudi
     */

    Matricula get(Long id);
    /*
        Retorna todas as Matricula que estao dentro do banco de dados
    */
    List<Matricula> getAll();

    /*
    Deleta uma Matricula especifico do banco de dados
     */
    void delete(Long id);
}
