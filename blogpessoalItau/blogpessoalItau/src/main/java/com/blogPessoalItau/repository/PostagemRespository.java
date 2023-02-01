package com.blogPessoalItau.repository;

import com.blogPessoalItau.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRespository extends JpaRepository<Postagem, Long> {

}
