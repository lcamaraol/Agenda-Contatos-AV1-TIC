// Projeto AV1 TIC 
// 
// Grupo:
// Alex Diniz - 06003943
// Bernardo da Silva - 06004026
// Eduardo Esplinio - 06003445
// Guilherme Falcão - 06004094
// Mateus Sampaio - 06003438
// João Gabriel Soares - 06003848

package celular;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String args[]) {
        
        //Aréa das variaveis
        String n;                                                    // Nome do contato
        String num;                                                 // Numero do contato
        int id;                                                    // Id para exclusão
        int opcao;                                                // Opção do menu
        Scanner ler = new Scanner(System.in);                    // Scanner
        Scanner enter = new Scanner(System.in);                 // Scanner  
        ArrayList<Contato> contatos = new ArrayList<>();       // Lista dos contatos
        

        do {

            System.out.println("\n-------Opção-------");
            System.out.println("[ 1 ] Adicionar contato.");
            System.out.println("[ 2 ] Listar contatos.");
            System.out.println("[ 3 ] Excluir contato.");
            System.out.println("[ 0 ] Fechar agenda.");
            System.out.println("\nOpção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch(opcao){
                case 1: // Cria contato
                    System.out.println("Nome do contato: ");
                    n = ler.nextLine();
                    System.out.println("Numero do contato: ");
                    num = ler.nextLine();
                    Contato pessoa = new Contato(n, num);
                    contatos.add(pessoa);
                    System.out.println("\nContato adicionado.");
                break;
                case 2: // Lista todos os contatos
                    if (contatos.size() != 0) {
                        System.out.println("\n--------Lista de Contatos-------\n");
                        for (int i = 0; i < contatos.size(); i++) { // loop que ira escrever cada contato pelo o seu index.
                            System.out.println(contatos.get(i));
                
                        }
                    } else {
                        System.out.println("\nNão existem contatos.");
                    }
                break;
                case 3:
                    if (contatos.size() != 0) {
                        System.out.println("\n--------Lista de Contatos-------\n");
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println("ID: " + i + " | " + contatos.get(i));
                
                        }
                        System.out.println("\nDigite o ID do contao que deseja remover");
                        id = ler.nextInt();
                        contatos.remove(id);        // Metodo que remove objeto/elemento de um ArrayList pelo o seu index
                        System.out.println("\nContato removido.");
                    } else {
                        System.out.println("\nNão existem contatos.");
                    }
                break;
                case 0:
                    System.out.println("\nAgenda finalizada.");
                break;
                default: 
                    System.out.println("\nOpção invalida;");
            } 
            System.out.println("\nPressione ENTER para continuar.");
            enter.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        } while (opcao != 0);
    }
}
