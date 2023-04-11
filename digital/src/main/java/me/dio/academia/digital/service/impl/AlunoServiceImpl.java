package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Aqui ficara toda a lógica
@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    private AlunoRepository repository; //
    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll(); //aqui estamos utilizando o JpaRepository
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        Aluno aluno = repository.findById(id).get();
        formUpdate.setNome(aluno.getNome());
        formUpdate.setBairro(aluno.getBairro());
        formUpdate.setDateNascimento(aluno.getDataNascimento());
        return repository.save(aluno);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvalicoes();
    }

}
