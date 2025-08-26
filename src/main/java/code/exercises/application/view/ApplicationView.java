package code.exercises.application.view;

import java.util.Scanner;

public class ApplicationView {

    Scanner input = new Scanner(System.in);

    public int mainCategory(){
        System.out.println("|=================================|");
        System.out.println("|            Categoria            |");
        System.out.println("|=================================|");
        System.out.println("| 1 - Alunos                      |");
        System.out.println("| 2 - Funcionarios                |");
        System.out.println("| 3 - Livros                      |");
        System.out.println("| 4 - Pedidos                     |");
        System.out.println("| 5 - Produtos                    |");
        System.out.println("|=================================|");
        System.out.print("Insira a sua escolha: ");
        return input.nextInt();
    }

    public int mainOperation(){
        System.out.println("|=================================|");
        System.out.println("|            Operação             |");
        System.out.println("|=================================|");
        System.out.println("| 1 - Criar                       |");
        System.out.println("| 2 - Deletar                     |");
        System.out.println("| 3 - Pesquisar                   |");
        System.out.println("| 4 - Listar                      |");
        System.out.println("| 5 - Atualizar                   |");
        System.out.println("|=================================|");
        System.out.print("Insira a sua escolha: ");
        return input.nextInt();
    }
}
