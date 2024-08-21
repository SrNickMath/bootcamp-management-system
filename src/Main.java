import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição Curso Java", 8);

        Curso curso2 = new Curso("Curso JS", "Descrição Curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição Mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nicolas:" + devNicolas.getConteudosInscritos());
        devNicolas.progredir();
        devNicolas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nicolas:" + devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nicolas:" + devNicolas.getConteudosConcluidos());
        System.out.println("XP:" + devNicolas.calcularTotalXp());

        System.out.println("-------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Matheus:" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());

    }
}