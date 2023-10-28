package br.samirmelo.tech.pessoas;

import br.samirmelo.tech.composicao.Profissao;
import br.samirmelo.tech.composicao.TelsContato;

public class Cliente extends Pessoa{
	public String codigo;
	public Profissao profissao;
	
	public void cadastrar(String codigo, Profissao profissao, String nome, String dataNascimento, String endereco, TelsContato telsContato) {
			this.codigo = codigo;
			this.profissao = profissao;
			setNome(nome);
			setDataNascimento(getDataNascimento1());
			setEndereco1(endereco);
			setTelsContato11(telsContato);
	}
	

	private void setTelsContato11(TelsContato telsContato) {
		// TODO Auto-generated method stub
		
	}


	private void setTelsContato1(TelsContato telsContato) {
		// TODO Auto-generated method stub
		
	}


	private void setTelContato(TelsContato telsContato) {
		// TODO Auto-generated method stub
		
	}


	private void setEndereco1(String endereco) {
		// TODO Auto-generated method stub
		
	}


	private String getDataNascimento1() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}


	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}


	public String getDataNascimento() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Profissao getProfissao() {
		return profissao;
	}
	
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
	
	

}
