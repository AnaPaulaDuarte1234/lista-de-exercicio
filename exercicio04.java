
public class exercicio_aula {
    public static void main(String[] args) {
        long par = 1;
        int somaimpar = 0;
        int n1;

        for (n1 = 1; n1 <= 30; n1++) {
            if (n1 % 2 == 1) {
                somaimpar += n1;
            } else {
                if (n1 > 0)
                    par *= n1;

            }
        }
        System.out.println("soma dos impares: " + somaimpar);
        System.out.println("soma dos pares: " + par);
    }
}
