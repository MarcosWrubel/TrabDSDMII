package gest�oEmpresa;

public class diretorEmpresa extends gerenteEmpresa { //Uso da heran�a de classes, coloquei o m�todo extends pra "puxar" todas as classes (nome, data de nascimento, sal�rio, setor, n�vel, entre outros) do gerente, e facilitar no c�digo

		private String departamento;
		private double valorParticipacaoLucros;
		
		public String getDepartamento() {
			return this.departamento;//pega o departamento em que o diretor trabalha e retorna ele
		}
		
		public void setDepartamento(String departamento) {
			this.departamento = departamento;//pega o departamento em que o diretor trabalha e coloca na vari�vel nome
		}
		
		public double getValorParticipacaoLucros() {
			return this.valorParticipacaoLucros;//pega o valor que o diretor ganha sobre os lucros da empresa e retorna ele
		}
		
		public void setValorParticipacaoLucros(double valorParticipacaoLucros) {
			this.valorParticipacaoLucros = valorParticipacaoLucros;//pega o valor que o diretor ganha sobre os lucros da empresa e coloca na vari�vel nome
		}
}
