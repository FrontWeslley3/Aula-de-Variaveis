public class Arrays {  // Declara a classe principal do programa, chamada "Arrays".

    public static void main(String[] args) {
        int[] valores = new int[50];  // Cria um array de inteiros chamado "valores" com 50 elementos.

        // Inicia um laço for para percorrer cada índice do array "valores".
        for (int i = 0; i < valores.length; i++) {
            valores[i] = i + 50;  // Atribui ao elemento "i" do array "valores" o valor "i + 50".
        }

        // Outro laço for para percorrer e imprimir os valores armazenados no array "valores".
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);  // Imprime o valor do índice "i" no console.
        }
    }
}
