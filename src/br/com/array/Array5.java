package br.com.array;

/**
 *  Estudo do Array - Exemplo 5 - preenchendo um Array com o laço for e foreach
 * @author Victor Henrique Ranalli Barbosa
 */
public class Array5 {
    public static void main(String[] args) {
        //intstaciando um array de tamanho variavel
        int[] pares = {2,4,6,8};
        
        //a estrutura abaixo percorre o array
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares[" + i + "]" + pares[i]);
        }
        // usando uma estrutura simplificada do laço for(foreach) para percorrer o array
        System.out.println("uso do foreach: ");
        for (int i : pares) {
            System.out.println(i);
        }
    }
}
