/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

/**
 *
 * @author yuri.schmitz
 */
public class Funcao {
    public static String gerarNumeroAleatorio(int quantidade, int maximo){
        String resultado = "";
        int numero = 0;
        for(int i = 0; i < quantidade; i++){
            numero = (int) (Math.random() * maximo) + 1;
            resultado += numero + ",";
        }
        resultado = resultado.substring(0, resultado.length() - 1);
        return resultado;
    }
    
}
