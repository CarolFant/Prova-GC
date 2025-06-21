package br.com.geraaocaldeira.prova.questoes;

import java.util.ArrayList;

public class Questao6 {
    public static void main(String[] args) {

        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("00:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");

        System.out.println(horarios.get(1));
    }
}
