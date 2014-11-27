package sample.basededados;

import java.util.ArrayList;
import java.util.List;
import sample.dto.Aluno;

  public class BDMemoria {
   // tabela pessoas
    public List<Aluno> listaAluno = new ArrayList<Aluno>();

    private static BDMemoria bdMemoria;

    //construtor privado não roda o comando new
    private BDMemoria() {
        

    }

    //padrão singleton
    public static BDMemoria getInstance() {

        if (bdMemoria == null) {
            bdMemoria = new BDMemoria();
        }

        return bdMemoria;
    }

} 

