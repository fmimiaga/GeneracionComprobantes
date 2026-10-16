

package com.mycompany.generacioncomprobantes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class ProcesoComprobante implements Runnable {

    private final String numeroPedido;
    private final Consumer<String> mostrarMensaje;
    private final Runnable alFinalizar;

    public ProcesoComprobante(
            String numeroPedido,
            Consumer<String> mostrarMensaje,
     Runnable alFinalizar){

        this.numeroPedido = numeroPedido;
        this.mostrarMensaje = mostrarMensaje;
        this.alFinalizar = alFinalizar;
    }

    @Override
    public void run() {
        StringBuilder resultado = new StringBuilder();

        try {
            resultado.append("GENERACIÓN DE COMPROBANTE\n");
            resultado.append("Número de pedido: ")
                    .append(numeroPedido).append("\n\n");

            mostrarMensaje.accept(
                    "Iniciando generación del comprobante...");
            resultado.append(
                    "Iniciando generación del comprobante.\n");
            Thread.sleep(1000);

            mostrarMensaje.accept(
                    "Preparando los datos del pedido "
                    + numeroPedido + "...");
            resultado.append(
                    "Preparando los datos del pedido.\n");
            Thread.sleep(1000);

            mostrarMensaje.accept(
                    "Generando el comprobante...");
            resultado.append(
                    "Generando el comprobante.\n");
            Thread.sleep(1000);

            resultado.append(
                    "Comprobante generado correctamente.\n");

            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter("resultado.txt"))) {
                writer.write(resultado.toString());
            }

            mostrarMensaje.accept(
                    "Comprobante generado correctamente.");
            mostrarMensaje.accept(
                    "Archivo resultado.txt guardado correctamente.");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            mostrarMensaje.accept(
                    "El proceso fue interrumpido.");

        } catch (IOException e) {
            mostrarMensaje.accept(
                    "Error al guardar el archivo: "
                    + e.getMessage());
         } finally {
            alFinalizar.run();
        }
    }
}