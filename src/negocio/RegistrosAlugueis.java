package negocio;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinicius.andrade
 */
public class RegistrosAlugueis {
    private ArrayList<Aluguel> alugueis;
    
    private static RegistrosAlugueis instance = null;

    /**
     * @return the alugueis
     */
    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    /**
     * @param aAlugueis the alugueis to set
     */
    public  void setAlugueis(ArrayList<Aluguel> aAlugueis) {
        alugueis = aAlugueis;
    }
    
    private RegistrosAlugueis (){
        alugueis = new ArrayList<Aluguel>();
    }
    
    public static RegistrosAlugueis getInstance() {
       if(instance == null) {
          instance = new RegistrosAlugueis();
       }
       return instance;
    }
    
    public void addAluguel(Aluguel aluguel){
        getAlugueis().add(aluguel);
    }
    
    public int buscaAluguel(String nome)throws Exception{
        for(int i = 0; i <getAlugueis().size(); i++){
            if (getAlugueis().get(i).getCliente().getNome().equals(nome)){
                return i;    
            }
        }
        throw new Exception  ("Registro de Aluguel não encontrado.");
    }

    @Override
    public String toString() {
        if( alugueis.size() == 0 ){
            return "NÃO HÁ QUARTOS ALUGADOS";
        }
        return "Alugueis: " + alugueis.toString() ;
    }
    
    public void removeAluguel(int i){
        this.alugueis.remove(i);
    }
    
    
}
