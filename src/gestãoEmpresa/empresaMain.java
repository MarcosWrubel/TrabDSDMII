package gestãoEmpresa;
import java.util.Scanner;

public class empresaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//---------------------------------------------------------------------------------------------------------------------------
		funcionarioEmpresa funcionario1 = new funcionarioEmpresa();
		funcionarioEmpresa funcionario2 = new funcionarioEmpresa();
		funcionarioEmpresa funcionario3 = new funcionarioEmpresa();
		funcionarioEmpresa funcionario4 = new funcionarioEmpresa();
		funcionarioEmpresa funcionario5 = new funcionarioEmpresa();
		
		funcionario1.setNome("Lorenzo");
		funcionario1.setDataNascimento("06/04/2002");
		funcionario1.setDataIngresso("04/02/2018");
		funcionario1.setBanco("Itaú");
		funcionario1.setAgencia(15);
		funcionario1.setContaCorrente(120);
		funcionario1.setBancodeHoras(1);
		funcionario1.setSalario(4000.00);
		
		//Eu cadastrei todos os funcionários no mesmo banco e mesma agencia, pra facilitar, e ter meio que uma lógica para a empresa
		
		funcionario2.setNome("Bruno");
		funcionario2.setDataNascimento("16/08/1990");
		funcionario2.setDataIngresso("24/05/2016");
		funcionario2.setBanco("Itaú");
		funcionario2.setAgencia(15);
		funcionario2.setContaCorrente(121);
		funcionario2.setBancodeHoras(1);
		funcionario2.setSalario(2500.00);
		
		funcionario3.setNome("Andrey");
		funcionario3.setDataNascimento("19/01/1992");
		funcionario3.setDataIngresso("20/12/2013");
		funcionario3.setBanco("Itaú");
		funcionario3.setAgencia(15);
		funcionario3.setContaCorrente(122);
		funcionario3.setBancodeHoras(1);
		funcionario3.setSalario(3500.00);
		
		funcionario4.setNome("Jackson");
		funcionario4.setDataNascimento("13/03/1998");
		funcionario4.setDataIngresso("22/08/2015");
		funcionario4.setBanco("Itaú");
		funcionario4.setAgencia(15);
		funcionario4.setContaCorrente(123);
		funcionario4.setBancodeHoras(2);
		funcionario4.setSalario(3000.00);
		
		funcionario5.setNome("Fernando");
		funcionario5.setDataNascimento("09/03/2000");
		funcionario5.setDataIngresso("10/11/2017");
		funcionario5.setBanco("Itaú");
		funcionario5.setAgencia(15);
		funcionario5.setContaCorrente(124);
		funcionario5.setBancodeHoras(1);
		funcionario5.setSalario(4500.00);
		
		//Fiz esse trecho de código para quem manusear esse programa, poder consultar as informações de um funcionário 
		System.out.println("Id do funcionário:");
		int idFunc = scan.nextInt();
		
		if(idFunc == 1) {
		
			System.out.println("Nome do funcionário: "+ funcionario1.getNome());
			System.out.println("Data de nascimento do funcionário: "+ funcionario1.getDataNascimento());
			System.out.println("Data de ingresso do funcionário: "+ funcionario1.getDataIngresso());
			System.out.println("Nome do banco do funcionário: "+ funcionario1.getBanco());
			System.out.println("Agencia do funcionario: "+ funcionario1.getAgencia());
			System.out.println("Conta corrente do funcionario: "+ funcionario1.getContaCorrente());
			System.out.println("Quantidade de horas extras por dia do funcionario: "+ funcionario1.getBancodeHoras());
			System.out.println("Salário do funcionario: "+ funcionario1.getSalario());
		
		}
		
		else if(idFunc == 2) {
			
			System.out.println("Nome do funcionário: "+ funcionario2.getNome());
			System.out.println("Data de nascimento do funcionário: "+ funcionario2.getDataNascimento());
			System.out.println("Data de ingresso do funcionário: "+ funcionario2.getDataIngresso());
			System.out.println("Nome do banco do funcionário: "+ funcionario2.getBanco());
			System.out.println("Agencia do funcionario: "+ funcionario2.getAgencia());
			System.out.println("Conta corrente do funcionario: "+ funcionario2.getContaCorrente());
			System.out.println("Quantidade de horas extras por dia do funcionario: "+ funcionario2.getBancodeHoras());
			System.out.println("Salário do funcionario: "+ funcionario2.getSalario());
			
		}
		
		else if(idFunc == 3) {
			
			System.out.println("Nome do funcionário: "+ funcionario3.getNome());
			System.out.println("Data de nascimento do funcionário: "+ funcionario3.getDataNascimento());
			System.out.println("Data de ingresso do funcionário: "+ funcionario3.getDataIngresso());
			System.out.println("Nome do banco do funcionário: "+ funcionario3.getBanco());
			System.out.println("Agencia do funcionario: "+ funcionario3.getAgencia());
			System.out.println("Conta corrente do funcionario: "+ funcionario3.getContaCorrente());
			System.out.println("Quantidade de horas extras por dia do funcionario: "+ funcionario3.getBancodeHoras());
			System.out.println("Salário do funcionario: "+ funcionario3.getSalario());
			
		}
		
		else if(idFunc == 4) {
			
			System.out.println("Nome do funcionário: "+ funcionario4.getNome());
			System.out.println("Data de nascimento do funcionário: "+ funcionario4.getDataNascimento());
			System.out.println("Data de ingresso do funcionário: "+ funcionario4.getDataIngresso());
			System.out.println("Nome do banco do funcionário: "+ funcionario4.getBanco());
			System.out.println("Agencia do funcionario: "+ funcionario4.getAgencia());
			System.out.println("Conta corrente do funcionario: "+ funcionario4.getContaCorrente());
			System.out.println("Quantidade de horas extras por dia do funcionario: "+ funcionario4.getBancodeHoras());
			System.out.println("Salário do funcionario: "+ funcionario4.getSalario());
			
		}
		
		else if(idFunc == 5) {
			
			System.out.println("Nome do funcionário: "+ funcionario5.getNome());
			System.out.println("Data de nascimento do funcionário: "+ funcionario5.getDataNascimento());
			System.out.println("Data de ingresso do funcionário: "+ funcionario5.getDataIngresso());
			System.out.println("Nome do banco do funcionário: "+ funcionario5.getBanco());
			System.out.println("Agencia do funcionario: "+ funcionario5.getAgencia());
			System.out.println("Conta corrente do funcionario: "+ funcionario5.getContaCorrente());
			System.out.println("Quantidade de horas extras por dia do funcionario: "+ funcionario5.getBancodeHoras());
			System.out.println("Salário do funcionario: "+ funcionario5.getSalario());
			
		}
