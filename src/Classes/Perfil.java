package Classes;

import java.util.List;

public class Perfil {
	
	private String biografia;
	private List listaAmigos;
	private Usuario usuariodono;
	
	
	public Perfil(String biografia) {
		super();
		this.usuariodono = usuariodono;
		this.biografia = biografia;
		this.listaAmigos = null;
	}
	
	public void editarPerfil(String novaBio) {
		this.biografia = novaBio;
	}
	
	
	

}
