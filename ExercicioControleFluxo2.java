//Crie um switch que dado o valor de 1 a 7
//Considerando 1 domingo imprima se é dia util ou final de semana

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        byte dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
