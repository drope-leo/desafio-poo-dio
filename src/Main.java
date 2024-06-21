import java.time.LocalDate;

public class Main {

public static void main (String[] args) {

Curso curso1 = new Curso();
curso1.setTitulo("curso java");
curso1.setDescricao("Descrição curso java");
curso1.setCargaHoraria("8");

Curso curso2 = new Curso();
curso2.setTitulo("curso js");
curso2.setDescricao("Descrição curso js");
curso2.setCargaHoraria("4");


Mentoria mentoria = new Mentoria ();
mentoria.setTitulo("mentoria de java");
mentoria.setDescricao("descrição java");
mentoria.setData(LocalDate.now());

/*System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria);*/



Bootcamp bootcamp =  new Bootcamp();
bootcamp.setNome("Bootcamp java Developer");
bootcamp.setDescricao("Descrição Bootcam java Develper");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);


Dev devPedro = new Dev();
devPedro.setNome("Pedro");
devPedro.inscreverBootcamp(bootcamp);
System.out.print("Conteúdos Incritos" + devPedro.getConteudosInscritos());
devPedro.progredir();
devPedro.progredir();
System.out.println("_");
System.out.print("Conteúdos Incritos" + devPedro.getConteudosConcluidos());
System.out.print("Conteúdos Concluidos" + devPedro.getConteudosConcluidos());
System.out.println("XP:" + devPedro.calcularTotalXp());


System.out.println("__________");


Dev devDaniel = new Dev();
devDaniel.setNome("Daniel");
devDaniel.inscreverBootcamp(bootcamp);
System.out.print("Conteúdos Incritos" + devDaniel.getConteudosInscritos());
devDaniel.progredir();
devDaniel.progredir();
devDaniel.progredir();
System.out.println("_");
System.out.print("Conteúdos Inscritos" + devDaniel.getConteudosConcluidos());
System.out.print("Conteúdos Concluidos" + devDaniel.getConteudosConcluidos());
System.out.println("XP:" + devDaniel.calcularTotalXp());



}


}



