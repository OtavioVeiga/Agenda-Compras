package br.unigran.listacompras;

public class listagem {
    String nome;
    String marca;
    String quant;

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override

    public String toString() {
        return nome + " / " + marca  + " / " + quant;
    }
}
