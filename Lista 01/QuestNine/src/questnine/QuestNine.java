package questnine;

import java.time.LocalDate;
import java.time.LocalTime;

public class QuestNine {

    public static void main(String[] args) {
        EntradaDeCinema ingresso = new EntradaDeCinema(LocalDate.of(2024, 7, 17), LocalTime.of(21, 30), "Sala 3", 35);
        LocalDate dataNascimento1 = LocalDate.of(2017, 7, 17);
        LocalDate dataNascimento2 = LocalDate.of(2018, 2, 15);
        LocalDate dataNascimento3 = LocalDate.of(2022, 5, 17);
        LocalDate dataNascimento4 = LocalDate.of(2025, 3, 15);

        System.out.println(ingresso);

        float ValorD1 = ingresso.calculaDesconto(dataNascimento1);
        float ValorD2 = ingresso.calculaDesconto(dataNascimento2, 1234);
        float ValorD3 = ingresso.calculaDesconto(dataNascimento3, 5678);
        float ValorD4 = ingresso.calculaDesconto(dataNascimento4, 9090);

        float valorFinal1 = ingresso.calculaDescontoHorario(ValorD1);
        float valorFinal2 = ingresso.calculaDescontoHorario(ValorD2);
        float valorFinal3 = ingresso.calculaDescontoHorario(ValorD3);
        float valorFinal4 = ingresso.calculaDescontoHorario(ValorD4);

        System.out.println("\nValor final para menor de 12 anos: " + valorFinal1);
        System.out.println("Valor para os estudante que possuem idade entre 12 a 15 anos: " + valorFinal2);
        System.out.println("Valor para os estudante que possuem idade entre 16 a 20 anos: " + valorFinal3);
        System.out.println("Valor para os estudante que possuem idade a cima de 20 anos: " + valorFinal4);
    }
}