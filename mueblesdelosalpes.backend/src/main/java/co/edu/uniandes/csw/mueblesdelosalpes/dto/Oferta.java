/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author USUARIO
 */
public class Oferta 
{
    
    private int idOferta;
    private String ofertante;
    private int referenciaMueble;
    private int oferta;
    
    public Oferta()
    {
    
    }
    public Oferta(int idOferta,String ofertante,int referenciaMueble,int oferta)
    {
        this.idOferta = idOferta;
        this.ofertante = ofertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public int getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(int referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }
    
    
}
