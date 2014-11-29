package negocio;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cpl.41576
 */
public class Aluguel {
    private Cliente cliente;
    public Quarto quarto;
    public Chale chale;
    private Date dataEntrada ;
    private Date dataSaida;
    
    public String gerarReciboAluguel(){
        return "===============================\n Locatário: "+ getCliente().getNome() 
               +"\n Data e Horário de entrada: "+ getDataEntrada().toGMTString() 
               +"\n Data e Horário de Saída: " + getDataSaida().toGMTString() 
               +"\n Número de diárias: "+ this.calculaNumeroDiarias()
               +"\n Total devido: R$" + this.calculaTotalDevido()
               +"\n==============================";
    }
    
    public long calculaNumeroDiarias(){
        // pega a diferença em milesegundos
            long milesegundosDiff= getDataSaida().getTime() - getDataEntrada().getTime();
            //converte para dias
            long daysDiff = Math.round(milesegundosDiff / ((double)(24 * 3600 * 1000) ));
        return daysDiff < 1? 1 : daysDiff ;
    }

    public Double calculaTotalDevido() {
        if (this.quarto != null) {
            return (double) calculaNumeroDiarias() * this.getQuarto().getPreco();
        } else{
            return (double) calculaNumeroDiarias() * this.getChale().getPreco();
        }       
    }
    
    public void reservaQuarto(){
        this.getQuarto().setReservado(true);
    }
    
     public void reservaChale(){
         this.getChale().setReservado(true);
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the quarto
     */
    public Quarto getQuarto() {
        return quarto;
    }

    /**
     * @param quarto the quarto to set
     */
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    /**
     * @return the dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @return the chale
     */
    public Chale getChale() {
        return chale;
    }

    /**
     * @param chale the chale to set
     */
    public void setChale(Chale chale) {
        this.chale = chale;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        //VERIFICA SE É QUARTO OU CHALE
        if( null != this.quarto ){
            return "\n"+ "Cliente : " + cliente.getNome() 
                    +  quarto.toString() 
                    + "\nEntrada :" + sdf.format(dataEntrada).toString()
                    //+ "Saida=" + dataSaida.toString() 
                    +"\n" ;
        }else if( null != this.chale ){
            return "\n"+ "Cliente : " + cliente.getNome() 
                    +  chale.toString() 
                    + "\nEntrada : " + sdf.format(dataEntrada).toString()
                    //+ "Saida=" + dataSaida.toString() 
                    +"\n" ;
        } 
        
        return "ALUGUEL - SEM QUARTO OU CHALÉ"; //"Aluguel{" + "cliente=" + cliente.getNome() + ", dataEntrada=" + dataEntrada.toString() + ", dataSaida=" + dataSaida.toString() + '}';
    }
    

    
}