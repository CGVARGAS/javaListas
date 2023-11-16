package programas;

import java.util.List;

import entidades.EstruturaBusca;

public class BuscaFuncionario {
	
	public static EstruturaBusca buscarFuncionarioPorId(List<EstruturaBusca> lista, int id) {
		for(EstruturaBusca funcionario : lista) {
			if(funcionario.getId() == id) {
				return funcionario;
			}
		}
		return null;
	}

}