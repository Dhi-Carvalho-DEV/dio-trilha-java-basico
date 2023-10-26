public class Operadores {
  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM" + "JAVA";

    System.out.println(nomeCompleto);

    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1);
    System.out.println(concatenacao);

    int numero = 5;
    System.out.println(-numero);

    numero = +numero;
    System.out.println(numero);

    numero = numero * -1;
    System.out.println(-numero);

    // x repetições
    numero = 5;
    System.out.println(++numero);
    System.out.println(numero--);
    System.out.println(numero);

    boolean variavel = true;
    System.out.println(!variavel);
    System.out.println(variavel);

    variavel = !variavel;
    System.out.println(variavel);

    /*
     * Operador Ternário
     * <Expressão condicional> ? <caso condição seja true> : <caso condição seja
     * false>
     */

    int a, b;
    a = 5;
    b = 6;

    // Exemplo condicional if/else
    String resultado = "";
    if (a == b)
      resultado = "verdadeiro";
    else
      resultado = "falso";
    System.out.println(resultado);

    // Exemplo operador ternário
    resultado = a == b ? "verdadeiro" : "falso";
    System.out.println(resultado);

    // Operadores relacionais
    int numero1, numero2;
    numero1 = 1;
    numero2 = 2;

    boolean simNao = numero1 == numero2;
    System.out.println("Numero 1 é ígual a numero 2? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("Numero 1 é diferente do numero 2? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("Numero 1 é maior que numero 2? " + simNao);

    simNao = numero1 < numero2;
    System.out.println("Numero 1 é menor que numero 2? " + simNao);

    simNao = numero1 >= numero2;
    System.out.println("Numero 1 é maior igual que numero 2? " + simNao);

    simNao = numero1 <= numero2;
    System.out.println("Numero 1 é menor igual que numero 2? " + simNao);

    String nomeUm = "DIOGO";
    String nomeDois = "DIOGO";

    System.out.println(nomeUm == nomeDois);
    System.out.println(nomeUm.equals(nomeDois));

    // Operadores Lógicos
    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) {
      System.out.println("As duas condições são verdadeiras");
    }

    System.out.println("fim");

    if (condicao1 || condicao2) {
      System.out.println("Uma das condições é verdadeira");
    }

    if (condicao1 && (7 > 4)) {
      System.out.println("As duas condições são verdadeiras");
    }
  }
}
