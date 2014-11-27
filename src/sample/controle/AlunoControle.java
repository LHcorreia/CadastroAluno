package sample.controle;

import sample.dao.AlunoDao;
import sample.dto.Aluno;

public class AlunoControle {
    private AlunoDao alunoDao = new AlunoDao();

    public void addNovaAluno(Integer ra, String nome, String sexo, String idade, String sala, String curso, String turno) {
        Aluno aluno = new Aluno();
        
        aluno.setRa(ra);
        aluno.setNome(nome);
        aluno.setSexo(sexo);
        aluno.setIdade(idade);
        aluno.setSala(sala);
        aluno.setCurso(curso);
        aluno.setTurno(turno);
       
        
        

        


        alunoDao.salvar(aluno);

    }

    public Aluno pesquisaPorCodigo(String chave) throws Exception {
        String nova = chave.trim();

        if (nova == null || nova.equals("")) {
            throw new Exception("Campo de pesquisa nulo, inválido");
        } else {
            return alunoDao.pesquisarPorRA(chave);
        }

    }

    public void excluirAluno(Aluno aluno) {
        alunoDao.removerAluno(aluno);
    }

    public void alterarAluno(Aluno aluno) {
        alunoDao.alterarAluno(aluno);
    }
    
}