//-------------------------------------------------------------------------------------------------------------------------------
		
		gerenteEmpresa gerente1 = new gerenteEmpresa();
		gerenteEmpresa gerente2 = new gerenteEmpresa();
		gerenteEmpresa gerente3 = new gerenteEmpresa();
		
		gerente1.setNome("Ari");
		gerente1.setDataNascimento("20/07/1995");
		gerente1.setDataIngresso("18/06/2012");
		gerente1.setBanco("Santander");
		gerente1.setAgencia(55);
		gerente1.setContaCorrente(130);
		gerente1.setBancodeHoras(2);
		gerente1.setSalario(7000.00);
		gerente1.setSetor("Vendas");
		gerente1.setNivel(1); //Coloquei um nível qualquer TonTon porque eu não sabia o que era esse nível, não tinha entendido
		
		gerente2.setNome("João");
		gerente2.setDataNascimento("30/07/1997");
		gerente2.setDataIngresso("08/12/2010");
		gerente2.setBanco("Santander");
		gerente2.setAgencia(55);
		gerente2.setContaCorrente(131);
		gerente2.setBancodeHoras(2);
		gerente2.setSalario(7500.00);
		gerente2.setSetor("Comercial");
		gerente2.setNivel(1); //Coloquei um nível qualquer TonTon porque eu não sabia o que era esse nível, não tinha entendido
		
		gerente3.setNome("Yago");
		gerente3.setDataNascimento("20/07/1975");
		gerente3.setDataIngresso("11/05/2000");
		gerente3.setBanco("Santander");
		gerente3.setAgencia(55);
		gerente3.setContaCorrente(132);
		gerente3.setBancodeHoras(3);
		gerente3.setSalario(8000.00);
		gerente3.setSetor("Administrativo");
		gerente3.setNivel(1); //Coloquei um nível qualquer TonTon porque eu não sabia o que era esse nível, não tinha entendido
		
		//Fiz esse trecho de código para quem manusear esse programa, poder consultar as informações de um gerente 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Id do gerente:");
		int idGerente = scan.nextInt();
					
			if(idGerente == 1) {
					
				System.out.println("Nome do gerente: "+ gerente1.getNome());
				System.out.println("Data de nascimento do gerente: "+ gerente1.getDataNascimento());
				System.out.println("Data de ingresso do gerente: "+ gerente1.getDataIngresso());
				System.out.println("Nome do banco do gerente: "+ gerente1.getBanco());
				System.out.println("Agencia do gerente: "+ gerente1.getAgencia());
				System.out.println("Conta corrente do gerente: "+ gerente1.getContaCorrente());
				System.out.println("Quantidade de horas extras por dia do gerente: "+ gerente1.getBancodeHoras());
				System.out.println("Salário do gerente: "+ gerente1.getSalario());
				System.out.println("Setor que o gerente trabalha: "+ gerente1.getSetor());
				System.out.println("Nível do gerente: "+ gerente1.getNivel());
									
			}
					
			else if(idGerente == 2) {
						
				System.out.println("Nome do gerente: "+ gerente2.getNome());
				System.out.println("Data de nascimento do gerente: "+ gerente2.getDataNascimento());
				System.out.println("Data de ingresso do gerente: "+ gerente2.getDataIngresso());
				System.out.println("Nome do banco do gerente: "+ gerente2.getBanco());
				System.out.println("Agencia do gerente: "+ gerente2.getAgencia());
				System.out.println("Conta corrente do gerente: "+ gerente2.getContaCorrente());
				System.out.println("Quantidade de horas extras por dia do gerente: "+ gerente2.getBancodeHoras());
				System.out.println("Salário do gerente: "+ gerente2.getSalario());
				System.out.println("Setor que o gerente trabalha: "+ gerente2.getSetor());
				System.out.println("Nível do gerente: "+ gerente2.getNivel());		
						
			}
					
			else if(idGerente == 3) {
						
				System.out.println("Nome do gerente: "+ gerente3.getNome());
				System.out.println("Data de nascimento do gerente: "+ gerente3.getDataNascimento());
				System.out.println("Data de ingresso do gerente: "+ gerente3.getDataIngresso());
				System.out.println("Nome do banco do gerente: "+ gerente3.getBanco());
				System.out.println("Agencia do gerente: "+ gerente3.getAgencia());
				System.out.println("Conta corrente do gerente: "+ gerente3.getContaCorrente());
				System.out.println("Quantidade de horas extras por dia do gerente: "+ gerente3.getBancodeHoras());
				System.out.println("Salário do gerente: "+ gerente3.getSalario());
				System.out.println("Setor que o gerente trabalha: "+ gerente3.getSetor());
				System.out.println("Nível do gerente: "+ gerente3.getNivel());			
						
			}
