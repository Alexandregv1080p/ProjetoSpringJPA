package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface AlunoService {

    /*
    Cria um aluno e salva no banco de dados
    @param form - formulario referente aos dados para criação
    @return - Aluno recém-criado
     */
    Aluno create(AlunoForm form);

    /*Retorna a matricula que esta no banco de dados
    @param id - id do aluno que sera exibido
    @return - aluno de acordo com o id fornecudi
     */
    Aluno getById(Long id);

    /*
    Retorna todos os alunos que estao dentro do banco de dados
     */

    List<Aluno> getAll();

    /*

     */
    Aluno update (Long id, AlunoUpdateForm formUpdate);

    /*
    Deleta um aluno especifico do banco de dados
     */

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);
}
