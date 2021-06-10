package pacote_classes;

public class Produto extends Marca{
	
	protected int id_produto;
	protected String descricao_prod;
	protected Double valor_prod;
	protected Double desconto;
	private static int cont = 0;

	public Produto(String descricao_prod, Double valor_prod, Double desconto, String descricao) throws Exception {
		// TODO Auto-generated constructor stub
		super(descricao);
		this.setId_produto(id_produto);
		this.setDescricao_prod(descricao_prod);
		this.setValor_prod(valor_prod);
		this.setDesconto(desconto);
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = cont++;
	}

	public String getDescricao_prod() {
		return descricao_prod;
	}

	public void setDescricao_prod(String descricao_prod) throws Exception {
		if(descricao_prod.isEmpty() || descricao_prod.isBlank() || descricao_prod == null) {
			throw new Exception("Descricao do produto em formato invalido.");
		} else {
			this.descricao_prod = descricao_prod;
		}
	}

	public Double getValor_prod() {
		return valor_prod;
	}

	public void setValor_prod(Double valor_prod) throws Exception {
		if(valor_prod.equals(0.00)) {
			throw new Exception("Um produto nao pode ter valor 0.");
		} else {
			if (getDesconto() != 0.00) {
				this.valor_prod = valor_prod - (valor_prod*getDesconto());
			} else {
				this.valor_prod = valor_prod;
			}
		}
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto/100;
	}

	@Override
	public String toString() {
		return "Produto [id_produto=" + id_produto + ", descricao_prod=" + descricao_prod + ", valor_prod=" + valor_prod
				+ ", desconto=" + desconto + ", descricao=" + descricao + "]";
	}
	
	
	
	

}
