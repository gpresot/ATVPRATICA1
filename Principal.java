import java.util.Scanner;
public class Principal {
    public static void main(String[] args){

        Mecanico mecanico1 = new Mecanico("Rafael","159.954.234-13","Eletrica","31995407643");
        
        Mecanico mecanico2 = new Mecanico("Ze","159.456.874-13","trocaOleo","31998754356");

        Mecanico mecanico3 = new Mecanico("Arthur","568.123.874-34","trocaPeca","31998765423");

        Box box1 = new Box(mecanico1,1,"Eletrica",5,"Belo Horizonte");
        
        Box box2 = new Box(mecanico2,2,"trocar oleo",10,"Contagem");

        Box box3 = new Box(mecanico3,3,"trocar peca motor",3,"Betim");

        Scanner scanf = new Scanner(System.in);
        int op;
        do{

        System.out.println("--------------------\nBem vindo ao sistema!\n--------------------\nEscolha uma opção:\n\n1-Cadastrar ordem de serviço\n2-Associar um mecânico a um box/n3-Atribuir ordem de serviço a um box\n4-Exibir todas as ordens atribuídas a um box específico\n5-Informar a quantidade total de ordens finalizadas por cada box\n6-Buscar ordens por status\n7-Exibir os detalhes completos de uma ordem específica\n8-Sair");
        
        op = scanf.nextInt();
        switch(op){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                System.out.println("Digitou uma opcao invalida");
        }

        

        }while(op!=8);

    }
}
