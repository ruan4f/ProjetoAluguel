package negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinicius.andrade
 */
public class Inicializador {
    private double PrecoPadraoQuarto = 35.00 ;
    public void InicializaQuartos(Pousada pousada){
        for (int i = 0; i < 50; i++) {
            int random = (int)Math.floor(Math.random() * 3);
            Quarto quarto = new Quarto();

            quarto.setPreco(PrecoPadraoQuarto);
            quarto.setNumeroQuarto(i+1);
            if (i>25 ){
                quarto.setTemBanheira(true);
            }
            pousada.addQuarto(quarto);
        }
    }
    
    public void InicializaChales(Pousada pousada){
     
        for (int i = 0; i < 10; i++) {
            int random = (int)Math.floor(Math.random() * 3);
            Chale chale = new Chale();
            chale.setNumeroQuarto(i+1);
            chale.setPreco(PrecoPadraoQuarto);
            pousada.addChale(chale);
        }
        
    }

    /**
     * @return the PrecoPadraoQuarto
     */
    public double getPrecoPadraoQuarto() {
        return PrecoPadraoQuarto;
    }

    /**
     * @param PrecoPadraoQuarto the PrecoPadraoQuarto to set
     */
    public void setPrecoPadraoQuarto(double PrecoPadraoQuarto) {
        this.PrecoPadraoQuarto = PrecoPadraoQuarto;
    }
}
