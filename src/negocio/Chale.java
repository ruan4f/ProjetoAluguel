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
public class Chale extends Quarto {
    private int camasExtras = 0;

    public int getCamasExtras() {
        return camasExtras;
    }

    public void setCamasExtras(int camasExtras) {
        this.camasExtras = camasExtras;
    } 
    
    @Override
    public Double getPreco() {
        Double precoQuarto = super.getPreco();
        Double precoChale = precoQuarto+(precoQuarto * 0.2);// + 20%
        precoChale = precoChale + ( precoChale * (0.1 * camasExtras) ); // + 10% Cama Extra
        return  precoChale; 
                
        //return super.getPreco(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        //return super.toString();
        return "\nChalé: " + this.getNumeroQuarto() 
                + "\n   Preço: R$" + this.getPreco()
                +" \n   Quantidade Camas: "+this.camasExtras;
        
    }
    
    
}
