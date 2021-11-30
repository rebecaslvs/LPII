package superatacadista;

//import java.util.ArrayList; //usar o add que adiciona o elemento na posição desejada
import java.util.Stack;
import java.util.Scanner; //vai pedir para avisar 

public class SuperAtacadista 
{
    public static void main(String[] args)
    {
        Stack <String> paletes_nivel1 = new Stack <>();
        //Stack <String> paletes_nivel2 = new Stack <>();
        //Stack <String> paletes_nivel3 = new Stack <>();
        
        Scanner leitor = new Scanner(System.in);
        
        float peso_mercadoria;
        int escolha = 0;
        int [] numero = new int [6];
        String tipo_mercadoria;
        
       // Stack<String>[] p = null;
        
      //  for(int i =0; i<p.length; i++)
        //{
          //  p[i] = new Stack<String>();
        //}
        int posicao = 0;
        
//        if(p[posicao].size()==3){
  //          System.out.println("Posição de empilhamento cheia!");
   //     }
        
        //int controle;
        //String comparacao;
        // String controle;
        
        //ver a questão do nível 
        
      //tirar a posição das caracteristicas, só serve para indicar msm
        
        System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou 2 para não: ");
        escolha=leitor.nextInt();
        
        if(escolha==1)
        {
            System.out.println("Esse palete será inserido em qual posição? (A, B, C, D, E ou F): ");
            String menu_pp=leitor.next();
            
            if("A".equals(menu_pp)==true)
            {
                System.out.println("Qual o tipo de mercadoria? ");
                tipo_mercadoria=leitor.next();
                System.out.println("Qual o peso da mercadoria? ");
                peso_mercadoria=leitor.nextFloat();
                
                Palete p1 = new Palete(tipo_mercadoria,peso_mercadoria);
                p1.setPosicao("A");
                // p1.setN(numero+1);
                p1.setIdentificador(p1.getPosicao() + numero[posicao+1]);
                numero[posicao]++;
                //p1.getIdentificador();                
                
                //paletes_nivel1.push(p1.getIdentificador());
                
                System.out.println("POSIÇÃO= "+ p1.getPosicao());
                System.out.println("ID= "+ p1.getIdentificador());
                
                System.out.println("TOPO DA PILHA 1: " + paletes_nivel1.peek());
                // }
            }else System.out.println("Posição diferente de A");
        }else if (escolha == 2)
        {
            System.out.println("Ok, o programa será encerrado.");
        } else
            System.out.println("ENTRADA INVÁLIDA! POR FAVOR ESCOLHA UMA OPÇÃO VÁLIDA.");
      
    //  Palete p1 = new Palete("A","BEBIDA",100);
      //  Palete p2 = new Palete("B","HIGIENE PESSOAL",150);
        //Palete p3 = new Palete ("A", "BEBIDA", 200);
        
      /*  //if()
        p1.setN(numero+1);
        p1.setIdentificador(p1.getPosicao() + p1.getN());
        p1.getIdentificador();
        paletes_nivel1.push(p1.getIdentificador());
        System.out.println("POSIÇÃO= "+ p1.getPosicao());
        System.out.println("NÚMERO= "+ p1.getN());
        System.out.println("ID= "+ p1.getIdentificador());
       // System.out.println("PALETE= " + palete1.getId());
        System.out.println("");
        
        
        p2.setN(numero+1);
        p2.setIdentificador(p2.getPosicao() + p2.getN());
        p2.getIdentificador();
        paletes_nivel2.push(p2.getIdentificador());
        System.out.println("POSIÇÃO= "+ p2.getPosicao());
        System.out.println("NÚMERO= "+ p2.getN());
        System.out.println("ID= "+ p2.getIdentificador());
        System.out.println("");
        
        p3.setN(numero+2);
        p3.setIdentificador(p3.getPosicao() + p3.getN());
        p3.getIdentificador();
        paletes_nivel1.push(p3.getIdentificador());
        System.out.println("POSIÇÃO= "+ p3.getPosicao());
        System.out.println("NÚMERO= "+ p3.getN());
        System.out.println("ID= "+ p3.getIdentificador());
        System.out.println("");
        
        //deque
        
        System.out.println("TOPO DA PILHA 1: " + paletes_nivel1.peek()); //se fosse para retirar o elemento do topo seria pop
        System.out.println("TOPO DA PILHA 2: " + paletes_nivel2.peek()); //se fosse para retirar o elemento do topo seria pop
        //se fosse para ver se a pilha está vazia ou não seria o empty
       // System.out.println("" + paletes);
    */
        
    }
}
