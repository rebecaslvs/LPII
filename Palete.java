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
import java.util.Iterator;

public class Palete {

    private Float n; //número de identificação do palete
    private String posicao; //A, B, C, D, E e F
    private int nivel; // nivel de empilhamento
    private String tipo; //os tipos serão pré-definidos
    private double peso; //peso da carga em quilogramas
    private String identificador; //junção da posição mais n (ch.n)
    
    Scanner leitor = new Scanner(System.in);

    float peso_mercadoria = 0; //característica do palete
    String tipo_mercadoria = ""; //característica do palete

    int escolha = 1; //para controle do menu de posições
    int menu = 0; //para controle do menu de ações

    int[] numero_a = new int[10000000];
    int[] numero_b = new int[10000000];
    int[] numero_c = new int[10000000];
    int[] numero_d = new int[10000000];
    int[] numero_e = new int[10000000];
    int[] numero_f = new int[10000000];
    
    int cont_bebida=0;
    int cont_cereal=0;
    int cont_enlatado=0;
    int cont_higiene=0;
    int cont_limpeza=0;
    
    float peso_bebida=0;
    float peso_cereal=0;
    float peso_enlatado=0;
    float peso_higiene=0;
    float peso_limpeza=0;

    int posicaoa = 1;
    int posicaob = 1;
    int posicaoc = 1;
    int posicaod = 1;
    int posicaoe = 1;
    int posicaof = 1;
    
    ArrayDeque<Palete> paletes_nivel1 = new ArrayDeque<>(3);
    ArrayDeque<Palete> paletes_nivel2 = new ArrayDeque<>(3);
    ArrayDeque<Palete> paletes_nivel3 = new ArrayDeque<>(3);
    ArrayDeque<Palete> paletes_nivel4 = new ArrayDeque<>(3);
    ArrayDeque<Palete> paletes_nivel5 = new ArrayDeque<>(3);
    ArrayDeque<Palete> paletes_nivel6 = new ArrayDeque<>(3);

    
    Iterator <Palete> iterator1 = paletes_nivel1.iterator();
    Iterator <Palete> iterator2 = paletes_nivel2.iterator();
    Iterator <Palete> iterator3 = paletes_nivel3.iterator();
    Iterator <Palete> iterator4 = paletes_nivel4.iterator();
    Iterator <Palete> iterator5 = paletes_nivel5.iterator();
    Iterator <Palete> iterator6 = paletes_nivel6.iterator();
    
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
    
    void menu_tipo()
    {
        System.out.println("*****TIPO DE MERCADORIA****");
        System.out.println("1- BEBIDAS");
        System.out.println("2- CEREAIS");
        System.out.println("3- ENLATADOS");
        System.out.println("4- HIGIENE PESSOAL");
        System.out.println("5- MATERIAL DE LIMPEZA");
        System.out.println("");
        System.out.println("Digite o número correspondente ao tipo de mercadoria: ");
        tipo_mercadoria = leitor.nextLine();
        System.out.println("Qual o peso da mercadoria? ");
        peso_mercadoria = leitor.nextFloat();
        
        if("1".equals(tipo_mercadoria) == true)
        {
            cont_bebida++;
            tipo_mercadoria="BEBIDA";
            peso_bebida= peso_bebida+peso_mercadoria;
        }else
            if("2".equals(tipo_mercadoria) == true)
            {
                cont_cereal++;
                tipo_mercadoria="CEREAL";
                peso_cereal= +peso_mercadoria;
            }else
                if("3".equals(tipo_mercadoria) == true)
                {
                    cont_enlatado++;
                    tipo_mercadoria="ENLATADO";
                    peso_enlatado= +peso_mercadoria;
                }else
                    if("4".equals(tipo_mercadoria) == true)
                    {
                        cont_higiene++;
                        tipo_mercadoria="HIGIENE PESSOAL";
                        peso_higiene= +peso_mercadoria;
                    }else
                        if("5".equals(tipo_mercadoria) == true)
                        {
                            cont_limpeza++;
                            tipo_mercadoria="MATERIAL DE LIMPEZA";
                            peso_limpeza= +peso_mercadoria;
                        }
    }
    
