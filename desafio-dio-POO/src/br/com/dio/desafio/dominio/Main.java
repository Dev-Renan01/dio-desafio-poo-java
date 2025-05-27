package br.com.dio.desafio.dominio;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
       curso1.setTitulo("BootCamp");
        curso1.setDescricao("Curso 01");
        curso1.setCargaHoraria(20);



        Curso cursoDelta = new Curso();
        cursoDelta.setTitulo("Curso Delta");
        cursoDelta.setDescricao("curso 02");
        cursoDelta.setCargaHoraria(30);


        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Mentoria Delta-13");
        mentoria01.setDescricao("Mentoria 01");
        mentoria01.setData(LocalDate.now());



        Conteudo conteudo = new Curso();
        conteudo.setTitulo("Conteúdo de aprendizagem");
        conteudo.setDescricao("Conceitos de Polimorfismo");


        System.out.println(curso1);

        System.out.println(cursoDelta);

        System.out.println(mentoria01);

        System.out.println(conteudo);


    }
}