public class Fatorial {
    private long n;

    Fatorial(long n) {
        this.n = n;
    }

    Fatorial() {
        n = 0;
    }

    public void setN(long n) {
        this.n = n;
    }

    public long fatorialIterativo(long n) {
        long fatorial = 1;
        for (long i = n; i > 0; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public long fatorialRecursivo(long n) {
        if (n == 0)
            return 1;
        else
            return n * fatorialRecursivo(n - 1);
    }
}
