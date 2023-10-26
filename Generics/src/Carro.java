public abstract class Carro {
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro = " + getClass().getSimpleName() + "\n" +
                "Modelo = " + modelo +  "\n" +
                "Cor = " + cor + "\n" +
                "Ano = " + ano + "\n" +
                "++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                "\n"
                ;

    }
}
