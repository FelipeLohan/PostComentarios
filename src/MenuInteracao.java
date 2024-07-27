import java.time.LocalDate;
import java.util.Scanner;
import Entities.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;    

public abstract class MenuInteracao {

    public static void menuInteracao(){
        List <Post> posts = new ArrayList<>();
                    int vezesrepetidas = 0;

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("--------SISTEMA DE POST--------");
            System.out.println("1 - Adicionar Post");
            System.out.println("2 - Adicionar Comentário");
            System.out.println("3 - Ver Posts");
            System.out.println("4 - Ver Comentários de determinado Post");
            System.out.println("5 - Sair");
                opcao = teclado.nextInt();
                    teclado.nextLine();
                    
            
            switch (opcao) {
                case 1:
                boolean novopost = true;
                    if(novopost = true){
                        vezesrepetidas ++;
                        
                    }
                LocalDate horaAtual = LocalDate.now();
                    System.out.println("Titulo do video: ");
                        String titulo = teclado.nextLine();
                            System.out.println("Conteudo do video: ");
                                String conteudo = teclado.nextLine();
                                    

                    Post post = new Post(horaAtual , titulo, conteudo, 0, vezesrepetidas);
                        posts.add(post);
                            novopost = false;
                    break;
                case 2:
                    System.out.println("Em qual post você quer comentar? ");
                        int numeroDoPost = teclado.nextInt();
                        for (Post p : posts) {
                            if(p.getId() == numeroDoPost){
                                p.comentar();
                            }
                        }
                    break;
                case 3:
                    for (Post p : posts) {
                        System.out.println(p.toString());
                    }
                    break;

                case 4:
                    System.out.println("Qual post você deseja ver os comentários? ");
                        numeroDoPost = teclado.nextInt();
                            teclado.nextLine();
                            for (Post p : posts) {
                                if(numeroDoPost == p.getId()){
                                    p.verComentarios();
                                }
                            }
                    break;
                case 5:
                    System.out.println("Obrigado por usar o sistema! ");
                    break;
            
                default:
                    System.out.println("Digite um dos numeros acimas, pra acessar sua respectiva funcao");
                    break;
            }


        } while(opcao != 5);
    }
}
