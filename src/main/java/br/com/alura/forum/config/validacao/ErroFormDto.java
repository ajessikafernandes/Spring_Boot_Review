package br.com.alura.forum.config.validacao;

public class ErroFormDto {

	private String campo;
	private String mensagem;
	
	public ErroFormDto(String campo, String mensagem) {
		this.campo = campo;
		this.mensagem = mensagem;
	}
	
	public String getCampo() {
		return campo;
	}
	public String getMensagem() {
		return mensagem;
	}
}
