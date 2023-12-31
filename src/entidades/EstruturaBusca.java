package entidades;

public class EstruturaBusca {
	private Integer id;
	private String nome;
	private Double salario;
	
	
	public EstruturaBusca() {	
	}
	
	public EstruturaBusca(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void reajusteSalario(double percentual) {
		salario += salario * (percentual / 100);
		
	}
	
	@Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + String.format("R$ %.2f", salario);
    }
	
}
