
import java.util.Scanner;

import Classes.Comentarios;
import Classes.Diretor;
import Classes.Local;
import Classes.Peca;
import Classes.Perfil;
import Classes.Usuario;
import Enum.Avaliacao;
import Interfaces.InterfaceEventos;

public class Main {
	
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("🔐 Cadastro de Usuário");
	        System.out.print("Nome: ");
	        String nomeUsuario = scanner.nextLine();

	        System.out.print("E-mail: ");
	        String emailUsuario = scanner.nextLine();

	        System.out.print("Senha: ");
	        String senhaUsuario = scanner.nextLine();

	        System.out.print("Biografia: ");
	        String bio = scanner.nextLine();

	        Perfil perfil = new Perfil(bio);
	        Usuario usuario = new Usuario(nomeUsuario, emailUsuario, senhaUsuario, perfil);

	        
	        System.out.println("\n📍 Cadastro de Local do Evento");
	        System.out.print("Rua: ");
	        String rua = scanner.nextLine();

	        System.out.print("Bairro: ");
	        String bairro = scanner.nextLine();

	        System.out.print("CEP (XXXXX-XXX): ");
	        String cep = scanner.nextLine();

	        System.out.print("Cidade: ");
	        String cidade = scanner.nextLine();

	        Local local = new Local(rua, bairro, cep, cidade);
	        local.verificaCep();

	        
	        System.out.println("\n🎬 Informações da Peça Teatral");
	        System.out.print("Título da peça: ");
	        String tituloPeca = scanner.nextLine();

	        System.out.print("Nome do Diretor: ");
	        String nomeDiretor = scanner.nextLine();

	        Diretor diretor = new Diretor(nomeDiretor);
	        Peca peca = new Peca(1, 4, tituloPeca, local, diretor);

	        
	        usuario.Fazercheckin(peca);

	        System.out.println("\n⭐ Avaliação do Evento");
	        System.out.print("Escolha uma nota (1-Ruim, 2-Regular, 3-Bom, 4-MuitoBom, 5-Excelente): ");
	        int nota = Integer.parseInt(scanner.nextLine());
	        Avaliacao avaliacao = Avaliacao.values()[nota - 1];
	        usuario.avaliarEvento(1, avaliacao);

	      
	        System.out.println("\n💬 Comentário");
	        System.out.print("Título: ");
	        String tituloComentario = scanner.nextLine();
	        System.out.print("Mensagem: ");
	        String corpoComentario = scanner.nextLine();

	        Comentarios comentario = new Comentarios(1, tituloComentario, corpoComentario, usuario);
	        usuario.fazerComentarios(comentario);

	        
	        System.out.println("\n📢 EVENTO REGISTRADO:");
	        InterfaceEventos evento = peca;
	        evento.exibirDados();

	        System.out.println("Participantes: " + peca.contarParticipantes());

	        scanner.close();
	    }
	}



