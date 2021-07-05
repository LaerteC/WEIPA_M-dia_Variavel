/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_weipa;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Weipa_Media_Variavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada_x;

        // Digitar um tamanho de vetor
        
        System.out.println(" Digite uma entrada de amostra : ");
        entrada_x = sc.nextInt();

        int lista[] = new int[entrada_x];

        for (int i = 0; i < entrada_x; i++) {

            lista[i] += i * 2;

        }

        
        
        System.out.println(" Valores de Entrada ");

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        
        System.out.println("\n");

      //  mediaMovel_2(lista,entrada_x);
        
        mediaMovel_3(lista,entrada_x);

    }

    public static void mediaMovel_2(int[] lista,int entrada_x) {

        int i=0;
        
        int soma=0;
        
        while(i < lista.length-1){
            
           int a= lista[i];
           i++;
           
           int b= lista[i];
          
           soma = (a+b)/2;
           
           System.out.println(soma);
        }
     
    } 
    
    
     public static void mediaMovel_3(int[] lista,int entrada_x) {

       int i=0;
        
       while(i <lista.length-2){
        int soma=0;
       int a= lista[i];
       i++;
       int b =lista[i];
       i++;
       int c = lista[i];
        
       i--;  
           
          soma = (a+b+c)/3;
           
        System.out.println(soma);
        
       }
    }
}
