/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 *  Estudo do Array - Exemplo 6 - Array Multidimencional
 * @author Victor Henrique Ranalli Barbosa
 */
public class Arrey6 {
      public static void main(String[] args) {
        // a linha abaixo cria um array de duas dimençoes
        String[][] agenda = {{"Bill","1111-1111","BILLX@gmail.com"},{"Linus","2222-2222","linuS@hotmail.com"},{"Steve","4444-4444","steve@mojang.com"}};
        // exemplo 1:recuperando o email do bill
        //System.out.println(agenda[0][2]);
        //exemplo 2:montando a agenda de contatos
        //o primeiro laço percorre as linhas 
          for (int i = 0; i < agenda.length; i++) {
              System.out.println("___________________________");
              //o segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda
              for (int j = 0; j < agenda[i].length; j++) {
                  System.out.println(agenda[i][j]);
              }
          }
    }
}
