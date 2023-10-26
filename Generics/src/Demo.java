import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(new Ford("Ecosport", "Azul", 2022));
        carros.add(new Porsche("Taycan", "Preto", 2023));
        carros.add(new Honda("Civic", "Branco", 2021));
        System.out.println(carros);
    }
}
