public class Lista {
    private static final Object no = null;
    private No primeiro;

    // contrutor

    public Lista() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    // Está vazia:
    public boolean estaVazia() {

        // return primeiro == null;

        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    // Insere primeiro
    public void inserePrimeiro(int valor) {
        No no1 = new No(valor);
        no1.setProximo(primeiro);
        primeiro = no1;
    }

    public String buscar(int valor) {
        int index = 0;
        No cursor = primeiro;
        while (cursor != null) {
            if (cursor.getInfo() == valor) {
                return "Valor encontrado no nó " + index;
            }
            index++;
            cursor = cursor.getProximo();
        }
        return "Não encontrou. Ele executou " + index + " passos";
    }

    // Mostra Lista
    public void mostrar() {
        if (estaVazia()) {
            System.out.println("Lista está vazia");
        } else {

            No cursor = primeiro;
            while (cursor != null) {
                System.out.println(cursor.getInfo());
                cursor = cursor.getProximo();
            }
        }
    }

    // Insere ultimo
    public void insereUltimo(int valor) {
        if (estaVazia()) {
            inserePrimeiro(valor);
        } else {
            No cursor = primeiro;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
            }
            No no1 = new No(valor);
            cursor.setProximo(no1);

        }
    }

    // insere depois
    public void insereEntreNos(No no, int valor) {
        No no1 = new No(valor);
        no1.setProximo(no.getProximo());
        no.setProximo(no1);
    }

    // metodos de remoção
    public No removePrimeiro() {

        if (estaVazia()) {
            System.out.println("Esta vazia, Não tem oq tirar");
            return null;
        } else {
            No cursor = primeiro;
            primeiro = primeiro.getProximo();
            return cursor;
        }
    }

}