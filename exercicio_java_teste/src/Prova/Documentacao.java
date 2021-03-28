package Prova;

public class Documentacao {

    public static String[] paises_visto = {"Estados Unidos", "Australia", "Nova Zelandia", "Angola", "Taiwan"};
    public static String[] paises_vacina_febre_amarela = {"Camboja", "Jamaica", "Australia", "Madagascar", "India"};

    /*
    O usuário passa um país de destino, e o sistema devolve se é necessário visto e
    se é necessário vacina de febre amarela.
    1 array para cada lista. Se o país estiver vazio, informar que não foi passado.
    A resposta inclui a string a seguir para ficar mais bonito para o usuário " - "
    */

    public static String VerificarExigencias(String pais_destino){
        pais_destino = pais_destino.toLowerCase();
        String resposta = "";
        int contador = 0;   // NÓ 1

        if (pais_destino.equals("")){   // NÓ 2
            return "É obrigatório informar um país de destino"; // NÓ 3
        }

        while (contador < 5){ // NÓ 4
            if (paises_visto[contador].toLowerCase().equals(pais_destino) || paises_vacina_febre_amarela[contador].toLowerCase().equals(pais_destino)) { // NÓ 5 E NÓ 6
                if (paises_visto[contador].toLowerCase().equals(pais_destino)){ // NÓ 7
                    resposta = resposta+ "Visto - "; // NÓ 8
                }
                if (paises_vacina_febre_amarela[contador].toLowerCase().equals(pais_destino)){ // NÓ 9
                    resposta = resposta+ "Vacina - "; // NÓ 10
                }
            }
            contador ++; // NÓ 11
        }

        if (resposta.equals("")){ // NÓ 12
            return "País não exige documento"; // NÓ 13
        }


        return resposta; // NÓ 14

    }
}
