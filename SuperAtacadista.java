/*
 * id int privado
posicao privado e string
privado tipo string
privado peso double
cadastrar (): void
 */
package superatacadista;

public class Palete 
{
    private Float n; //número de identificação do palete
    private String posicao; //A, B, C, D, E e F
    private int nivel; // nivel de empilhamento
    private String tipo; //os tipos serão pré-definidos
    private double peso; //peso da carga em quilogramas
    private String identificador; //junção da posição mais n (ch.n)

    public Palete(String tipo, double peso) { //adicionar o identificador aqui
        this.tipo = tipo;
        this.peso = peso;
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
}
