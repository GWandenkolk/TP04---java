/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab04;
public class TesteData {
    public static void main(String[] args) {
  // Testando o construtor sem parâmetros
        System.out.println("Teste do construtor sem parâmetros:");
        Data data1 = new Data();
        System.out.println("Data1: " + data1.mostra1());
        System.out.println("Data1: " + data1.mostra2());
        System.out.println("Ano bissexto: " + data1.bissexto());
        System.out.println("Dias transcorridos: " + data1.diasTranscorridos());

        // Testando o construtor com parâmetros
        System.out.println("\nTeste do construtor com parâmetros:");
        Data data2 = new Data(15, 7, 2024);
        System.out.println("Data2: " + data2.mostra1());
        System.out.println("Data2: " + data2.mostra2());
        System.out.println("Ano bissexto: " + data2.bissexto());
        System.out.println("Dias transcorridos: " + data2.diasTranscorridos());

        // Testando os métodos entraDia, entraMes e entraAno
        System.out.println("\nTestando os métodos entraDia, entraMes e entraAno:");
        data2.entraDia(25);
        data2.entraMes(12);
        data2.entraAno(2023);
        System.out.println("Data2 atualizada: " + data2.mostra1());

        // Testando os métodos entraDia(), entraMes() e entraAno()
        System.out.println("\nTestando os métodos entraDia(), entraMes() e entraAno():");
        data2.entraDia();
        data2.entraMes();
        data2.entraAno();
        System.out.println("Data2 atualizada: " + data2.mostra1());

        // Testando o método apresentaDataAtual
        System.out.println("\nTestando o método apresentaDataAtual:");
        data2.apresentaDataAtual();
    }
}

