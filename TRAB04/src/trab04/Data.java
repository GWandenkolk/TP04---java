/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab04;


package testee;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author LOWCOST
 */


public class Data {
    private int dia;
    private int mes;
    private int ano;
    private static final int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Construtor sem parâmetros que permite ao usuário digitar os valores
    public Data() {
        Scanner sc = new Scanner(System.in);
        boolean dataValida = false;
        while (!dataValida) {
            System.out.print("Digite o dia: ");
            int d = sc.nextInt();
            System.out.print("Digite o mês: ");
            int m = sc.nextInt();
            System.out.print("Digite o ano: ");
            int a = sc.nextInt();
            if (validaData(d, m, a)) {
                this.dia = d;
                this.mes = m;
                this.ano = a;
                dataValida = true;
            } else {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

    // Construtor com parâmetros
    public Data(int d, int m, int a) {
        if (validaData(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    // Métodos entraDia, entraMes e entraAno com parâmetros
    public void entraDia(int d) {
        if (validaData(d, this.mes, this.ano)) {
            this.dia = d;
        } else {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    public void entraMes(int m) {
        if (validaData(this.dia, m, this.ano)) {
            this.mes = m;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    public void entraAno(int a) {
        if (validaData(this.dia, this.mes, a)) {
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Ano inválido");
        }
    }

    // Métodos entraDia, entraMes e entraAno sem parâmetros
    public void entraDia() {
        Scanner sc = new Scanner(System.in);
        boolean dataValida = false;
        while (!dataValida) {
            System.out.print("Digite o dia: ");
            int d = sc.nextInt();
            if (validaData(d, this.mes, this.ano)) {
                this.dia = d;
                dataValida = true;
            } else {
                System.out.println("Dia inválido. Tente novamente.");
            }
        }
    }

    public void entraMes() {
        Scanner sc = new Scanner(System.in);
        boolean dataValida = false;
        while (!dataValida) {
            System.out.print("Digite o mês: ");
            int m = sc.nextInt();
            if (validaData(this.dia, m, this.ano)) {
                this.mes = m;
                dataValida = true;
            } else {
                System.out.println("Mês inválido. Tente novamente.");
            }
        }
    }

    public void entraAno() {
        Scanner sc = new Scanner(System.in);
        boolean dataValida = false;
        while (!dataValida) {
            System.out.print("Digite o ano: ");
            int a = sc.nextInt();
            if (validaData(this.dia, this.mes, a)) {
                this.ano = a;
                dataValida = true;
            } else {
                System.out.println("Ano inválido. Tente novamente.");
            }
        }
    }

    // Métodos retDia, retMes e retAno
    public int retDia() {
        return this.dia;
    }

    public int retMes() {
        return this.mes;
    }

    public int retAno() {
        return this.ano;
    }

    // Método mostra1
    public String mostra1() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    // Método mostra2
    public String mostra2() {
        String[] mesesPorExtenso = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return String.format("%02d/%s/%04d", this.dia, mesesPorExtenso[this.mes - 1], this.ano);
    }

    // Método bissexto
    public boolean bissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    // Método diasTranscorridos
    public int diasTranscorridos() {
        int dias = 0;
        for (int i = 0; i < this.mes - 1; i++) {
            dias += diasPorMes[i];
        }
        dias += this.dia;
        if (this.mes > 2 && bissexto()) {
            dias += 1; // Adiciona um dia se o ano é bissexto e já passou de fevereiro
        }
        return dias;
    }

    // Método apresentaDataAtual
    public void apresentaDataAtual() {
        Date dataAtual = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + df.format(dataAtual));
    }

    // Método para validar a data
    private boolean validaData(int d, int m, int a) {
        if (m < 1 || m > 12) return false;
        if (d < 1) return false;
        if (m == 2 && bissexto(a)) {
            return d <= 29;
        } else {
            return d <= diasPorMes[m - 1];
        }
    }

    // Método para verificar se um ano é bissexto
    private boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}



