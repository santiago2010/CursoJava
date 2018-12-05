public class Arrays3 {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int [] numeros2 = {1,2,3,4,5};//o tamanho é 5 mas o index vai de 0 ate 4
        int [] numeros3 = new int[]{1,2,3,4,5};

        for (int aux : numeros2){//foreach
            System.out.println(aux);
        }

    }
}
