/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@Controller
@RequestMapping("/")
public class ControladorInicial {
    
    @RequestMapping("/")
    @CrossOrigin
    @ResponseBody String hola() throws Exception{
        //DAOCliente d=new DAOCliente();
        //Cliente c=new Cliente();
        //c.setEmail("rapidclimate@outlook.com");
        ///c.setNombre("Juan Carlitos");
        //c.setPaterno("Campitos");
        //d.guardar(c);
        return "Hola desde el spring boot sin maven";
    }
    
}
