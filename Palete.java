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
    private float id;
    private String posicao;
    private String tipo;
    private double peso;

    public Palete(float id, String posicao, String tipo, double peso) {
        this.id = id;
        this.posicao = posicao;
        this.tipo = tipo;
        this.peso = peso;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
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
    
    
}
