package com.miempresa.narrativa.decision;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String decidir() {
        System.out.print("Elige A o B: ");
        String input = scanner.nextLine().trim().toUpperCase();
        if (!input.equals("A") && !input.equals("B")) {
            System.out.println("Entrada inválida, asumiendo B.");
            return "B";
        }
        return input;
    }
}
