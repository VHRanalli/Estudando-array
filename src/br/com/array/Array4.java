package br.com.array;

/**
 *  Estudo do Array - Exemplo 4 - preenchendo um Array com o laço for
 * @author Victor Henrique Ranalli Barbosa
 */
public class Array4 {
    public static void main(String[] args) {
        int[] idades = new int[10];   
        //a estrutura abaixo cria as variaveis que irão preencher as 10 posiçoes ("""casinhas""") do array
        for (int i = 0; i < 10; i++) {
            idades[i] = i*10;
            System.out.println("intervalo de idades[" + i + "] = " + idades[i]);
        }
    }
}
