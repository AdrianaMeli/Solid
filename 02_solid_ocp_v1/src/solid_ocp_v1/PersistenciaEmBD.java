package solid_ocp_v1;

public class PersistenciaEmBD implements PersistenciaDaFatura {

	public Fatura fatura;

	public PersistenciaEmBD(Fatura fatura){
		this.fatura = fatura;
	}

		public Fatura getFatura(){
			return fatura
		}
		public void setFatura(Fatura fatura){
			this.fatura = fattura;

		}
		@Override
				public void salvar(Fatura fatura){

			System.out.println("Salvar a fatura no Arquivo PDF...\n");
			this.fatura.imprimirFatura();
	}

}