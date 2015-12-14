/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;


/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */

@Component
public class ConfigurarTomcat implements EmbeddedServletContainerCustomizer{

    @Override
    public void customize(ConfigurableEmbeddedServletContainer cesc) {
       cesc.setPort(9008);
    }
    
}
