import java.time.LocalDate;

class Main {
  public static void main(String[] args) {

    Curso curso1 = new Curso();
    Curso curso2 = new Curso();

    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Aprenda Java");
    curso1.setCargaHoraria(120);

    curso2.setTitulo("Curso Python");
    curso2.setDescricao("Aprenda Python");
    curso2.setCargaHoraria(150);

    Mentoria mentoria1 = new Mentoria();
    Mentoria mentoria2 = new Mentoria();

    //Conteudo conteudo = new Conteudo(); não dá pra fazer isso pois é uma classe abstrata, poderiamos no caso usar o polimorfismo:
    //Conteudo conteudo = new Curso();

    mentoria1.setTitulo("Mentoria Java");
    mentoria1.setDescricao("Estude Java");
    mentoria1.setData(LocalDate.now());

    mentoria2.setTitulo("Mentoria Python");
    mentoria2.setDescricao("Estude Python");
    mentoria2.setData(LocalDate.now());

    
    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);
    System.out.println(mentoria2);*/

    Bootcamp bootcamp = new Bootcamp();

    bootcamp.setNome("GFT Java developer");
    bootcamp.setDescricao("Estudar java");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);
    bootcamp.getConteudos().add(mentoria2);

    Dev devItalo = new Dev();
    devItalo.setNome("Italo");
    devItalo.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos = " + devItalo.getConteudosInscritos());
    
    System.out.println("\n");
    
    devItalo.progredir();
    devItalo.progredir();
    System.out.println("Conteudos inscritos = " + devItalo.getConteudosInscritos());
    System.out.println("Conteudos concluidos = " + devItalo.getConteudosConcluidos());
    System.out.println("Xp = " + devItalo.calcularTotalXp());

    System.out.println("\n--------\n");

    Dev devBruno = new Dev();
    devBruno.setNome("Bruno");
    devBruno.inscreverBootcamp(bootcamp);
    System.out.println(devBruno.getConteudosInscritos());

    System.out.println("\n");

    devBruno.progredir();
    
    System.out.println("Conteudos inscritos = " + devBruno.getConteudosInscritos());

    System.out.println("\n");
    
    System.out.println("Conteudos concluidos = " + devBruno.getConteudosConcluidos());
    System.out.println("Xp = " + devBruno.calcularTotalXp());
  }
}