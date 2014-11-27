package negocio;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cpl.41576
 */
public class Pousada {
    private  ArrayList<Quarto> quartos;// = new ArrayList<>();
    private  ArrayList<Chale>  chales;// = new ArrayList<>();
    
    private static Pousada instance = null;
   
    public static Pousada getInstance() {
       if(instance == null) {
          instance = new Pousada();
       }
       return instance;
    }

    /**
     * @return the quartos
     */
    public  ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    /**
     * @return the chales
     */
    public  ArrayList<Chale> getChales() {
        return chales;
    }
   
     
    Pousada(){
        this.quartos = new ArrayList<Quarto>();
        this.chales = new ArrayList<Chale>();   
    }
    
    public int getQuantQuartos(){
        return quartos.size();
    }
    
       public int getQuantChales(){
        return chales.size();
    }
    
    public void addQuarto (Quarto quarto){
        this.getQuartos().add(quarto);
    }
    
    public void addChale(Chale chale){
        this.getChales().add(chale);
    }
    
    public Quarto getQuarto(int i){
      return  getQuartos().get(i);
    }
    
    public Chale getChale(int i){
      return  getChales().get(i);
    }

    @Override
    public String toString() {
        return "Quartos: "+this.getQuartos().toString()+"\n Chales"+this.getChales().toString();
    }
    /**
 *
 * @Busca o quarto pela posição
 */
    public Quarto buscaQuarto(int i){
        return getQuartos().get(i);
    }
    
   
    
      public int buscaQuartoBanheira(Boolean temBanheira){
        for (int i = 0; i <= getQuartos().size(); i++){
            if (getQuartos().get(i).isTemBanheira()) {
                return i;
            }           
        }
        return -1;
      }

     
}
