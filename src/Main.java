import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.getDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.getDescricao("descricao curso javascript");
        curso2.setCargaHoraria(5);

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devTitato = new Dev();
        devTitato.setNome("Titato");
        devTitato.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devTitato.getConteudosInscritos());
        devTitato.progredir();
        System.out.println("Conteudos Inscritos: " + devTitato.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devTitato.getConteudosConcluidos());
        System.out.println("XP: " + devTitato.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}