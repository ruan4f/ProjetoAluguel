package negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cpl.41576
 */
public class Quarto {
    private int numeroQuarto;
    private Double metrosQuadrados;
    private Double preco;
    private boolean reservado;
    private boolean temBanheira;
    /**
     * @return the metrosQuadrados
     */
    public Double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    /**
     * @param metrosQuadrados the metrosQuadrados to set
     */
    public void setMetrosQuadrados(Double metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return isTemBanheira() ? (this.preco * 0.18 )+ this.preco : this.preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @return the reservado
     */
    public boolean isReservado() {
        return reservado;
    }

    /**
     * @param reservado the reservado to set
     */
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "\nQuarto: " + this.getNumeroQuarto()  + "   Preço: R$" + this.getPreco() 
                +" Possui Banheira: "+ (isTemBanheira() ? "Sim ":"Não " ) + " Disponivel :" + (isReservado() ? " Não":" Sim"  ) ;
        
    }

    /**
     * @return the numeroQuarto
     */
    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    /**
     * @param numeroQuarto the numeroQuarto to set
     */
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    void setTemBanheira(boolean b) {
      this.temBanheira = b;
    }

    /**
     * @return the temBanheira
     */
    public boolean isTemBanheira() {
        return temBanheira;
    }
    
    
}
