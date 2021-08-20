package testes;

import avaliacaoFinal.*;

public class TesteAf {

	public static void main(String[] args) {
		
		ContaBancaria banco = new ContaBancaria();
		banco.setAgencia("Agencia");
		banco.setBanco("Itaú");
		banco.setLimiteDisponivel(1000);
		banco.setNumeroConta("123563");
		banco.setSaldoAtual(156);
		banco.setTipoConta("Corrente");
		
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("793435252");
		livro.setnPaginas(40);
		livro.setTitulo("A volta dos que não foram");
		livro.setValorCompra(59);
		
		Veiculo veiculo = new Veiculo();
		veiculo.setCapacidadeTanque(100);
		veiculo.setConsumoMedio(20);
		veiculo.setCor("Preto");
		veiculo.setnPassageiros(4);
		veiculo.setPlaca("KJK-405");
		veiculo.setVelocidadeAtual(40);
		veiculo.setVelocidadeMaxima(150);
		
		System.out.println(banco.getAgencia());
		System.out.println(banco.getBanco());
		System.out.println(banco.getLimiteDisponivel());
		System.out.println(banco.getNumeroConta());
		System.out.println(banco.getSaldoAtual());
		System.out.println(banco.getTipoConta());
		System.out.println();
		
		System.out.println(livro.getAutor());
		System.out.println(livro.getIsbn());
		System.out.println(livro.getnPaginas());
		System.out.println(livro.getTitulo());
		System.out.println(livro.getValorCompra());
		System.out.println();
		
		System.out.println(veiculo.getCapacidadeTanque());
		System.out.println(veiculo.getConsumoMedio());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getnPassageiros());
		System.out.println(veiculo.getPlaca());
		System.out.println(veiculo.getVelocidadeAtual());
		System.out.println(veiculo.getVelocidadeMaxima());
		
	}

}
