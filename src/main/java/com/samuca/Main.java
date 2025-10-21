package com.samuca;

import dao.UsuarioDAO;
import model.Usuario;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();
        int opcao;

        do {
            System.out.println("\n=== MENU CRUD ===");
            System.out.println("1 - Listar");
            System.out.println("2 - Criar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Deletar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    List<Usuario> lista = dao.listar();
                    lista.forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    dao.criar(new Usuario(nome, email));
                    System.out.println("Usuário criado!");
                    break;
                case 3:
                    System.out.print("ID do usuário: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = sc.nextLine();
                    Usuario u = new Usuario(novoNome, novoEmail);
                    u.setId(id);
                    dao.atualizar(u);
                    System.out.println("Usuário atualizado!");
                    break;
                case 4:
                    System.out.print("ID para deletar: ");
                    int idDel = sc.nextInt();
                    dao.deletar(idDel);
                    System.out.println("Usuário deletado!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
