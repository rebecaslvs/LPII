/*
 * id int privado
posicao privado e string
privado tipo string
privado peso double
cadastrar (): void
 */
package superatacadista;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Palete {

    ArrayDeque<String> paletes_nivel1 = new ArrayDeque<>(3);
    ArrayDeque<String> paletes_nivel2 = new ArrayDeque<>(3);
    ArrayDeque<String> paletes_nivel3 = new ArrayDeque<>(3);

    private Float n; //número de identificação do palete
    private String posicao; //A, B, C, D, E e F
    private int nivel; // nivel de empilhamento
    private String tipo; //os tipos serão pré-definidos
    private double peso; //peso da carga em quilogramas
    private String identificador; //junção da posição mais n (ch.n)

    public Palete(String tipo, double peso, String identificador) { //adicionar o identificador aqui
        this.tipo = tipo;
        this.peso = peso;
        this.identificador = identificador;
    }

    public Float getN() {
        return n;
    }

    public void setN(Float n) {
        this.n = n;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String toString()
    {
        return "{ID: "+identificador+"}";
    }
    void empilhar() {

      //  ArrayDeque<String> paletes_nivel1 = new ArrayDeque<>(3);
        //ArrayDeque<String> paletes_nivel2 = new ArrayDeque<>(3);
        //ArrayDeque<String> paletes_nivel3 = new ArrayDeque<>(3);

        Scanner leitor = new Scanner(System.in);

        float peso_mercadoria = 0; //característica do palete
        String tipo_mercadoria = ""; //característica do palete

        int escolha = 1; //para controle do menu de posições
        int menu = 0; //para controle do menu de ações

        int[] numero_a = new int[10000000];
        int[] numero_b = new int[10000000];

        int posicaoa = 1;
        int posicaob = 1;

        while (escolha == 1) {

            System.out.println("Esse palete será inserido em qual posição(A, B, C, D, E ou F): ");
            String menu_pp = leitor.nextLine();

            if ("A".equals(menu_pp) == true) {
                if (paletes_nivel1.size() == 3) {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                } else {

                    System.out.println("Qual o tipo de mercadoria? ");
                    tipo_mercadoria = leitor.nextLine();
                    System.out.println("Qual o peso da mercadoria? ");
                    peso_mercadoria = leitor.nextFloat();

                    identificador = (menu_pp) + (numero_a[posicaoa] + 1);
                    numero_a[posicaoa]++;

                    System.out.println("Palete adicionado a posição A e ao nível " + numero_a[posicaoa]);
                    paletes_nivel1.add(identificador);
                    //paletes_nivel1.add("TESTE");
                    //System.out.println(identificador);

                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                        menuprincipal();
                    }
                }
            } else if ("B".equals(menu_pp) == true) {
                if (paletes_nivel1.size() == 3) {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                } else {
                    System.out.println("Qual o tipo de mercadoria? ");
                    tipo_mercadoria = leitor.nextLine();
                    System.out.println("Qual o peso da mercadoria? ");
                    peso_mercadoria = leitor.nextFloat();

                    identificador = (menu_pp) + (numero_b[posicaob] + 1);
                    numero_b[posicaoa]++;
                    paletes_nivel2.add(identificador);
                    System.out.println(identificador);

                    System.out.println("Palete adicionado a posição B e ao nível " + numero_b[posicaob]);

                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                        menuprincipal();
                    }
                }
            }
        }
    }

    void menuprincipal() {
        int menu = 0;
        Palete p1 = new Palete("", 0f, "");

        Scanner leitor = new Scanner(System.in);

        System.out.println("****MENU DE OPÇÕES****");
        System.out.println("");
        System.out.println("1-EMPILHAR");
        System.out.println("2-DESEMPILHAR PALETE");
        System.out.println("3-CONSULTAR PALETE EMPILHADO");
        System.out.println("4-QUANTIDADE DE PALETES POR TIPO DE MERCADORIA");
        System.out.println("5-PESO TOTAL POR TIPO DE MERCADORIA");
        System.out.println("6-POSIÇÕES DE EMPILHAMENTO LIVRES");
        System.out.println("");
        System.out.println("DIGITE O NÚMERO DA OPÇÃO DESEJADA: ");
        menu = leitor.nextInt();

        if (menu == 1) {
            p1.empilhar();
        } else if (menu == 3) //não está funcionando ainda
        {
            String busca;
            System.out.println("Digite ID do palete que deseja consultar (formato ch.n): ");
            busca = leitor.next();
        } else {
            //System.out.println(paletes_nivel1);
            System.out.println(paletes_nivel1.toString());
        }

    }
}
