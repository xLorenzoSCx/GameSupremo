package desafiosupremo;


import java.util.Scanner;

public class DesafioSupremo {

    public static void introduzirGameShow() {
        System.out.println("Bem-vindos ao Super Game Show!");
        System.out.println("Neste jogo, você enfrentará desafios divertidos e tentará ganhar prêmios!");
    }

    public static int escolherNumeroSecreto() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void verificarPalpite(int numeroSecreto, int palpite) {

     if (palpite > numeroSecreto) {
            System.out.println("O seu palpite foi alto demais!!!");
        } else if (palpite < numeroSecreto) {
            System.out.println("O seu palpite foi baixo demais!!!");
        } else {
            System.out.println("Parabéns, você acertou");
        }

    }

    public static void Agradecer() {
        System.out.println("Obrigado por jogar o jogo");
    }

    public static void exibirPontuacaoFinal(int pontuacao) {
        System.out.println("Sua pontuação final é:" + pontuacao);
    }

    public static void dizerAdeus() {
        System.out.println("Bye");
        return;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        introduzirGameShow();
        System.out.println("Deseja começar o jogo de advinhação?(1) para sim e (2) para não");
        int resposta = teclado.nextInt();
        int mult = 1;

        if (resposta == 1) {
            System.out.println("Insira sua aposta");
            int aposta;
            aposta = teclado.nextInt();
            int tentativas = 0, soma = 0, tentAcerto = 0;
            boolean acertou = false;

            System.out.println("Bem-vindo ao jogo de adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100...");

            while (soma < 10000) {

                while (resposta == 1) {

                    while (!acertou) {
                        final int NUMBER = escolherNumeroSecreto();
                        System.out.println(NUMBER);
                        System.out.print("Digite sua tentativa: ");
                        int palpite = teclado.nextInt();
                        tentativas++;

                        verificarPalpite(NUMBER, palpite);

                        if (acertou = true) {
                            tentAcerto += 1;
                            soma = mult * aposta;
                            exibirPontuacaoFinal(soma);

                        }

                    }
                    System.out.println("Deseja continuar?(1) para sim");
                    resposta = teclado.nextInt();
                    mult *= 2;
                    if (resposta == 1) {
                        acertou = false;
                    }

                }
                Agradecer();
                dizerAdeus();

            }

        }
        else {dizerAdeus();}

    }
}


