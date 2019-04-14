package gestãoEmpresa;

public class diretorEmpresa extends gerenteEmpresa { //Uso da herança de classes, coloquei o método extends pra "puxar" todas as classes (nome, data de nascimento, salário, setor, nível, entre outros) do gerente, e facilitar no código

		private String departamento;
		private double valorParticipacaoLucros;
		
		public String getDepartamento() {
			return this.departamento;//pega o departamento em que o diretor trabalha e retorna ele
		}
		
		public void setDepartamento(String departamento) {
			this.departamento = departamento;//pega o departamento em que o diretor trabalha e coloca na variável nome
		}
		
		public double getValorParticipacaoLucros() {
			return this.valorParticipacaoLucros;//pega o valor que o diretor ganha sobre os lucros da empresa e retorna ele
		}
		
		public void setValorParticipacaoLucros(double valorParticipacaoLucros) {
			this.valorParticipacaoLucros = valorParticipacaoLucros;//pega o valor que o diretor ganha sobre os lucros da empresa e coloca na variável nome
		}
}
