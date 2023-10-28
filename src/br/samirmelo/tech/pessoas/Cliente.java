package br.samirmelo.tech.pessoas;

public class Cliente extends Pessoa{
	public String codigo;
	public String profissao;
	
	public void cadastrar(String codigo, String profissao, String nome, String dataNascimento, String endereco, String telsContato) {
			this.codigo = codigo;
			this.profissao = profissao;
			setNome(nome);
			setDataNascimento(getDataNascimento1());
			setEndereco1(endereco);
			setTelsContato(telsContato);
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
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	

}
