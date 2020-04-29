import java.util.Scanner;

public class Pilhasequencial {

    //Propriedades da Pilha
    Aluno[] alunos = new Aluno[10];
    int indiceAtual = 0; //Inicia 0

    public void Iniciar(Scanner sc){
    	System.out.println("• PILHA SEQUENCIAL até 10 Posicoes (1 a 10) •");
        
        boolean voltar = false;
        do{
        	System.out.println("\nEscolha uma opção para ser executada:\n"
            +"1 - Inserir Aluno ('Nome do Aluno')\n"
            +"2 - Remover Aluno\n"
            +"3 - Exibir Alunos\n"
            +"4 - Voltar\n");
            
            String entrada;
            System.out.println("OPÇÃO:");
            entrada = sc.nextLine();

            switch(entrada){
                case "1":
                InserirElemento(sc);
                break;

                case "2":
                RemoverElemento(sc);
                break;

                case "3":
                ExibirElementos();
                break;

                case "4":
                voltar = true;
                break;
            }

        } while (!voltar);
    }


    //Metodo de inserir elementos (PUSH)
    public void InserirElemento(Scanner sc){

        if(indiceAtual == 10){ //9 que representa a 10ª posicao
        	System.out.println("=> Esta pilha está Lotada. Remova algum(ns) para poder adicionar novamente.");
        } else {
            
        	System.out.println("NOME:");
            String nome = sc.nextLine();
            
            if(nome != ""){
                Aluno novoAluno = new Aluno(); //Cria um novo aluno
                novoAluno.setNome(nome); //Atribui novo nome para esse aluno.

                alunos[indiceAtual] = novoAluno; //Inclui o aluno no indice atual.
                System.out.println("=> \""+ novoAluno.getNome()+"\" adicionado na posicao "+ (indiceAtual+1) +"");

                indiceAtual++; //Incrementa o Indice atual.

            } else {
            	System.out.println("Error: Vazio não é valido!");
            }
        }
    }


    //Metodo de remover elementos (POP)
    public void RemoverElemento(Scanner sc){

        if(indiceAtual == 0){
        	System.out.println("-- Não temos ninguem na pilha --");
        } else {
        	System.out.println("=> Aluno \""+ alunos[indiceAtual -1].getNome() + "\" na posicao "+ indiceAtual  +" removido!");
            alunos[indiceAtual - 1] = null;
            indiceAtual--;
        }
    }

    //Metodo de exibir elementos.
    public void ExibirElementos(){
    	System.out.println("---- LISTA ----");
        //Mostrarei do maior para o menor, para ficar uma pilha graficamente kkk
        for(int i=alunos.length - 1; i>=0; i--){
            if(alunos[i] != null){
            	System.out.println("=> " + (i+1) + " - " + alunos[i].getNome());
            }
        }
        System.out.println("---------------");
    }

}