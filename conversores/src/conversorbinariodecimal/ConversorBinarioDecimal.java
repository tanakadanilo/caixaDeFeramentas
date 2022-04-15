/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorbinariodecimal;

import java.math.BigInteger;

/**
 *
 * @author tanak
 */
public class ConversorBinarioDecimal {

    protected String converterParaBinarioByte(int numeroParaConversao) throws Exception {
        if (numeroParaConversao >= 256) {
            throw new Exception("O valor do número para conversão não pode ser superior a  255, pois esse é o limite de um número byte");
        }
        String numeroBinario = "";
        for (int i = 0; i < 8; i++) {// * dividir 8 vezzes, pois são 8 bits no total
            numeroBinario = String.valueOf(numeroParaConversao % 2) + numeroBinario;
            numeroParaConversao /= 2;
        }
        return numeroBinario;
    }

    protected String converterParaBinarioShort(int numeroParaConversao) throws Exception {
        if (numeroParaConversao >= 65536) {
            throw new Exception("O valor do número para conversão não pode ser superior a  65535, pois esse é o limite de um número short");
        }
        String numeroBinario = "";
        for (int i = 0; i < 16; i++) {// * dividir 8 vezzes, pois são 8 bits no total
            numeroBinario = String.valueOf(numeroParaConversao % 2) + numeroBinario;
            numeroParaConversao /= 2;
        }
        return numeroBinario;
    }

    protected String converterParaBinarioInt(long numeroParaConversao) throws Exception {
//        BigInteger limite = ((BigInteger.valueOf((42949672)).multiply(BigInteger.valueOf(100)).add(BigInteger.valueOf(95))));
//        BigInteger numero = BigInteger.valueOf(100);
    int limite = (42949672*10) +10;

//        limite = limite.multiply(numero).add(BigInteger.valueOf(95));
//        if (limite.compareTo(BigInteger.valueOf(numeroParaConversao)) == -1) {

            throw new Exception("O valor do número para conversão não pode ser superior a " + limite + " pois esse é o limite de um número short");
//        }
        String numeroBinario = "";
        for (int i = 0;
                i < 32; i++) {// * dividir 8 vezzes, pois são 8 bits no total
            numeroBinario = String.valueOf(numeroParaConversao % 2) + numeroBinario;
            numeroParaConversao /= 2;
        }
        return numeroBinario;
    }
}
