import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int totalCandidato1 = 0, totalCandidato2 = 0, totalCandidato3 = 0;
            int totalCandidato4 = 0, totalNulos = 0, totalEmBranco = 0, totalVotos = 0;
            double porcentagemNulos, porcentagemEmBranco;

            while (true) {
                System.out.print("Digite o código do candidato (1, 2, 3, 4, 5 para voto nulo, 6 para voto em branco, 0 para encerrar): ");
                int codigo = entrada.nextInt();

                if (codigo == 0) {
                    break;
                } else if (codigo >= 1 && codigo <= 6) {
                    totalVotos++;

                    if (codigo == 1) {
                        totalCandidato1++;
                    } else if (codigo == 2) {
                        totalCandidato2++;
                    } else if (codigo == 3) {
                        totalCandidato3++;
                    } else if (codigo == 4) {
                        totalCandidato4++;
                    } else if (codigo == 5) {
                        totalNulos++;
                    } else if (codigo == 6) {
                        totalEmBranco++;
                    }
                } else {
                    System.out.println("Código inválido digite novamente.");
                }
            }

            porcentagemNulos =  (totalNulos * 100) / totalVotos;
            porcentagemEmBranco = (totalEmBranco * 100) / totalVotos;

            System.out.println("Total de votos para o candidato 1: " + totalCandidato1);
            System.out.println("Total de votos para o candidato 2: " + totalCandidato2);
            System.out.println("Total de votos para o candidato 3: " + totalCandidato3);
            System.out.println("Total de votos para o candidato 4: " + totalCandidato4);
            System.out.println("Total de votos nulos: " + totalNulos);
            System.out.println("Total de votos em branco: " + totalEmBranco);
            System.out.println("Porcentagem de votos nulos sobre o total de votos: " + porcentagemNulos + "%");
            System.out.println("Porcentagem de votos em branco sobre o total de votos: " + porcentagemEmBranco + "%");
        }

    }
}