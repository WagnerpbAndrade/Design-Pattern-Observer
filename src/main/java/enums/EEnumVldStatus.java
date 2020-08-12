package enums;

public enum EEnumVldStatus {
    SOLICITANDO(1),
    PROCESSSANDO(2),
    ENCAMINHADO(3),
    FINALIZADO(4);

    private int valor;
    EEnumVldStatus(int val) {
        valor = val;
    }

    public int getValor() {
        return valor;
    }

    public static String getName(int valor) {

        var name = "";
        switch (valor) {
            case 1: { name = "SOLICITANDO"; break; }
            case 2: { name = "PROCESSSANDO"; break; }
            case 3: { name = "ENCAMINHADO"; break; }
            case 4: { name = "FINALIZADO"; break; }
        };

        return name;
    }
}
