package tiposAparelhos.smartphones;

import tiposAparelhos.AparelhoTelefonico;
import tiposAparelhos.NavegadorDaInternet;
import tiposAparelhos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorDaInternet, AparelhoTelefonico{

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}

	@Override
	public void tocar() {
		System.out.println("Música tocando...");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionada a música: " + musica);
	}

}
