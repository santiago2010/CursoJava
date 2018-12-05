public class ControleDeFluxo2 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 25;
        String status;

        status = idade < 15 ? "categoria infatil" : idade >= 15 && idade < 18 ? "categoria juvenil" : "categoria adulto";
        System.out.println(status);
    }

}
