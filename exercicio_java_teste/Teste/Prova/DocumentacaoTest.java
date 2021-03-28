package Prova;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DocumentacaoTest {

    @Test

    public void TestaClasseDocumentacao(){

    // CAMINHO BÁSICO 1-2-3-X - SAÍDA ESPERADA: ERRO

        Assertions.assertEquals("É obrigatório informar um país de destino",
                Documentacao.VerificarExigencias(""));

    // CAMINHO BÁSICO 1-4-5-7-8-11-4-14-X - SAÍDA ESPERADA: VISTO

        Assertions.assertEquals("Visto - ",
                Documentacao.VerificarExigencias("Estados Unidos"));

    // CAMINHO BÁSICO 1-4-5-6-7-8-9-11-4-14-X - SAÍDA ESPERADA: VISTO E VACINA

        Assertions.assertEquals("Visto - Vacina - ",
                Documentacao.VerificarExigencias("Australia"));

    // CAMINHO BÁSICO 1-4-6-7-9-10-11-4-14-X - SAÍDA ESPERADA: VACINA

        Assertions.assertEquals("Vacina - ",
                Documentacao.VerificarExigencias("Camboja"));
        
    // CAMINHO BÁSICO 1-4-12-13-14-X - SAÍDA ESPERADA: SEM DOCUMENTOS

        Assertions.assertEquals("País não exige documento",
                Documentacao.VerificarExigencias("Brasil"));



    }
}
