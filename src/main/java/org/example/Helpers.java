package org.example;

import java.util.Scanner;

public class Helpers {
    Scanner scanner = new Scanner(System.in);


    public String StringInput(String frase) {
        System.out.println(frase);
        scanner.nextLine();
        String mensagem = scanner.nextLine();
        return mensagem;
    }
    public int IntInput(String frase) {
        System.out.println(frase);
        int escolha = Integer.parseInt(scanner.next());
        return escolha;
    }
    public void imprimeLogo() {
        System.out.println();
        System.out.println();
        System.out.println("****** Encrypt ******");
        System.out.println();

    }

    public void imprimeMensagem(String mensagem, String mensagemEncripitada) {
        this.imprimeLogo();
        System.out.println("Sua mensagem foi criptografada com sucesso!");
        System.out.println();
        System.out.println("Mensagem original: ");
        System.out.println(mensagem);
        System.out.println();
        System.out.println("Mensagem criptografada: ");
        System.out.println(mensagemEncripitada);
        System.out.println();
    }
}
