package br.com.array;

/**
 *  Estudo do Array - Exemplo 3 - Instanciando um Array
 * @author Victor Henrique Ranalli Barbosa
 */
public class Array3 {
    public static void main(String[] args) {
        // iniciando um array com tamanhi fixo de 5 variaveis
        int[] impares = new int[5];
        impares[0]=1;
        impares[1]=3;
        impares[2]=5;
        impares[3]=7;
        impares[4]=9;
        System.out.println("Tamanho do array: " + impares.length);
        System.out.println("Posição 1 do array" + impares[1]);
        //a linha abaixo gera um erro pois o tamanho do array e 5
        impares[5]=11;
        System.out.println("5 posição (ELA NAO EXISTE)!!! " + impares[5]);
                
        
    }
   
}
