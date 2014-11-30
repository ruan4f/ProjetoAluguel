/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author Ramon
 */
public class RegistroSaidas {
    private ArrayList<Aluguel> alugueis;
    
    private static RegistroSaidas instance = null;

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
    
    private RegistroSaidas (){
        alugueis = new ArrayList<Aluguel>();
    }
    
    public static RegistroSaidas getInstance() {
       if(instance == null) {
          instance = new RegistroSaidas();
       }
       return instance;
    }
    
    public void addSaidaAluguel(Aluguel aluguel){
        getAlugueis().add(aluguel);
    }
    
    public int buscaSaidaAluguel(String nome)throws Exception{
        for(int i = 0; i < getAlugueis().size(); i++){
            if (getAlugueis().get(i).getCliente().getNome().equals(nome)){
                return i;    
            }
        }
        throw new Exception  ("Registro de Aluguel não encontrado.");
    }

    @Override
    public String toString() {
        if( alugueis.size() == 0 ){
            return "NÃO HÁ REGISTRO DE SAÍDAS";
        }
        return "Saídas: " + alugueis.toString();
    }
    
    public void removeSaidaAluguel(int i){
        this.alugueis.remove(i);
    }
    
    
}
