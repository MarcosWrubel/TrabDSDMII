package gest�oEmpresa;

public class funcionarioEmpresa {

	private String nome;
	private String dataNascimento;
	private String dataIngresso;
	private String banco;
	private int agencia;
	private int contaCorrente;
	private int bancodeHoras;//quantas horas a mais ele trabalha no dia (hora extra di�ria)
	private double salario;
	
	
	public String getNome() {
		return this.nome;//pega o nome do funcion�rio e retorna ele
	}
	
	public void setNome(String nome) {
		this.nome = nome;//pega o nome do funcion�rio e coloca na vari�vel nome
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;//pega a data de nascimento do funcion�rio e retorna ela
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;//pega a data de nascimento do funcion�rio e coloca na vari�vel dataNascimento
	}
	
	public String getDataIngresso() {
		return dataIngresso;//pega a data de ingresso do funcion�rio e retorna ela
	}

	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;//pega a data de ingresso do funcion�rio e coloca na vari�vel dataIngresso
	}
	
	public String getBanco() {
		return this.banco;//pega o nome do banco do funcion�rio e retorna ele
	}
	
	public void setBanco(String banco) {
		this.banco = banco;//pega o nome do banco do funcion�rio e coloca na vari�vel banco
	}

	public int getAgencia() {
		return this.agencia;//pega o n�mero da agencia do funcion�rio e retorna ele
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;//pega o n�mero da agencia do funcion�rio e coloca na vari�vel agencia
	}
	
	public int getContaCorrente() {
		return this.contaCorrente;//pega o n�mero da conta corrente do funcion�rio e retorna ele
	}
	
	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;//pega o n�mero da conta corrente do funcion�rio e coloca na vari�vel contaCorrente
	}
	
	public int getBancodeHoras() {
		return this.bancodeHoras;//pega a quantidade de horas extras do funcion�rio e retorna ela
	}
	
	public void setBancodeHoras(int bancodeHoras) {
		this.bancodeHoras = bancodeHoras;//pega a quantidade de horas extras do funcion�rio e coloca na vari�vel bancodeHoras
	}
	
	public double getSalario() {
		return salario;//pega o sal�rio do funcion�rio e retorna ele
	}

	public void setSalario(double salario) {
		this.salario = salario;//pega o sal�rio do funcion�rio e coloca na vari�vel sal�rio
	}

	
	
	
}