//----------------------------------------------------------------------------------------------------------------------------
		
		diretorEmpresa diretor1 = new diretorEmpresa();
		diretorEmpresa diretor2 = new diretorEmpresa();
		
		diretor1.setNome("Tom");
		diretor1.setDataNascimento("29/10/1989");
		diretor1.setDataIngresso("11/05/2009");
		diretor1.setBanco("Santander");
		diretor1.setAgencia(87);
		diretor1.setContaCorrente(140);
		diretor1.setBancodeHoras(1);
		diretor1.setSalario(10000.00);
		diretor1.setSetor("Financeiro");
		diretor1.setNivel(1); //Coloquei um nível qualquer TonTon porque eu não sabia o que era esse nível, não tinha entendido
		diretor1.setDepartamento("Financeiro");
		diretor1.setValorParticipacaoLucros(1000.00);
		
		diretor2.setNome("Luciano");
		diretor2.setDataNascimento("29/10/1987");
		diretor2.setDataIngresso("01/10/2008");
		diretor2.setBanco("Santander");
		diretor2.setAgencia(87);
		diretor2.setContaCorrente(141);
		diretor2.setBancodeHoras(2);
		diretor2.setSalario(11500.00);
		diretor2.setSetor("Executivo");
		diretor2.setNivel(1); //Coloquei um nível qualquer TonTon porque eu não sabia o que era esse nível, não tinha entendido
		diretor2.setDepartamento("Administrativo");
		diretor2.setValorParticipacaoLucros(500.00);
		
		//Fiz esse trecho de código para quem manusear esse programa, poder consultar as informações de um diretor 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Id do diretor:");
		int idDiretor = scan.nextInt();
							
			if(idDiretor == 1) {
							
				System.out.println("Nome do diretor: "+ diretor1.getNome());
				System.out.println("Data de nascimento do diretor: "+ diretor1.getDataNascimento());
				System.out.println("Data de ingresso do diretor: "+ diretor1.getDataIngresso());
				System.out.println("Nome do banco do diretor: "+ diretor1.getBanco());
				System.out.println("Agencia do diretor: "+ diretor1.getAgencia());
				System.out.println("Conta corrente do diretor: "+ diretor1.getContaCorrente());
				System.out.println("Quantidade de horas extras por dia do diretor: "+ diretor1.getBancodeHoras());
				System.out.println("Salário do diretor: "+ diretor1.getSalario());
				System.out.println("Setor que o diretor trabalha: "+ diretor1.getSetor());
				System.out.println("Nível do diretor: "+ diretor1.getNivel());	
				System.out.println("Departamento do diretor: "+ diretor1.getDepartamento());
				System.out.println("Valor de participação nos lucros da empresa do diretor: "+ diretor1.getValorParticipacaoLucros());
							
			}
							
			else if(idDiretor == 2) {
								
				System.out.println("Nome do diretor: "+ diretor2.getNome());
				System.out.println("Data de nascimento do diretor: "+ diretor2.getDataNascimento());
				System.out.println("Data de ingresso do diretor: "+ diretor2.getDataIngresso());
				System.out.println("Nome do banco do diretor: "+ diretor2.getBanco());
				System.out.println("Agencia do diretor: "+ diretor2.getAgencia());
				System.out.println("Conta corrente do diretor: "+ diretor2.getContaCorrente());
				System.out.println("Quantidade de horas extras por dia do diretor: "+ diretor2.getBancodeHoras());
				System.out.println("Salário do diretor: "+ diretor2.getSalario());
				System.out.println("Setor que o diretor trabalha: "+ diretor2.getSetor());
				System.out.println("Nível do diretor: "+ diretor2.getNivel());	
				System.out.println("Departamento do diretor: "+ diretor2.getDepartamento());
				System.out.println("Valor de participação nos lucros da empresa do diretor: "+ diretor2.getValorParticipacaoLucros());				
								
			}
								
				//Parte da bonificação dos funcionários, gerentes e diretores
