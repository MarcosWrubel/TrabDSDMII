package gestãoEmpresa;

public class gerenteEmpresa extends funcionarioEmpresa { //Uso da herança de classes, coloquei o método extends pra "puxar" todas as classes (nome, data de nascimento, salário, entre outros) do funcionário, e facilitar no código
	
	private String setor;
	private int nivel;
	
	public String getSetor() {
		return this.setor;//pega o setor que o gerente trabalha e retorna ele
	}
	
	public void setSetor(String setor) {
		this.setor = setor;//pega o setor que o gerente trabalha e coloca na variável nome
	}
	
	public int getNivel() {
		return this.nivel;//pega em que nível que o gerente trabalha e retorna ele
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;//pega em que nível que o gerente trabalha e coloca na variável nome
	}
}
