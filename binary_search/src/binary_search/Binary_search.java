/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author david
 */
public class Binary_search {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int tamaño;
        Random random = new Random();
        System.out.println("Ingrese el tamaño de su lista: ");
        tamaño = teclado.nextInt();
        int values [] = new int[tamaño];
        for (int i= 0; i< values.length; i++){
            values[i] = random.nextInt(1000);
        }
        for (int i = 0; i < 100000000; i++){
            int index = -1;
            for(int j = 0; j < values.length;j++)
                if(values[j] ==80)
                    index = j;
            break; }}}
