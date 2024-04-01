package org.example;

public class CifraDeCesar {

    public void escolher() {
        helper.imprimeTitulo("Cifra de Cesar");

        System.out.println("Escolha uma opção para processar sua frase: ");
        System.out.println("1 - Encripitar");
        System.out.println("2 - Desencripitar");
        int escolha = helper.pegaInteiro("Escolha uma opção(1/2): ");
        int deslocamento = helper.pegaInteiro("Digite o deslocamento para criptografia");
        String mensagem = helper.pegaTexto("Digite a mensagem: ") ;
        switch (escolha) {
            case 1:
                this.encrypt(mensagem, deslocamento);
                break;
            case 2:
                this.encrypt(mensagem, deslocamento * -1);
                break;
            default:
                System.out.println("Escolha uma opção válida! (1/2)");
        }
    }
    Helpers helper = new Helpers();
    public String encrypt(String mensagem, int deslocamento) {
        StringBuilder mensagemEncriptada = new StringBuilder();
        for (int i = 0; i < mensagem.length(); i++) {
            char letra = mensagem.charAt(i);
            if (Character.isLetter(letra)) {
                int ascii = (int) letra + deslocamento;
                if (Character.isUpperCase(letra)) {
                    if (ascii < 65) {
                        ascii += 26;
                    } else if (ascii > 90) {
                        ascii -= 26;
                    }
                } else {
                    if (ascii < 97) {
                        ascii += 26;
                    } else if (ascii > 122) {
                        ascii -= 26;
                    }
                }
                mensagemEncriptada.append((char) ascii);
            } else {
                mensagemEncriptada.append(letra);
            }
        }
        helper.imprimeMensagem(mensagem, mensagemEncriptada.toString());
        return mensagemEncriptada.toString();
    }
    public String decrypt(String mensagem, int deslocamento) {
        StringBuilder mensagemDescriptografada = new StringBuilder();
        return mensagemDescriptografada.toString();
    }
}
