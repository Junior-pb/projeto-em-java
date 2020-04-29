import java.util.Scanner;

class Principal {
    
    //Intanciamos o Scanner
    static Scanner sc = new Scanner(System.in);

    //Classes das Listas/Pilhas
    static Listasequencial listasequencial = new Listasequencial();
    static Listaencadeada listaencadeada = new Listaencadeada();
    static Pilhasequencial pilhasequencial = new Pilhasequencial();
    static Pilhaencadeada pilhaencadeada = new Pilhaencadeada();

    public static void main(String[] args) {
        //Inicia a aplicação
        ListasApp();
    }

    
    public static void ListasApp(){

        boolean sair = false;
        System.out.println("Bem vindo ao app sobre Listas e Pilhas\n");
        
        do{
            
            //Entramos no loop das questões.            
            System.out.println("\nDigite a OPCAO que deseja:\n"
            + "1 - Lista Sequencial\n"
            + "2 - Lista Encadeada\n"
            + "3 - Pilha Sequencial\n"
            + "4 - Pilha Encadeada\n"
            + "0 - Para Sair\n");
            
            System.out.println("OPCAO:");
            String entrada; //Entrada do usuário.
            entrada = sc.nextLine(); //Pega a entrada do usuario
            
            switch(entrada){
                case "1": //Lista Sequencial
                	listasequencial.Iniciar(sc);
                    break;
    
                case "2": //Lista Encadeada
                	listaencadeada.Iniciar(sc);
                    break;
    
                case "3": //Pilha Sequencial
                	pilhasequencial.Iniciar(sc);
                    break;
    
                case "4": //Pilha Encadeada
                	pilhaencadeada.Iniciar(sc);
                    break;

                case "0": //SAIR
                    sair = true;
                    break;
            }
            
        } while (!sair); //Mantem o loop enquanto a opção não for "0"
    }
}