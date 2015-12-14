/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@Controller
@RequestMapping("/")
public class ControladorCliente {
    
    @CrossOrigin
    @RequestMapping(value="/cliente/{nombre}/{email}/{paterno}", method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable String nombre, @PathVariable String email, @PathVariable String paterno )throws Exception{
        Cliente c=new Cliente();
        c.setEmail(email);
        c.setNombre(nombre);
        c.setPaterno(paterno);
        DAOCliente d=new DAOCliente();
        d.guardar(c);
        return "Registro guardado";
        
        //INSERTAR Y ACTUALIZAR SOLO SE PUEDE PONER LAS ENTIDADES Y ATRIBUTOS
    }
    @CrossOrigin
    @RequestMapping(value ="/cliente", method=RequestMethod.GET,
            headers = {"Accept=application/json"})
    @ResponseBody String buscarTodo ()throws Exception{
        DAOCliente d=new DAOCliente();
        ArrayList<Cliente> clientes=d.buscarTodos();
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(clientes);
        
        //return "malo";
    }
    
    


@CrossOrigin
    @RequestMapping(value ="/cliente/{id}", method=RequestMethod.GET,
            headers = {"Accept=application/json"})
    @ResponseBody String buscarporid (@PathVariable Integer id)throws Exception{
        DAOCliente d=new DAOCliente();
        System.out.println("maloo");
         Cliente c=d.buscarPorId(id);
         ObjectMapper o=new ObjectMapper();
        
        return o.writeValueAsString(c);
    }
    


/*
@CrossOrigin
    @RequestMapping(value ="/cliente", method=RequestMethod.PUT,
 @ResponseBody String actualizar()throws Exception{
*/
/*
@CrossOrigin
@RequestMapping(value="/cliente/{nombre}/{email}/{paterno}", method=RequestMethod.PUT, headers={"Accept=text/html"})
    @ResponseBody String actualizar(@PathVariable String email )throws Exception{
    DAOCliente d=new DAOCliente();
    Cliente c=new Cliente();
    c.setEmail(null);
        System.out.println("maloo");
         Cliente c=d.actualizar(id);
         ObjectMapper o=new ObjectMapper();
        
        return o.writeValueAsString(c);     

}*/
}