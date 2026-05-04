package bibliotecaSistema;

public class Livros  extends Produto{
	private String autor;
	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor=autor;
	}

}
