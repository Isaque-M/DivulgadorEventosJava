package Classes;

public class Diretor {
	
	private String nomeDiretor;

	public Diretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    @Override
    public String toString() {
        return nomeDiretor;
    }
}
