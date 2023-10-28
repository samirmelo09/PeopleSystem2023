                //ID

package br.samirmelo.tech.pessoas;

import br.samirmelo.tech.composicao.Cargo;
import br.samirmelo.tech.composicao.Endereco;
import br.samirmelo.tech.composicao.TelsContato;

//ATRIBUTO

public class Funcionario extends Pessoa{
	private int matricula;
	private Cargo cargo;
	private double salario;
	private String dataAdmissao;
		
	//void não retorna nada
	
	            //MÉTODO
	
	public void cadastrar( int matricula, Cargo cargo, double salario, String dataAdmissao, String nome, String dataNascimento, Endereco endereco, TelsContato telsContato) {
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);		
	}
	
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * percentual;
	}
		
	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}	

}
