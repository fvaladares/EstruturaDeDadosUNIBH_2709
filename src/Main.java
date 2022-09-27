public class Main {
    public static int fatorialInterativo(int n) {
        int fatorial = 1;
        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(fatorialInterativo(6));
        Fatorial f = new Fatorial();
        f.setN(6);

        System.out.println("Resultado iterativo: " + f.fatorialIterativo(12));
        System.out.println("Resultado recursivo: " + f.fatorialRecursivo(12));
    }
}