package br.com.array;

import java.util.Random;

/**
 * Estudo do Array - Exemplo 2 - Sorteio de Uma Carta
 * @author Victor Henrique Ranalli Barbosa
 */
public class Array2 {
    public static void main(String[] args) {
        String[] Nipes={"Espadas", "Paus", "Copas", "Ouros"};
        String[] Faces={"AZ", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        //a linha abaixo cria um objeto de sorteio usando a classe Random
        Random Sorteio = new Random();
        // a linha abaixo faz o sorteio do indice dos nipes, usando o objeto soprteio e atribui o resultado indice_nipe
        // o numero 4 gera numeros aleatorios num intervalo de 0 a 3
        int indice_nipes = Sorteio.nextInt(4);
        // a linha abaixo faz o sorteio do indice das faces das cartas, usando o objeto soprteio e atribui o resultado indice_face
        // o .lenght gera numeros aleatorios no intervalo do tamanho do array
        int indice_faces = Sorteio.nextInt(Faces.length);
        //as linhas abaixo atribuem o resutado do sorteio ao array correspondente
        String Nipe = Nipes [indice_nipes];
        String Face = Faces [indice_faces];
        //a linha abaixo exibe a carta sorteada
        System.out.println(Face + " de " + Nipe);
        
    }
  
}
