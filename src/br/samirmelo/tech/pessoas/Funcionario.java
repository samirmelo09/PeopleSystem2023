                //ID

package br.samirmelo.tech.pessoas;

//ATRIBUTO

public class Funcionario extends Pessoa{
	private int matricula;
	private String cargo;
	private double salario;
	private String dataAdmissao;
		
	//void n�o retorna nada
	
	            //M�TODO
	
	public void cadastrar( int matricula, String cargo, double salario, String dataAdmissao, String nome, String dataNascimento, String endereco, String telsContato) {
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
		
	public void promover(String novoCargo) {
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
	public String getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}	

}
