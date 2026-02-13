/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.handpvpconsol;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class HandPVPConsol {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "papel", "tijera"};

        Map<String, String> reglas = Map.of(
            "piedra", "tijera",
            "papel", "Piedra",
            "tijera", "papel"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("-Opciones: \n-Piedra, papel y tijera: " );
        String opcionUsuario = scanner.nextLine();

        if (!reglas.keySet().contains(opcionUsuario)) {
            System.out.println("Opcion no valida. ");
            return;   
        }

        Random random = new Random();
        String opcionMaquina = opciones[random.nextInt(opciones.length)];
        System.out.println("Opcion Maquina: "+opcionMaquina);

        if (opcionUsuario.equals(opcionMaquina)){
            System.out.println("Empate!");
        }else if (reglas.get(opcionUsuario).equals(opcionMaquina)) {
            System.err.println("Has ganado");
        }else{
            System.out.println("Has perdido");
        }
        scanner.close();

        }
}
