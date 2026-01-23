package entities;

/*
 * Modelo de dados para entidade produto.
 */

public class Produto {
	
	//Atributos
	
	private Integer id;
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