    void menuprincipal()
    {
        Palete p1 = new Palete("", 0f, "");
        
        Scanner leitor = new Scanner(System.in);
        
        int menu = 0;
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
        
        if (menu == 1) 
        {
            p1.empilhar();
            
        } else if (menu == 2)
            {
                String busca;
                System.out.println("Digite ID do palete que deseja remover (formato ch.n): ");
                busca = leitor.next();
                
		while (iterator1.hasNext()) 
                {
			Palete palete = iterator1.next();
                        
			if (palete.getIdentificador() == null ? busca == null : palete.getIdentificador().equals(busca)) 
                        {
				iterator1.remove();
			}   
		}
                
                while (iterator2.hasNext()) 
                {
			Palete palete = iterator2.next();
                        
			if (palete.getIdentificador() == null ? busca == null : palete.getIdentificador().equals(busca)) 
                        {
				iterator2.remove();
			}   
		}
                
                while (iterator3.hasNext()) 
                {
			Palete palete = iterator3.next();
                        
			if (palete.getIdentificador() == null ? busca == null : palete.getIdentificador().equals(busca)) 
                        {
				iterator3.remove();
			}   
		}
                
                while (iterator4.hasNext()) 
                {
			Palete palete = iterator4.next();
                        
			if (palete.getIdentificador() == null ? busca == null : palete.getIdentificador().equals(busca)) 
                        {
				iterator4.remove();
			}   
		}
                
                while (iterator5.hasNext()) 
                {
			Palete palete = iterator5.next();
                        
			if (palete.getIdentificador() == null ? busca == null : palete.getIdentificador().equals(busca)) 
                        {
				iterator5.remove();
			}   
		}
                
                while (iterator6.hasNext()) 
                {
			Palete palete = iterator6.next();
                        
			if (palete.getIdentificador() == null ? busca == null : palete.getIdentificador().equals(busca)) 
                        {
				iterator6.remove();
			}   
		}
                
                menuprincipal();
                
              } else if(menu==3)
              {
                  
              }else if(menu==4)
             {
                System.out.println("****QUANTIDADE DE PALETES POR TIPO DE MERCADORIA****");
                System.out.println("BEBIDAS = "+ cont_bebida);
                System.out.println("CEREAIS = "+ cont_cereal);
                System.out.println("ENLATADOS = "+ cont_enlatado);
                System.out.println("HIGIENE PESSOAL = "+ cont_higiene);
                System.out.println("MATERIAL DE LIMPEZA = "+ cont_limpeza);
                System.out.println("");
                menuprincipal();
                
                }else if(menu==5)
                {
                    
                System.out.println("****PESO TOTAL POR TIPO DE MERCADORIA****");
                System.out.println("BEBIDAS = "+ peso_bebida + " quilos");
                System.out.println("CEREAIS = "+ peso_cereal+ " quilos");
                System.out.println("ENLATADOS = "+ peso_enlatado+ " quilos");
                System.out.println("HIGIENE PESSOAL = "+ peso_higiene+ " quilos");
                System.out.println("MATERIAL DE LIMPEZA = "+ peso_limpeza+ " quilos");
                System.out.println("");
                menuprincipal();
                }
            
                else if(menu==6) 
                {
                    if (numero_a[posicaoa]==0) 
                    {
                        System.out.println("Posição A vazia!");
                    }
                        
                        menuprincipal();
                }               
        
            System.out.println("PALETE A: "+ paletes_nivel1.toString());
            System.out.println("PALETE B" + paletes_nivel2.toString());
        }
    
