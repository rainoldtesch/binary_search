package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader  {
    public static int[] read() {
        String nomeArquivo = "numbers.txt"; // Substitua pelo caminho do seu arquivo

        try {
            // Leitura do arquivo usando Java NIO
            String conteudo = new String(Files.readAllBytes(Paths.get(nomeArquivo)));

            // Quebrar a linha em um array de strings usando a vírgula como separador
            String[] numerosString = conteudo.split(", ");

            // Criar um array de inteiros para armazenar os números
            int[] arrayDeInteiros = new int[numerosString.length];

            // Converter cada string para um número inteiro e armazená-lo no array
            for (int i = 0; i < numerosString.length; i++) {
                arrayDeInteiros[i] = Integer.parseInt(numerosString[i].trim());
            }

            // Exemplo: Imprime os elementos do array
            for (int i = 0; i < arrayDeInteiros.length; i++) {
                System.out.println("Elemento " + i + ": " + arrayDeInteiros[i]);
            }

            return arrayDeInteiros;

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return null;
    }
}
