package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service; //aqui trazemos o repository do service

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping //metodo de criação
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/{id}")
    public Aluno get(@PathVariable Long id){
        return service.get(id);
    }
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
        return service.getAllAvaliacaoFisica(id);
    }
    @PutMapping(value = "/{id}")
    public Aluno updateAluno(@PathVariable Long id,@RequestBody AlunoUpdateForm form){
        return service.update(id, form);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteAluno(@PathVariable Long id){
        service.delete(id);
    }

}
