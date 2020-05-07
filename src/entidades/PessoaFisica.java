package entidades;

public class PessoaFisica extends Pessoas {

	private Double gastosSaude;

	public PessoaFisica(String nome, double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {

		if (getRendaAnual() <= 20000) {

			return getRendaAnual() * 0.15 - getGastosSaude() * 0.50;

		}

		else {

			return getRendaAnual() * 0.25 - getGastosSaude() * 0.50;
		}

	}

}
