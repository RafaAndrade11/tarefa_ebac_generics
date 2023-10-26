import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(new Ford("Ecosport", "Azul", 2022));
        carros.add(new Porsche("Taycan", "Preto", 2023));
        carros.add(new Honda("Civic", "Branco", 2021));
        imprimirCarros(carros);
    }

    private static void imprimirCarros(List<Carro> carros) {

        for (Carro carro : carros) {
            System.out.println("Carro: " + carro.getClass().getSimpleName());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Cor: " + carro.getCor());
            System.out.println("Ano: " + carro.getAno());
            System.out.println();
        }
    }
}
