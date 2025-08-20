package br.com.fiap.spring_mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.spring_mvc.entity.Livro;
import br.com.fiap.spring_mvc.repository.LivroRepository;

@Service
public class LivroService {
  private final LivroRepository livroRepository;

  @Autowired
  public LivroService(LivroRepository livroRepository){
    this.livroRepository = livroRepository;
  }
  // CRUD
  public Livro createLivro(Livro livro){
    return livroRepository.save(livro);
  }
  public Livro readLivro(Long id){
    return livroRepository.findById(id).orElse(null);
  }
  public List<Livro> readLivros(){
    return livroRepository.findAll();
  }
  public Livro updateLivro(Livro livro){
    return livroRepository.save(livro);
  }
  public void deleteLivro(Long id){
    livroRepository.deleteById(id);
  }

}
