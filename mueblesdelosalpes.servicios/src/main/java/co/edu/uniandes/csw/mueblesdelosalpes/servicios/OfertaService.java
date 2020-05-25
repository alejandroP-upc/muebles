package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */

@Path("/Oferta")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfertaService 
{
//  @EJB
    @EJB
    private IServicioOfertaMockLocal ofertaEjb;
  
    

    @POST
    @Path("ofertas/")
    public List<Oferta>  agregarOfertas(Oferta oferta) throws OperacionInvalidaException  
    {
        ofertaEjb.agregarOferta(oferta);
        return ofertaEjb.darOferta();
 
    }
    @GET
    @Path("catalogoOfertas/")
    public List<Oferta> getTodasLasOfertas() 
    {
       // System.err.println("Holamundo");
                
        return ofertaEjb.darOferta();
 
    }
    
    
}
