public class ControleDeFluxo1 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 14;

        if (idade < 15){
            System.out.println("Esta na categoria infantil");
        }else if (idade >= 15 && idade < 18){
            System.out.println("Esta na categoria juvenil");
        }else {
            System.out.println("esta na categoria adulto");
        }
    }
}
