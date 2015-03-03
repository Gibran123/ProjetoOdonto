/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shalom.modelo;

/**
 *
 * @author gibran
 */
public enum Estado {
    
    INSERCAO(0),
    ATUALIZACAO(1),
    EXTINCAO(2),
    NEUTRO(3);
    
    private final int valor;
    
    Estado(int estado){
        valor = estado;
    }
}