//------------------------------------------------------------------------------------------------------------------------------------				
				//Cálculo de quanto vai ser gasto pelos funcionários comuns até novembro:
				double calcFuncionarioNovembro = (funcionario1.getSalario() + funcionario2.getSalario() + funcionario3.getSalario() + funcionario4.getSalario() + funcionario5.getSalario() * 11);
				// Vezes 11 nessa conta acima foi pra calcular quanto foi o gasto até o fim de novembro, pois em dezembro foi adicionado uma bonificação pra cada um, daí calcularei separado essa bonificação
				
//-------------------------------------------------------------------------------------------------------------------------------------				
				
				//Salário do Funcionário1 + 2.5% de bonificação
				double func1Bonif = funcionario1.getSalario() + (funcionario1.getSalario() * 0.025);
				funcionario1.setSalario(func1Bonif);
				
				//Salário do Funcionário2 + 2.5% de bonificação
				double func2Bonif = funcionario2.getSalario() + (funcionario2.getSalario() * 0.025);
				funcionario2.setSalario(func2Bonif);
				
				//Salário do Funcionário3 + 2.5% de bonificação
				double func3Bonif = funcionario3.getSalario() + (funcionario3.getSalario() * 0.025);
				funcionario3.setSalario(func3Bonif);
				
				//Salário do Funcionário4 + 2.5% de bonificação
				double func4Bonif = funcionario4.getSalario() + (funcionario4.getSalario() * 0.025);
				funcionario4.setSalario(func4Bonif);
				
				//Salário do Funcionário5 + 2.5% de bonificação
				double func5Bonif = funcionario5.getSalario() + (funcionario5.getSalario() * 0.025);
				funcionario5.setSalario(func5Bonif);
				
