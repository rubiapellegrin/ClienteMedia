/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cliente01;

import br.edu.ifsul.cliente01.ServicoMediaService;

/**
 *
 * @author rubia
 */
public class UsarCliente {
       
    public static void main(String[] args) {
        ServicoMediaService cliente = new ServicoMediaService();
        System.out.println("Media: " + cliente.getServicoMediaPort().media(45.0, 90.2,1.2));
    }
}
