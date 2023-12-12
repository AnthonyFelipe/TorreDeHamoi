public class TorreDeHanoi {
    public static void main(String[] args) {
        int numDiscos = Integer.parseInt(args[0]);
        int movimentos = resolverTorreDeHanoi(numDiscos);
        System.out.println("Quantidade de movimentos necessários: " + movimentos);
    }

    public static int resolverTorreDeHanoi(int numDiscos) {
        return moverDiscos(numDiscos, 'A', 'C', 'B');
    }

    public static int moverDiscos(int numDiscos, char origem, char destino, char auxiliar) {
        if (numDiscos == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return 1;
        } else {
            int movimentos = 0;
            movimentos += moverDiscos(numDiscos - 1, origem, auxiliar, destino);
            System.out.println("Mover disco " + numDiscos + " de " + origem + " para " + destino);
            movimentos++;
            movimentos += moverDiscos(numDiscos - 1, auxiliar, destino, origem);
            return movimentos;
        }
    }
}
