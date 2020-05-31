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
    private String loginUsuarioOfertante;
    private int referenciaMueble;
    private int oferta;
    
    public Oferta()
    {
    
    }
    public Oferta(int idOferta,String loginUsuarioOfertante,int referenciaMueble,int oferta)
    {
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    public void setLoginUsuarioOfertante(String loginUsuarioOfertante) {
        this.loginUsuarioOfertante = loginUsuarioOfertante;
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
