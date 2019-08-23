package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.model.Resposta;
import br.com.alura.forum.model.Usuario;

public class RespostaDto {

	private Long id;
	private String mensagem;
	private String nomeAutor;
	private String emailAutor;
	private LocalDateTime dataCriacao;
	
	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.nomeAutor = resposta.getAutor().getNome();
		this.emailAutor = resposta.getAutor().getEmail();
		this.dataCriacao = resposta.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public String getEmailAutor() {
		return emailAutor;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}	
	
}
