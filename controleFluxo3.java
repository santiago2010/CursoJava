public class controleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda feira");
                break;
            case 3:
                System.out.println("terca feira");
                break;
            case 4:
                System.out.println("Quarta feira");
                break;
            case 5:
                System.out.println("Quinta feira");
                break;
            case 6:
                System.out.println("Sexta feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        String sexo = "F";
        switch (sexo){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Mascolino");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