//-----------------------------------------------------------------------------------------------------------------------------				
				
				//Esse valor vai ser o total dos salários dos funcionários comuns no mês de dezembro (junto as bonificações)
				double totalBonifFunc = func1Bonif + func2Bonif + func3Bonif + func4Bonif + func5Bonif;
				
				//Valor total gasto no ano pelos funcionários
				double totalSalarioAnualFunc = calcFuncionarioNovembro + totalBonifFunc;
				
				//Valor anual apenas das bonificações dos funcionários comuns:
				double valorAnualBonifFunc = (funcionario1.getSalario() * 0.025) + (funcionario2.getSalario() * 0.025) + (funcionario3.getSalario() * 0.025) + (funcionario4.getSalario() * 0.025) + (funcionario5.getSalario() * 0.025);
				
//--------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------
				
				//Cálculo de quanto vai ser gasto pelos gerentes até novembro:
				double calcGerenteNovembro = (gerente1.getSalario() + gerente2.getSalario() + gerente3.getSalario() * 11);
				// Vezes 11 nessa conta acima foi pra calcular quanto foi o gasto até o fim de novembro, pois em dezembro foi adicionado uma bonificação pra cada um, daí calcularei separado essa bonificação
				
//------------------------------------------------------------------------------------------------------------------------------------
				
				//Salário do Gerente1 + 5% de bonificação
				double geren1Bonif = gerente1.getSalario() + (gerente1.getSalario() * 0.05);
				gerente1.setSalario(geren1Bonif);
				
				//Salário do Gerente2 + 5% de bonificação
				double geren2Bonif = gerente2.getSalario() + (gerente2.getSalario() * 0.05);
				gerente2.setSalario(geren2Bonif);
				
				//Salário do Gerente3 + 5% de bonificação
				double geren3Bonif = gerente3.getSalario() + (gerente3.getSalario() * 0.05);
				gerente3.setSalario(geren3Bonif);
				
//--------------------------------------------------------------------------------------------------------------------------------------
				
				//Esse valor vai ser o total dos salários dos gerentes no mês de dezembro (junto as bonificações)
				double totalBonifGeren = geren1Bonif + geren2Bonif + geren3Bonif;
				
				//Valor total gasto no ano pelos gerentes
				double totalSalarioAnualGeren = calcGerenteNovembro + totalBonifGeren;
				
				//Valor anual apenas das bonificações dos gerentes:
				double valorAnualBonifGeren = (gerente1.getSalario() * 0.05) + (gerente2.getSalario() * 0.05) + (gerente3.getSalario() * 0.05);
				
//----------------------------------------------------------------------------------------------------------------------------------------	
//----------------------------------------------------------------------------------------------------------------------------------------
				
				//Cálculo de quanto vai ser gasto pelos diretores até novembro:
				double calcDiretorNovembro = (diretor1.getSalario() + diretor2.getSalario() * 11);
				// Vezes 11 nessa conta acima foi pra calcular quanto foi o gasto até o fim de novembro, pois em dezembro foi adicionado uma bonificação pra cada um, daí calcularei separado essa bonificação
				
