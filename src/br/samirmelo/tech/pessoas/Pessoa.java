package br.samirmelo.tech.pessoas;

import br.samirmelo.tech.composicao.Endereco;
import br.samirmelo.tech.composicao.TelsContato;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private TelsContato telsContato;
	
	public void cadastrar(String nome, String dataNascimento, Endereco endereco, TelsContato telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}	
	public int obterIdade() {
		int idade = 0;
		//subtrair ano atual - ano de nascimento
		return idade;
		
				
	// generate getters and setters
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public TelsContato getTelsContato() {
		return telsContato;
	}
	public void setTelsContato(TelsContato telsContato) {
		this.telsContato = telsContato;
	}


}
