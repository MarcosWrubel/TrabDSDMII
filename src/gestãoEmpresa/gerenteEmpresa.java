package gest�oEmpresa;

public class gerenteEmpresa extends funcionarioEmpresa { //Uso da heran�a de classes, coloquei o m�todo extends pra "puxar" todas as classes (nome, data de nascimento, sal�rio, entre outros) do funcion�rio, e facilitar no c�digo
	
	private String setor;
	private int nivel;
	
	public String getSetor() {
		return this.setor;//pega o setor que o gerente trabalha e retorna ele
	}
	
	public void setSetor(String setor) {
		this.setor = setor;//pega o setor que o gerente trabalha e coloca na vari�vel nome
	}
	
	public int getNivel() {
		return this.nivel;//pega em que n�vel que o gerente trabalha e retorna ele
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;//pega em que n�vel que o gerente trabalha e coloca na vari�vel nome
	}
}