//----------------------------------------------------------------------------------------------------------------------------------------
				
				//Salário do Diretor1 + 8% + valor de participação nos lucros
				double diret1Bonif = diretor1.getSalario() + (diretor1.getSalario() * 0.08) + 1000.00;
				diretor1.setSalario(diret1Bonif);
				//Salário do Diretor2 + 8% + valor de participação nos lucros
				double diret2Bonif = diretor2.getSalario() + (diretor2.getSalario() * 0.08) + 500.00;
				diretor2.setSalario(diret2Bonif);
				
//----------------------------------------------------------------------------------------------------------------------------------------
				
				//Esse valor vai ser o total dos salários dos diretores no mês de dezembro (junto as bonificações e ao valor de participação nos lucros)
				double totalBonifDiret = diret1Bonif + diret2Bonif;
				
				//Valor total gasto no ano pelos diretores
				double totalSalarioAnualDiret = calcDiretorNovembro + totalBonifDiret;
				
				//Valor anual apenas das bonificações dos diretores:
				double valorAnualBonifDiret = ((diretor1.getSalario() * 0.08) + 1000.00) + ((diretor2.getSalario() * 0.08) + 500.00);
//-----------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------
				
				//Controle Financeiro da Empresa:
				
				System.out.println("");
				System.out.println("Balanço Financeiro dessa empresa que fiz no final do ano:");
				
				//Valor anual dos salários:
				double gastoTotalEmpresaAnual = totalSalarioAnualFunc + totalSalarioAnualGeren + totalSalarioAnualDiret;
				System.out.println("Gasto total da empresa no ano com salários e bonificações: " +gastoTotalEmpresaAnual+ "R$");
				
				//Valor anual das bonificações:
				double gastoBonifEmpresaAnual = valorAnualBonifFunc + valorAnualBonifGeren + valorAnualBonifDiret;
				System.out.println("Gasto total da empresa no ano com bonificações: " +gastoBonifEmpresaAnual+ "R$");
				System.out.println("");
				
				//Lista dos funcionários com seus respectivos salários e bonificações em ordem decrescente do salário:
				System.out.println("Lista dos funcionários com seus respectivos salários e bonificações em ordem decrescente do salário:");
				System.out.println("");
				System.out.println("Diretor 2:");
				System.out.println("Nome do diretor: "+ diretor2.getNome());
				System.out.println("Salário do diretor: "+ diretor2.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Diretor 1:");
				System.out.println("Nome do diretor: "+ diretor1.getNome());
				System.out.println("Salário do diretor: "+ diretor1.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Gerente 3:");
				System.out.println("Nome do gerente: "+ gerente3.getNome());
				System.out.println("Salário do gerente: "+ gerente3.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Gerente 2:");
				System.out.println("Nome do gerente: "+ gerente2.getNome());
				System.out.println("Salário do gerente: "+ gerente2.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Gerente 1:");
				System.out.println("Nome do gerente: "+ gerente1.getNome());
				System.out.println("Salário do gerente: "+ gerente1.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Funcionário 5:");
				System.out.println("Nome do funcionário: "+ funcionario5.getNome());
				System.out.println("Salário do funcionário: "+ funcionario5.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Funcionário 1:");
				System.out.println("Nome do funcionário: "+ funcionario1.getNome());
				System.out.println("Salário do funcionário: "+ funcionario1.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Funcionário 3:");
				System.out.println("Nome do funcionário: "+ funcionario3.getNome());
				System.out.println("Salário do funcionário: "+ funcionario3.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Funcionário 4:");
				System.out.println("Nome do funcionário: "+ funcionario4.getNome());
				System.out.println("Salário do funcionário: "+ funcionario4.getSalario()+ "R$");
				System.out.println("");
				System.out.println("Funcionário 2:");
				System.out.println("Nome do funcionário: "+ funcionario2.getNome());
				System.out.println("Salário do funcionário: "+ funcionario2.getSalario()+ "R$");
				System.out.println("");
				
	}

}
