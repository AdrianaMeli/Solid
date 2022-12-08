package solid_ocp_v1;

public class PersistenciaEmArquivoPdf implements PersistenciaDaFatura {

	public Fatura fatura;

	public PersistenciaEmArquivoPdf(Fatura fatura){

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