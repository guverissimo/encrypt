package org.example;

import java.util.HashMap;
import java.util.Map;

public class CodigoMorse {
    Helpers helper = new Helpers();
    private static final  Map<Character, String> codigoMorseMap = new HashMap<>();
    private static final Map<String, Character> invertidoCodigoMorseMap = new HashMap<>();
    static {
        codigoMorseMap.put('A', ".-");
        codigoMorseMap.put('B', "-...");
        codigoMorseMap.put('C', "-.-.");
        codigoMorseMap.put('D', "-..");
        codigoMorseMap.put('E', ".");
        codigoMorseMap.put('F', "..-.");
        codigoMorseMap.put('G', "--.");
        codigoMorseMap.put('H', "....");
        codigoMorseMap.put('I', "..");
        codigoMorseMap.put('J', ".---");
        codigoMorseMap.put('K', "-.-");
        codigoMorseMap.put('L', ".-..");
        codigoMorseMap.put('M', "--");
        codigoMorseMap.put('N', "-.");
        codigoMorseMap.put('O', "---");
        codigoMorseMap.put('P', ".--.");
        codigoMorseMap.put('Q', "--.-");
        codigoMorseMap.put('R', ".-.");
        codigoMorseMap.put('S', "...");
        codigoMorseMap.put('T', "-");
        codigoMorseMap.put('U', "..-");
        codigoMorseMap.put('V', "...-");
        codigoMorseMap.put('W', ".--");
        codigoMorseMap.put('X', "-..-");
        codigoMorseMap.put('Y', "-.--");
        codigoMorseMap.put('Z', "--..");
        codigoMorseMap.put('1', ".----");
        codigoMorseMap.put('2', "..---");
        codigoMorseMap.put('3', "...--");
        codigoMorseMap.put('4', "....-");
        codigoMorseMap.put('5', ".....");
        codigoMorseMap.put('6', "-....");
        codigoMorseMap.put('7', "--...");
        codigoMorseMap.put('8', "---..");
        codigoMorseMap.put('9', "----.");
        codigoMorseMap.put('0', "-----");
        codigoMorseMap.put(' ', "/");


        // Adicione mais caracteres e seus códigos Morse conforme necessário
    }




    public void escolher() {
        helper.imprimeTitulo("Código Morse");
        System.out.println("Escolha uma opção para processar sua frase: ");
        System.out.println("1 - Encripitar");
        System.out.println("2 - Desencripitar");
        int escolha = helper.pegaInteiro("Escolha uma opção(1/2): ");
        String mensagem = helper.pegaTexto("Digite a mensagem: ");
        switch (escolha) {
            case 1:
                this.encrypt(mensagem);
                break;
            case 2:
                this.decrypt(mensagem);
                break;
            default:
                System.out.println("Escolha uma opção válida! (1/2)");
        }
    }

    public String encrypt(String mensagem) {
        StringBuilder mensagemEncripitada = new StringBuilder();

        String mensagemUpperCase = helper.aumentaTexto(mensagem);

        if (mensagemUpperCase == "SOS") {
            return "... --- ...";
        }

        for (char letra : mensagemUpperCase.toCharArray()) {
            if (codigoMorseMap.containsKey(letra)) {
                mensagemEncripitada.append(codigoMorseMap.get(letra));
                mensagemEncripitada.append(" ");
            } else if (letra == ' ') {
                mensagemEncripitada.append("/ ");
            }
        }
        helper.imprimeMensagem(mensagem, mensagemEncripitada.toString());
        return mensagemEncripitada.toString();
    }

    public String decrypt(String mensagem) {
        StringBuilder mensagemDesencripitada = new StringBuilder();
        String mensagemOriginal= mensagem;
        helper.aumentaTexto(mensagem);
        String[] format = mensagem.split(" ");

        for (Map.Entry<Character, String> entry : codigoMorseMap.entrySet()) {
            invertidoCodigoMorseMap.put(entry.getValue(), entry.getKey());
        }

        for (int i = 0; i < format.length; i++) {
            if (invertidoCodigoMorseMap.containsKey(format[i])) {
                mensagemDesencripitada.append(invertidoCodigoMorseMap.get(format[i]));
            }
        }
        helper.imprimeMensagem(mensagemOriginal, mensagemDesencripitada.toString());
        return mensagemDesencripitada.toString();
    }
}
