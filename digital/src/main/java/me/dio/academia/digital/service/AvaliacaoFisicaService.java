package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {
    /*
    Cria uma AvaliacaoFisica e salva no banco de dados
    @param form - formulario referente aos dados para criação
    @return - AvaliacaoFisica recém-criada
     */
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    /*Retorna a AvaliacaoFisica que esta no banco de dados
    @param id - id do aluno que sera exibido
    @return - aluno de acordo com o id fornecudi
     */
    AvaliacaoFisica get(AvaliacaoFisicaForm form);

    /*
    Retorna todos os alunos que estao dentro do banco de dados
     */

    List<AvaliacaoFisica> getAll();

    /*Atualiza a avaliação física
    @param id - id que sera atualziado
    @param formUpdate - formularo referente a dados necessários para atualização
    @return - avaliação fisica recém-atualizada
     */
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
    /*
    Deleta uma AvaliacaoFisica especifica do banco de dados
     */
    void delete(Long id);
}
