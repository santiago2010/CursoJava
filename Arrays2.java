public class Arrays2 {
    public static void main(String[] args) {
        String [] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Joao";
        nomes[2] = "Carlos";

        for (int i=0; i<nomes.length; i++){
            System.out.println((i+1)+ " nome é: "+ nomes[i]);
        }

    }
}
