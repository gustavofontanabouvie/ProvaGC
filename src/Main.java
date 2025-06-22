import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Exercicio 1
//        LocalDate base = LocalDate.of(2025,6,1);
//        int dias = 7;
//        LocalDate novaData = base.plusDays(dias * 2 -3 );
//        System.out.println(novaData.getDayOfMonth());


        //Exercicio 2
//        int nota = 7;
//        int peso = 2;
//        double media = (nota * peso + 6 * 3 )/5;
//
//        if(media >= 7.0){
//            System.out.println("Aprovado");
//        }
//        else
//        {
//            System.out.println("Revisar conteudo");
//        }

       // Exercicio 3

//     Item x = new Item("Caderno");
//     Item y = new Item("Caneta",3);
//        System.out.println(x.quantidade * y.quantidade);
//

        //Exercicio 4

//      int prioridade = 4;
//      int urgencia = 8;
//
//      if(prioridade > 3 && urgencia > 7){
//          System.out.println("Tarefa critica");
//      } else if (prioridade > 3 || urgencia > 7 ) {
//          System.out.println("Tarefa Importante");
//      }else{
//          System.out.println("Tarefa comum");
//      }

        //Exercicio 5

//        int notificacoes = 0;
//
//        for (int i = 1; i <= 5 ; i++) {
//            if(i % 2 ==0){
//                notificacoes += 2;
//            }else{
//                notificacoes ++;
//            }
//        }
//        System.out.println(notificacoes);

        //Exercicio 6
//        ArrayList<String> horarios = new ArrayList<>();
//        horarios.add("08:00");
//        horarios.add("10:00");
//        horarios.add("12:00");
//        horarios.remove(1);
//        horarios.add("14:00");
//
//        System.out.println(horarios.get(1));

        //Exercicio 7

//      Livro livro1 = new Livro();
//        livro1.titulo = "Java para iniciantes";
//        System.out.println(livro1.status());
//        livro1.emprestar();
//        System.out.println(livro1.status());

        //Exercicio 8

        //Usuario u = new Usuario("Joao",25);


        //Exercicio 10
//        LocalDate hoje = LocalDate.of(2025,6,9);
//        LocalDate dataAtualizada = hoje.plusDays(10);
//        System.out.println(dataAtualizada);

        //Exercicio 11
//        LocalDate data = LocalDate.of(2025,6,10);
//        int diasUteis = 0;
//
//        while (diasUteis < 7){
//            data.plusDays(1);
//            boolean fimDeSemana = data.getDayOfWeek() ==
//                    DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
//            boolean feriado = data.equals(LocalDate.of(2025,6,15));
//
//            if(!fimDeSemana && !feriado){
//                diasUteis++;
//            }
//        }
//        System.out.println(data);

        //Exercicio 12

//        LocalTime envio = LocalTime.of(23,0);
//        LocalTime limite = LocalTime.of(22,59);
//
//        if(!envio.isBefore(limite)){
//            System.out.println("Entrega fora do horario");
//        }else{
//            System.out.println("Tarefa enviada com sucesso");
//        }

        //Exercicio 13

//        List<Tarefa> tarefas = new ArrayList<>();
//        tarefas.add(new Tarefa("Estudar"));
//        tarefas.add(new Tarefa("Almoçar"));
//        tarefas.add(new Tarefa("Dormir"));
//        Collections.sort(tarefas);
//        //como o codigo estava na prova a saída é ordem indefinida, a ordenação funcionou só a exibição estava errada
//        //para definir se a ordenação foi correta devemos iterar sobre a lista
//
//        for (int i = 0; i < tarefas.size() ; i++) {
//            System.out.println(tarefas.get(i).titulo);
//        }

        //Exercicio 14

//        ArrayList<String> tarefas = new ArrayList<>();
//        tarefas.add(("Estudar Java"));
//        tarefas.add(("Fazer exercícios"));
//        tarefas.add(("Revisao Codigo"));
//
//        for(String tarefa : tarefas){
//            if(tarefa.contains("Java")){
//                System.out.println("Tarefa de programação: "+ tarefa);
//            }
//        }
    }
}