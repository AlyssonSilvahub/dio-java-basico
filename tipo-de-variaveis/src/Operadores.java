public class Operadores {
    public static void main(String[] args) {
    //String nomeCompleto = "Linguagem" + "JAVA";
    //System.out.println(nomeCompleto);
    //int numero = 5;
    //System.out.println(- numero);
    // boolean variavel = true;
    // variavel = !variavel;
    // System.out.println(variavel);
    String nomeUm = "Alysson";
    String nomeDois = new String("Silva");

System.out.println(nomeUm.equals(nomeDois));

    int numero1 = 1;
     int numero2 = 2;
     boolean simNao = numero1 == numero2;

if (numero1 < numero2) {
    System.out.println("a nossa condição é verdadeira");
    
}

     System.out.println("numeroUm é  igual a numeroDois?" + simNao);


     simNao = numero1 != numero2;
     System.out.println("numeroUm é diferente a numeroDois?" + simNao);

     simNao = numero1 > numero2;
     System.out.println("numeroUm é maior que numeroDois?" + simNao);
 }
}