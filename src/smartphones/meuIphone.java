package smartphones;

import tiposAparelhos.smartphones.Iphone;

public class meuIphone {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		
        System.out.println("Ouvindo Música:");
        meuIphone.selecionarMusica("Bones - Imagine Dragons");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\nFazendo uma ligação:");
        meuIphone.ligar("+55 19 94002-8922");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\nUsando a Internet:");
        meuIphone.exibirPagina("http://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }

}
