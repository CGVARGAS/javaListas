package programas;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entidades.EstruturaBusca;

public class MainProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EstruturaBusca> lista = new ArrayList<>();
		
		System.out.print("Informe a quantidade de funcionários a registrar: ");
		int quant = sc.nextInt();
		
		for(int i=0; i<quant; i++) {
			System.out.print("\nInforme o ID do funcionário: ");
			int id = sc.nextInt();
			sc.nextLine(); //Consumir quebra de linha...
			System.out.print("Informe o nome do funcionários: ");
			String nome = sc.nextLine();
			System.out.print("Informe o salario: ");
			double salario = sc.nextInt();
			
			EstruturaBusca busca = new EstruturaBusca(id, nome, salario);
			lista.add(busca); // Adiciona elementos na lista...
			
		}
		
		System.out.print("Informe o ID do funcionário que receperá reajuste salarial: ");
		int buscaId = sc.nextInt();
		
		// Utilizar a classe BuscaFuncionario para encontrar o funcionário
		EstruturaBusca funcionarioParaReajuste = BuscaFuncionario.buscarFuncionarioPorId(lista, buscaId);
		
		if(funcionarioParaReajuste != null) {
			System.out.print("Informe a porcentagem do reajuste: ");
			double percentualReajuste = sc.nextDouble();
			funcionarioParaReajuste.reajusteSalario(percentualReajuste);
		}else {
			System.out.print("Funcionário não encontrado!");
		}
		
		for(EstruturaBusca elemento: lista ) {
			System.out.println("\n" + elemento);			
		}
		
		sc.close();
		
	}

}
