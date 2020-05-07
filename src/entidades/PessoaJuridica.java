package entidades;

public class PessoaJuridica extends Pessoas {

	private Integer nrFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, Integer nrFuncionarios) {
		super(nome, rendaAnual);
		this.nrFuncionarios = nrFuncionarios;
	}

	public Integer getNrFuncionarios() {
		return nrFuncionarios;
	}

	public void setNrFuncionarios(Integer nrFuncionarios) {
		this.nrFuncionarios = nrFuncionarios;
	}

	@Override
	public double imposto() {
		if (nrFuncionarios > 10) {

			return getRendaAnual() * 0.14;
		}

		else {

			return getRendaAnual() * 0.16;
		}
	}

}
