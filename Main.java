public class Main{

    public static void main(String[] args){


        Lista lista = new Lista();
        System.out.println(lista.estaVazia());
        lista.inserePrimeiro(20);
        lista.inserePrimeiro(10);
        lista.insereUltimo(30);
        lista.inserePrimeiro(10);

        lista.mostrar();
        System.out.println("Escolhido foi O: " + lista.getPrimeiro().getProximo().getInfo());
        System.out.println("Busquei: " + lista.buscar(20));
        lista.removePrimeiro();
        lista.mostrar();
    }
}