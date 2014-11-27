package sample.dao;

import java.util.List;
import java.util.function.Consumer;
import sample.basededados.BDMemoria;
import sample.dto.Aluno;

public class AlunoDao {
    private BDMemoria banco = BDMemoria.getInstance();

    public void salvar(Aluno aluno) {

        banco.listaAluno.add(aluno);

        System.out.println("Salvando Aluno: " + aluno);
    }

    public Aluno pesquisarPorRA(String chave) {

        List<Aluno> alunos = banco.listaAluno;

        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(chave)) {
                return aluno;
            }
        }

        return null;
    }

    public void removerAluno(Aluno aluno) {
        banco.listaAluno.remove(aluno);
    } 

    public void alterarAluno(Aluno alunoSelecionado) {

        banco.listaAluno.stream().forEach(new Consumer<Aluno>() {
            @Override
            public void accept(Aluno aluno) {
                if (aluno.getRa().equals(alunoSelecionado.getRa())) {
                    aluno.setRa(alunoSelecionado.getRa());
                    aluno.setNome(alunoSelecionado.getNome());
                    aluno.setSexo(alunoSelecionado.getSexo());
                    aluno.setIdade(alunoSelecionado.getIdade());
                    aluno.setSala(alunoSelecionado.getSala());
                    aluno.setCurso(alunoSelecionado.getCurso());
                    aluno.setTurno(alunoSelecionado.getTurno());
                    
                }
            }
        });

      } 
    
}