    void empilhar() {
        
        while (escolha == 1) {

            System.out.println("Esse palete será inserido em qual posição(A, B, C, D, E ou F): ");
            String menu_pp = leitor.nextLine();

            if ("A".equals(menu_pp) == true) {
                if (numero_a[posicaoa] == 3)
                {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                    menuprincipal();
                } else {
                    menu_tipo();
                    
                    identificador = (menu_pp) + (numero_a[posicaoa] + 1);
                    numero_a[posicaoa]++;
                    
                    Palete palete = new Palete (tipo_mercadoria, peso_mercadoria, identificador);
                    
                    System.out.println("Palete adicionado a posição A e ao nível " + numero_a[posicaoa]);
                    paletes_nivel1.add(palete);

                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                        menuprincipal();
                    }
                }
            } else if ("B".equals(menu_pp) == true) {
                if (numero_b[posicaob] == 3) {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                    menuprincipal();
                } else {
                    menu_tipo();

                    identificador = (menu_pp) + (numero_b[posicaob] + 1);
                    numero_b[posicaob]++;
                    
                    Palete palete = new Palete (tipo_mercadoria, peso_mercadoria, identificador);
                    
                    System.out.println("Palete adicionado a posição B e ao nível " + numero_b[posicaob]);
                    paletes_nivel2.add(palete);


                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                       menuprincipal();
                    }
                }
            } else if ("C".equals(menu_pp) == true) {
                if (numero_c[posicaoc] == 3) {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                    menuprincipal();
                } else {
                    menu_tipo();

                    identificador = (menu_pp) + (numero_c[posicaoc] + 1);
                    numero_c[posicaoc]++;
                    
                    Palete palete = new Palete (tipo_mercadoria, peso_mercadoria, identificador);
                    
                    System.out.println("Palete adicionado a posição C e ao nível " + numero_c[posicaoc]);
                    paletes_nivel3.add(palete);


                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                       menuprincipal();
                    }
        }
    } else if ("D".equals(menu_pp) == true) {
                if (numero_d[posicaod] == 3) {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                    menuprincipal();
                } else {
                    menu_tipo();

                    identificador = (menu_pp) + (numero_d[posicaod] + 1);
                    numero_d[posicaod]++;
                    
                    Palete palete = new Palete (tipo_mercadoria, peso_mercadoria, identificador);
                    
                    System.out.println("Palete adicionado a posição D e ao nível " + numero_d[posicaod]);
                    paletes_nivel4.add(palete);


                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                       menuprincipal();
                    }
        }
    } else if ("E".equals(menu_pp) == true) {
                if (numero_e[posicaoe] == 3) {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                    menuprincipal();
                } else {
                    menu_tipo();

                    identificador = (menu_pp) + (numero_e[posicaoe] + 1);
                    numero_e[posicaoe]++;
                    
                    Palete palete = new Palete (tipo_mercadoria, peso_mercadoria, identificador);
                    
                    System.out.println("Palete adicionado a posição E e ao nível " + numero_e[posicaoe]);
                    paletes_nivel5.add(palete);


                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                       menuprincipal();
                    }
        }
    } else if ("F".equals(menu_pp) == true) {
                if (numero_f[posicaof] == 3) {
                    System.out.println("POSIÇÃO DE EMPILHAMENTO CHEIA!");
                    menuprincipal();
                } else {
                    menu_tipo();

                    identificador = (menu_pp) + (numero_f[posicaof] + 1);
                    numero_f[posicaof]++;
                    
                    Palete palete = new Palete (tipo_mercadoria, peso_mercadoria, identificador);
                    
                    System.out.println("Palete adicionado a posição B e ao nível " + numero_f[posicaof]);
                    paletes_nivel6.add(palete);


                    System.out.println("Você deseja empilhar um novo palete? Responda com 1 para sim ou digite qualquer outra tecla para não: ");
                    escolha = leitor.nextInt();
                    if (escolha != 1) {
                       menuprincipal();
                    }
        }
    } else
    {
        System.out.println("Posição inválida!");
        menuprincipal();
    }
}
    }
}
