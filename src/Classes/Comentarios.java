package Classes;

public class Comentarios {
	
	private int id;
	private String titulo;
	private String mensagem;
	private Usuario userresponsavel;
	
	public Comentarios(int id,String titulo, String mensagem, Usuario userresponsavel) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.userresponsavel = userresponsavel;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	
	

}
