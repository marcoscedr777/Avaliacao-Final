package testes;

import avaliacaoFinal2.*;

public class TesteAf2 {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setNome("João");
		professor.setCargaHoraria(40);
		professor.setCodigo("40028922");
		professor.setContaBanco("123456-7890");
		professor.setTelefone("99743-8765");
		professor.setEndereco("Cedro-CE");
	
		Curso Port = new Curso();
		Port.setNome("Português");
		Port.setCargaHoraria(40);
		Port.setCodigoCurso("2456575882");
		Port.setCoordenador(professor);
		Port.setProfessor(professor);
		
		Aluno aluno01 = new Aluno();
		aluno01.setNome("Marcos");
		aluno01.setMatricula("20191031020029");
		aluno01.setNota1(8);
		aluno01.setNota2(8);
		aluno01.setFrequencia(40);
		aluno01.setCursoAluno(Port);
	
		Biblioteca bib = new Biblioteca();
		bib.setCapacidadeLivros(2);
		bib.setLivros(2);
		bib.setLocalizacao("Ruasemsaida.com");
		bib.setNome("Books");
		
		System.out.println(aluno01.getNome());
		System.out.println(aluno01.getCursoAluno());
		System.out.println(aluno01.getMatricula());
		System.out.println(aluno01.getFrequencia());
		System.out.println(aluno01.getNota1());
		System.out.println(aluno01.getNota2());
		System.out.println();
		
		System.out.println(Port.getNome());
		System.out.println(Port.getCargaHoraria());
		System.out.println(Port.getCodigoCurso());
		System.out.println(Port.getCoordenador());
		System.out.println(Port.getProfessor());
		System.out.println();
		
		System.out.println(professor.getNome());
		System.out.println(professor.getCargaHoraria());
		System.out.println(professor.getCodigo());
		System.out.println(professor.getEndereco());
		System.out.println(professor.getTelefone());
		System.out.println(professor.getContaBanco());
		System.out.println();
		
		System.out.println(bib.getCapacidadeLivros());
		System.out.println(bib.getLivros());
		System.out.println(bib.getLocalizacao());
		System.out.println(bib.getNome());
		
		
	}

}