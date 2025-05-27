package br.com.dio.desafio.dominio;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
       curso1.setTitulo("BootCamp");
        curso1.setDescricao("Curso 01!");
        curso1.setCargaHoraria(20);


        Curso cursoDelta = new Curso();
        cursoDelta.setTitulo("Curso Delta");
        cursoDelta.setDescricao("curso 02!");
        cursoDelta.setCargaHoraria(30);


        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Mentoria Delta-13");
        mentoria01.setDescricao("Mentoria 01");
        mentoria01.setData(LocalDate.now());


        Conteudo conteudo1 = new Curso();
        conteudo1.setTitulo("Conteúdo de aprendizagem");
        conteudo1.setDescricao("Conceitos de Polimorfismo!");


//        System.out.println(curso1);
//        System.out.println(cursoDelta);
//        System.out.println(mentoria01);
//        System.out.println(conteudo);

     Bootcamp bootcampJava = new Bootcamp();
     bootcampJava.setNome("Bootcamp Java Developer");
     bootcampJava.setDescricao("Descrição Bootcamp Java Developer!");
     bootcampJava.getConteudos().add(cursoDelta);
     bootcampJava.getConteudos().add(curso1);
     bootcampJava.getConteudos().add(mentoria01);


     Bootcamp bootcampSpringBoot = new Bootcamp();
     bootcampSpringBoot.setNome("Bootcamp SpringBoot");
     bootcampSpringBoot.setDescricao("Descrição Bootcamp SpringBoot!");
     bootcampSpringBoot.getConteudos().add(mentoria01);
     bootcampSpringBoot.getConteudos().add(curso1);
     bootcampSpringBoot.getConteudos().add(cursoDelta);


     Dev devThiago = new Dev();
     devThiago.setNome("Thiago");
     devThiago.inscreverBootcamp(bootcampSpringBoot);
     System.out.println("Conteúdos inscritos 'Thiago': " + devThiago.getConteudosInscritos());
     devThiago.progredir();
     devThiago.progredir();
     System.out.println("-");
     System.out.println("Conteúdos concluidos 'Thiago': " + devThiago.getConteudosconcluidos());
     System.out.println("Conteúdos inscritos 'Thiago': " + devThiago.getConteudosInscritos());
     System.out.println("XP: " + devThiago.calcularXP());


     System.out.println("===========");

     Dev devRenan = new Dev();
     devRenan.setNome("Renan");
     devRenan.inscreverBootcamp(bootcampJava);
     System.out.println("Conteúdos inscritos 'Renan': " + devRenan.getConteudosInscritos());
     devRenan.progredir();
     devRenan.progredir();
     devRenan.progredir();
     System.out.println("-");
     System.out.println("Conteúdos concluidos 'Renan': " + devRenan.getConteudosconcluidos());
     System.out.println("Conteúdos inscritos 'Renan': " + devRenan.getConteudosInscritos());
     System.out.println("XP: " + devRenan.calcularXP());

















    }
}