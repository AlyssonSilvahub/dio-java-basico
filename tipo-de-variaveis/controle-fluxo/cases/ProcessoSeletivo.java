import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {    
        String [] candidatos = {"Felipe","Alex","João", "Alysson", "Rafael"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
            
        }  
    }            //alterações//
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) 
                tentativasRealizadas++;
                else
                System.out.println("Contato realizado com sucesso");
            

        }while(continuarTentando && tentativasRealizadas <3);

         if(atendeu)
         System.out.println("Conseguimos contato com " + candidato + " na "+ tentativasRealizadas +" tentativas");
         else
         System.out.println("Não conseguimos contato com" + candidato +", Numero maximo tentativas"+ tentativasRealizadas + " Realizadas");

    }


     static boolean atender (){
      return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe","Alex","João", "Alysson", "Rafael"};

        System.out.println("Imprimindo a lista de candidatos informando o indice de elementos");

        for (int indice=0; indice < candidatos.length; indice++){

            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe","Alex","João", "Alysson", "Rafael","Erick","Roberto"};
           
         int candidaosSelecionados = 0;
         int candidastoAtual=0;
         double salarioBase=2000.0;
            while(candidaosSelecionados < 5 && candidastoAtual < candidatos.length) {
                String candidato = candidatos[candidastoAtual];
                double salarioPretendido = valorPretendido();
                System.out.println("O candidato" + candidato + "Solicitou este valor de salario" + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("Candidato " + candidato + " foi selecionado");
                    candidaosSelecionados++;
                };
                candidastoAtual++;
            };           
    };
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    };
    

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido) 
            System.out.println("Liga para o candidatos com contra proposta"); 
        else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }; 
}
