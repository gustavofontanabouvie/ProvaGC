public class Tarefa implements Comparable<Tarefa>{

    String titulo;
    public Tarefa(String titulo){
        this.titulo = titulo;
    }

    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }
}
