package gestãoEmpresa;

public class funcionarioEmpresa {

	private String nome;
	private String dataNascimento;
	private String dataIngresso;
	private String banco;
	private int agencia;
	private int contaCorrente;
	private int bancodeHoras;//quantas horas a mais ele trabalha no dia (hora extra diária)
	private double salario;
	
	
	public String getNome() {
		return this.nome;//pega o nome do funcionário e retorna ele
	}
	
	public void setNome(String nome) {
		this.nome = nome;//pega o nome do funcionário e coloca na variável nome
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;//pega a data de nascimento do funcionário e retorna ela
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;//pega a data de nascimento do funcionário e coloca na variável dataNascimento
	}
	
	public String getDataIngresso() {
		return dataIngresso;//pega a data de ingresso do funcionário e retorna ela
	}

	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;//pega a data de ingresso do funcionário e coloca na variável dataIngresso
	}
	
	public String getBanco() {
		return this.banco;//pega o nome do banco do funcionário e retorna ele
	}
	
	public void setBanco(String banco) {
		this.banco = banco;//pega o nome do banco do funcionário e coloca na variável banco
	}

	public int getAgencia() {
		return this.agencia;//pega o número da agencia do funcionário e retorna ele
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;//pega o número da agencia do funcionário e coloca na variável agencia
	}
	
	public int getContaCorrente() {
		return this.contaCorrente;//pega o número da conta corrente do funcionário e retorna ele
	}
	
	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;//pega o número da conta corrente do funcionário e coloca na variável contaCorrente
	}
	
	public int getBancodeHoras() {
		return this.bancodeHoras;//pega a quantidade de horas extras do funcionário e retorna ela
	}
	
	public void setBancodeHoras(int bancodeHoras) {
		this.bancodeHoras = bancodeHoras;//pega a quantidade de horas extras do funcionário e coloca na variável bancodeHoras
	}
	
	public double getSalario() {
		return salario;//pega o salário do funcionário e retorna ele
	}

	public void setSalario(double salario) {
		this.salario = salario;//pega o salário do funcionário e coloca na variável salário
	}

	
	
	
}
