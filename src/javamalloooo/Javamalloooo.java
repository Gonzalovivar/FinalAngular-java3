/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Javamalloooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SpringApplication.run(Javamalloooo.class, args);
        
    }
    
}
