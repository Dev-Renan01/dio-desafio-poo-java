package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set <Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set <Conteudo> conteudosconcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
            if(conteudo.isPresent()){
                this.conteudosconcluidos.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
            }else{
                System.err.println("Você não está metriculado em nenhum conteúdo!");
            }

    }
    public double calcularXP(){
        return this.conteudosconcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosconcluidos() {
        return conteudosconcluidos;
    }

    public void setConteudosconcluidos(Set<Conteudo> conteudosconcluidos) {
        this.conteudosconcluidos = conteudosconcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudosconcluidos(), dev.getConteudosconcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosconcluidos());
    }
}
