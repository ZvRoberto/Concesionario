package service;

public class Carro {
    private Llanta[] llantas;

    public Carro() {
        llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(10);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Carro con llantas:\n");
        for (int i = 0; i < llantas.length; i++) {
            sb.append("  ").append(i + 1).append(". ").append(llantas[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
