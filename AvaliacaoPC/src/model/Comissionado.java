package model;

public class Comissionado extends Empregado{
		private Integer idcomissao;
		private String totalvenda;
		private String taxacomissao;
		public Integer getIdcomissao() {
			return idcomissao;
		}
		public void setIdcomissao(Integer idcomissao) {
			this.idcomissao = idcomissao;
		}
		public String getTotalvenda() {
			return totalvenda;
		}
		public void setTotalvenda(String totalvenda) {
			this.totalvenda = totalvenda;
		}
		public String getTaxacomissao() {
			return taxacomissao;
		}
		public void setTaxacomissao(String taxacomissao) {
			this.taxacomissao = taxacomissao;
		}
		
		
		
}
