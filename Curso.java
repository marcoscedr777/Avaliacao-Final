package avaliacaoFinal2;

public class Curso {
	
		private String nome;
		private int cargaHoraria;
		private Professor coordenador;
		private Professor professor;
		private String codigoCurso;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCargaHoraria() {
			return cargaHoraria;
		}
		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}
		public Professor getCoordenador() {
			return coordenador;
		}
		public void setCoordenador(Professor coordenador) {
			this.coordenador = coordenador;
		}
		public String getCodigoCurso() {
			return codigoCurso;
		}
		public void setCodigoCurso(String codigoCurso) {
			this.codigoCurso = codigoCurso;
		}
		public Professor getProfessor() {
			return professor;
		}
		public void setProfessor(Professor professor) {
			this.professor = professor;
		}
		
		
}
