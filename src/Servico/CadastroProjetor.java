package Servico;

import Modelo.Projetor;

import java.util.Scanner;

public class CadastroProjetor {

    public void cadastrarProjetor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do projetor: ");
        String nome = sc.nextLine();
        System.out.println("Digite o codigo do projetor: ");
        String codigo = sc.nextLine();
        System.out.println("O projetor esta disponivel?");
        boolean disponivel = sc.nextBoolean();
        Projetor p = new Projetor(nome,codigo,disponivel);
    }









}