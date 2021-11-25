/*Neste projeto, propõe-se administrar o empilhamento, no interior de determinado supermercado atacadista, de paletes, sendo estes
basicamente estrados de madeira, metal ou plástico amplamente utilizados na movimentação de cargas. Para fins de simplificação,
considere apenas um porta paletes do referido supermercado com 6 (seis) posições de empilhamento e com 3 (três) níveis de
prateleiras, conforme ilustrado na figura abaixo (à esquerda).

Ao registrar o empilhamento de um palete, dele deverão ser exigidas as seguintes informações: a) peso da carga (em quilogramas);
b) tipo de mercadoria (bebidas, cereais, enlatados, higiene pessoal e material de limpeza); e c) posição de empilhamento. Além
disso, um identificador único deverá estar associado àquele palete, a ser usado em futuras operações de empilhamento e
desempilhamento (ou seja, não se admitirá que dois ou mais paletes, ainda que localizados em posições de empilhamento distintas,
possuam o mesmo identificador). Por fim, apesar de possível, considere que o protocolo de empilhamento adotado pelo
supermercado impede, a qualquer tempo, que níveis inferiores do porta paletes estejam vazios se houver paletes nos níveis
superiores correspondentes; trata-se de restrição aplicável inclusive durante as operações de empilhamento e desempilhamento (para
fins de exemplificação, na mesma figura acima, à direita, é ilustrada configuração de empilhamento do porta paletes que é inválida).
O uso de coleções genéricas concretas para a manipulação de pilhas é obrigatório. A aplicação desenvolvida deve dispor ainda
das seguintes funcionalidades e/ou restrições:

Uso das letras A, B, C, D, E e F, para fins de identificação das 6 (seis) posições de empilhamento;

Identificador de palete da forma ch.n, onde ch corresponde à posição de empilhamento (uma letra, portanto) e n ao número
sequencial de inserção do palete independentemente do nível de prateleira em que ele estará posicionado (a título de exemplo,
em caso de empilhamento de dois palete na posição A supondo que ela esteja vazia inicialmente, eles seriam identificados,
respectivamente, por A.1 e A.2);
• Impedimento de dois ou mais paletes possuírem mesmo identificador, ainda que esse identificador tenho sido associado
anteriormente a um palete já retirado do porta palete (estendendo o exemplo anterior, em caso de empilhamento de novo palete
na posição A, seu identificador seria A.3, independentemente de algum ou ambos os paletes de identificadores A.1 e A.2 terem
sido retirados ou não);
• Impedimento da colocação de mais que 3 (três) paletes em cada posição de empilhamento e de 1 (um) palete em cada nível de
prateleira daquela posição;
• Retirada de palete empilhada, pela entrada de seu número de identificação único e observando-se que, em caso de tal palete não
estiver localizado no topo de sua respectiva posição de empilhamento, todos os paletes posicionados em níveis acima dele
deverão ser retirados e, após remoção do palete, devolvidos imediatamente àquela posição;
• Consultas sobre os paletes que se encontram empilhados, a saber: a) dados de peso de carga e tipo de mercadoria de palete
localizado no topo de determinada posição de empilhamento; b) quantidade de paletes por tipo de mercadoria; c) peso total de
cargas empilhadas por tipo de mercadoria (bebidas, cereais, enlatados, higiene pessoal e material de limpeza),
independentemente dos paletes em que se encontram; e e) posições de empilhamento vazias (ou seja, sem paletes empilhados).

 * - prateleira : Pilha
- palete : Palete
+ consultaTopo() : void
+ consutaPeso() : void
+ consultaVazia() : void
+ consultaQuantidade() : void

 */
package superatacadista;

import java.util.Scanner;
import java.util.ArrayList; //usar o add que adiciona o elemento na posição desejada
import java.util.Stack;

public class SuperAtacadista 
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        String identificador;
        Stack <String> paletes = new Stack <>();
        //private Pilha prateleira;
        //private Palete palete;
        
        //Palete palete1 = new Palete ( 100f, "higiene", "A2", (int) 5f);
       // System.out.println("PALETE= " + palete1.getId());
       
        System.out.println("DIGITE O ID DO PALETE QUE DESEJA CADASTRAR: ");
        identificador=leitor.nextLine();
        paletes.push(identificador);
        
        
        
        System.out.println("TOPO DA PILHA: " + paletes.peek()); //se fosse para retirar o elemento do topo seria pop
        //se fosse para ver se a pilha está vazia ou não seria o empty
        System.out.println("" + paletes);
    }
    
}
