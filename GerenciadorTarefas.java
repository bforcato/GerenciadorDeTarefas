import java.util.ArrayList;
import java.util.Scanner;

//Realizado por Beatriz Forcato Lima e Leonardo Kiyoshi Tioda Menezes Rocha.

public class GerenciadorTarefas {

    public static void main(String[] args){
        int op = 100;
        ArrayList<String> lista = new ArrayList<>();

        while (op != 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opcao: \n");
            System.out.println("1- Exibir lista de tarefas     2- Cadastrar nova tarefa     3- Excluir uma tarefa");
                try {
                    op = scanner.nextInt();
                } catch (Exception e) {
                    op = 100;
                    System.out.println("Insira um valor válido!");
                }
                scanner = new Scanner(System.in);

            switch (op){
                case 1:
                    System.out.println("Lista de tarefas: \n");
                    int i = 0;
                    for (String tar: lista) {
                    System.out.println(++i + " " + tar);
                    }
                    break;
                    
                case 2:
                    System.out.print("Insira a tarefa: \n");
                    String tarefa = scanner.nextLine();
                    lista.add(tarefa);
                    break;
                
                case 3:
                    System.out.print("Digite o numero da tarefa a ser deletada: \n");
                    try{
                        int del = scanner.nextInt() - 1;
                        if (del < 0 || del >= lista.size()){
                            System.out.println("A tarefa selecionada não existe! \n");
                        }else{
                            lista.remove(del);
                        }
                    }catch (Exception e){
                        System.out.println("Valor invalido! \n");
                    }
            }
        }
    }
}
