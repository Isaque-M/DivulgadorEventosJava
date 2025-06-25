package Classes;

import java.util.List;

import Enum.Avaliacao;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	private Perfil perfil;
	private List<Eventos> listEventosCheckin;
	private List<Eventos> listEventosDivulgados;
	private List<Comentarios> listaComentarios;
	
	
	public Usuario(String nome, String email, String senha, Perfil perfil) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		this.listEventosCheckin = null;
		this.listEventosDivulgados = null;
		this.listaComentarios = null;
	}
	
	public void divulgarEventos(int idEvento,int tipoEvento, String nomeEvento, Local localEvento) {

		switch(tipoEvento) {
		case 1:
			List<Artista> listaArtistas =null;
			Eventos novoEvento= new Show(idEvento,tipoEvento,nomeEvento,localEvento,listaArtistas);
			listEventosDivulgados.add(novoEvento);
			break;
			
		case 2:
			Eventos novoEvento2= new AtracaoCultural(idEvento,tipoEvento,nomeEvento,localEvento);
			listEventosDivulgados.add(novoEvento2);
			break;
			
		case 3:
			Eventos novoEvento3= new PontoTuristico(idEvento,tipoEvento,nomeEvento,localEvento);
			listEventosDivulgados.add(novoEvento3);
			break;
			
		case 4:
			Diretor nomediretor=null;
			Eventos novoEvento4= new Peca(idEvento,tipoEvento,nomeEvento,localEvento,nomediretor);
			listEventosDivulgados.add(novoEvento4);
			break;
			
		}
		
	}
	
	public void deletarEventos(Eventos eve) {
		listEventosDivulgados.remove(eve);
	}
	
public void Fazercheckin(Eventos eve) {
		listEventosCheckin.add(eve);
}

public void fazerComentarios(Comentarios com) {
	listaComentarios.add(com);
}

public void deletarComentarios(Comentarios com) {
	listaComentarios.remove(com);
}

public void alterarComentarios(int novoId, String novotitulo, String novocomentario) {
	for(Comentarios com: listaComentarios) {
		if(com.getId() == novoId) {
			com.setTitulo(novotitulo);
			com.setMensagem(novocomentario);
			break;
		}
	}
}

public void avaliarEvento(int idEvento, Avaliacao nota) {
	for(Eventos eve: listEventosCheckin) {
		if(eve.getIdEvento() == idEvento) {
			eve.setAvaliacao(nota);
		}
	}
}
	
	
	
	
	

}
