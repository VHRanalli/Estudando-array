package br.com.array;

/**
 * Estudo do Array - exemplo 1 - Array simples
 * @author Victor Henrique Ranalli Barbosa
 * 
 */
public class Array1 {
    public static void main(String[] args) {
        //sem array
        System.out.println("Array simples");
        System.out.println("1. sem array");
        String time1="Palmeiras";
        String time2="Corinthians";
        String time3="Sao Paulo";
        String time4="Santos";
        System.out.println("Time: " + time2);
        System.out.println("2. COM ARRAY");
        // a linha abaixo cria um array simples de tamanho 4
        String[] times = {"Palmeiras", "Corinthians", "São Paulo", "Santos"};
        // a linha abaixo exibe o conteudo do array [1]
        // [0] [1] [2] [3]
        System.out.println("Times Que Jogarão Hoje: " + times[1] + " vs " + times[2]);
        // a linha abaixo o .lenght exibe o tamanho do array
        System.out.println("Tamanho do array: " + times.length);
        // a linha abaixo altera o conteudo da variavel que esta em modo array
        times[1] = "Flamengo";
        System.out.println("Times Que Jogarão Hoje: " + times[1] + " vs " + times[2]);
    }
    
}
