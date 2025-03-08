
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int x;
        System.out.println("entrar com a quantidade de alunos(as):");
        x = sc.nextInt();
        sc.nextLine();
        List<aluno> list = new ArrayList<>();

        for(int i=0; i<x; i++){
            System.out.println("entre com o nome do(a) aluno(a)" + (1 + i) + ":");
            String nome = sc.nextLine();
            System.out.println("entre com a nota1 do(a) aluno(a) " + (1 + i) + ":");
            double nota1 = sc.nextDouble();
            System.out.println("entre com a nota2 do(a) aluno(a) " + ( 1 + i) + ":");
            double nota2 = sc.nextDouble();
            System.out.println("entre com a nota3 do(a) aluno(a) " + (1 + i) + ":");
            double nota3 = sc.nextDouble();
            sc.nextLine();

            aluno aluno = new aluno(nome, nota1, nota2, nota3);
            list.add(aluno);

            if(aluno.media(nota1, nota2, nota3) < 7){
                System.out.println("Aluno: "+ aluno + "reprovado(a)");
            } else {
                System.out.println("Aluno: "+ aluno + "aluno aprovado(a)");
            }

        }
      //  System.out.println(list);



        sc.close();
    }
}