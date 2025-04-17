/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

public class CalculadoraMain {
    public static void main(String[] args) {
        // Iniciar la interfaz de usuario (ventana)
        javax.swing.SwingUtilities.invokeLater(() -> {
            Calculadora ventana = new Calculadora();
            ventana.setVisible(true);
        });
    }
}
