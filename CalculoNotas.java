import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoNotas {

    public static void main(String[] args) {
        java.util.Scanner nota = new Scanner(System.in);
        String nomeAluno, matricula;
        double nota1, nota2, nota3, media, percentualPresenca, presenca;

        //  - a matrícula do aluno;
        System.out.println("Digite a matrícula: ");
        matricula = nota.nextLine();

        // - nome do aluno;
        System.out.println("Nome do aluno: ");
        nomeAluno = nota.nextLine();

        // - valor das três notas;
        System.out.println("Digite a nota 1: ");
        nota1 = nota.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = nota.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = nota.nextDouble();

        // - quantidade de presenças.
        System.out.print("Quantidade de presença em aula: ");
        presenca = nota.nextDouble();
        percentualPresenca = (presenca / 60) * 100;

        //Aparecer na tela as informações:
        //- nome do aluno com sua média de notas e percentual de presença

        media = ((nota1 + nota2 + nota3) / 3);

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("O aluno " + (nomeAluno) + " teve uma média de " + df.format(media) + " referente suas notas e teve um percentual de " + df.format(percentualPresenca) + "% de presença.");
    }
}
