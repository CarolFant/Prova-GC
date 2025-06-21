package br.com.geraaocaldeira.prova.questoes;

import java.time.LocalDate;

public class Questao11 {

    public static void main(String[] args) {


        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);
    }
}

