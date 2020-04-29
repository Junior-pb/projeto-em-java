import java.util.Scanner;

public class Listasequencial {

    //Propriedades da Lista
    Aluno[] alunos = new Aluno[10];

    public void Iniciar(Scanner sc){
    	System.out.println("• LISTA SEQUENCIAL até 10 Posicoes (1 a 10) •");
        
        boolean voltar = false;
        do{
        	System.out.println("\nEscolha uma função para ser executada:\n"
            +"1 - Inserir Aluno ('Posicao' e  'Nome do Aluno')\n"
            +"2 - Remover Aluno ('Posicao') \n"
            +"3 - Exibir Alunos\n"
            +"4 - Voltar\n");
            
            String entrada;
            System.out.println("FUNCAO:");
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


    //Metodo de inserir elementos.
    public void InserirElemento(Scanner sc){

    	System.out.println("POSICAO (1 a 10):");
        int posicao = Integer.parseInt(sc.nextLine());

        if(posicao > 10 || posicao < 1){
        	System.out.println("=> Só temos 10 posições. Use um valor válido de 1 a 10!");
        } else {

        	System.out.println("NOME:");
            String nome = sc.nextLine();
            
            if(nome != ""){
                
                
                Aluno novoAluno = new Aluno(); //Cria um novo aluno
                novoAluno.setNome(nome); //Atribui novo nome para esse aluno.

                //E joga esse aluno na lista sequencial (Array)
                alunos[posicao - 1] = novoAluno;

                System.out.println("=> \""+ novoAluno.getNome()+"\" adicionado na posicao "+posicao+"");

            } else {
            	System.out.println("Error: Vazio não é valido!");
            }
        }
    }

    //Metodo de remover elementos.
    public void RemoverElemento(Scanner sc){
    	System.out.println("POSICAO (1 a 10):");
        int posicao = Integer.parseInt(sc.nextLine());

        if(posicao > 10 || posicao < 1){
        	System.out.println("=> Só temos 10 posições. Use um valor válido de 1 a 10!");
        } else if(alunos[posicao - 1] == null){
        	System.out.println("=> Não tem ninguém nessa posição!");
        } else {
        	System.out.println("=> Aluno \""+ alunos[posicao-1].getNome() +"\" na posicao "+posicao+" removido!");
            alunos[posicao - 1] = null;
        }
    }

    //Metodo de exibir elementos.
    public void ExibirElementos(){
    	System.out.println("---- LISTA ----");
        for(int i=0; i<alunos.length; i++){
            if(alunos[i] != null){
            	System.out.println("=> " + (i+1) + " - " + alunos[i].getNome());
            }
        }
        System.out.println("---------------");

    }

}