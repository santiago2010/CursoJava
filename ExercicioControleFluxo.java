//calculando impostos

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        double salario = 1400;
        double totalDeImposto = 0;
        if (salario < 1000){
            totalDeImposto = salario *= 0.05;
        }else if (salario >= 1000 && salario < 2000) {
            totalDeImposto = salario *= 0.10;
        }else if (salario >= 2000 && salario < 4000){
            totalDeImposto = salario *= 0.15;
        }else {
            totalDeImposto = salario *= 0.20;
        }
        System.out.println("Total de imposto é: " + totalDeImposto);
    }
}
