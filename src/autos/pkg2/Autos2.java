/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos.pkg2;
import java.util.Scanner;
/**
 *
 * @author Saul
 */
public class Autos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        int clase1; 
        int clase2;
        int clase3;
        
        
      
         System.out.println("Menu Automóviles disponibles ");
       System.out.println("Menu Inicio ");
       System.out.println("");
       System.out.println("01=Seleccionar automovil ");
       System.out.println("02= Salir");
       System.out.println("");
       System.out.println("Ingresar Codigo");
        clase1  = scan.nextInt();
        
        switch(clase1){
            case 1 : System.out.println("Menu autos"); 
             
                     Double autoprecio = null; 
             String autonombre = null;
                System.out.println("Menu autos");
                System.out.println("01=Sedán Económico  $.18,940.00");
                System.out.println("02=Sedán $.23,570.00");
                System.out.println("03=Deportivo $.24,100.00");
                System.out.println("04=Híbrido $.25,100.00");
                System.out.println("05=Coupe  $.19,350.00");
                System.out.println("06=Coupe Deportivo  $.24,100.00");
                System.out.println("07=Compacto   $.16,190.00");
                System.out.println("08=Hatchback  $.20,150.00");
                System.out.println("09=Económico versión Rally $.34,700.00,00");
                System.out.println("10= regresar a Menu Automóviles disponibles");
                System.out.println("Ingresar codigo");
               
                clase2 = scan.nextInt();
                switch(clase2){
                    case 1: autoprecio=18940.00;
                    autonombre="Sedán Económico";
                    
                    
                        
                        break;
                    
                    case 2: autoprecio=23570.00;
                    autonombre="Sedán";
                    
                    
                    break;
                    
                    
                    case 3: autoprecio=24100.00;
                    autonombre="Deportivo";
                    
                    break;
                    
                    case 4: autoprecio=25100.00;
                    autonombre="Híbrido";
                    
                    
                   break;
                   
                   case 5: autoprecio=19350.00;
                    autonombre="Coupe";
                    
                    
                    break;
                    
                   case 6 : autoprecio=24100.00;
                    autonombre="Coupe Deportivo";
                    
                    
                    break;
                    
                    case 7 : autoprecio=16190.00;
                    autonombre="Compacto";
                    
                    break;
                    
                    
                    case 8: autoprecio=20150.00;
                    autonombre="Hatchback";
                    
                    break;
                    
                    case 9 : autoprecio=34700.00;
                    autonombre="Económico versión Rally";
                    
                    
                    break;
                    
                    case 10: 
                   
                    break;
                    
                    
                }      
                System.out.println("Ingresar codigo");
                
               int usoamenidades;
               String usoamenidades2;
                System.out.println("Desea amenidades");
                System.out.println("01= si ");
                System.out.println("02= no ");
                usoamenidades = scan.nextInt();
                if (usoamenidades==01) {
                    
                    System.out.println("tipo amenidades");
                    System.out.println("01=tipos de tranmision");
                    System.out.println("02=color pintura exterior");
                    System.out.println("03=tamaño de aro");
                    System.out.println("04=acesorios exteriores");
                    System.out.println("05=accesorios interiores");
                    System.out.println("06=accesorios electricos");
                    System.out.println("07=regresar gama automovil");
                     
                    clase3 = scan.nextInt();
                switch(clase3){
                    case 1 : usoamenidades=01;
                       usoamenidades2="tipos de tranmision";
                       
                       int tipotransmision = 0;
                     String tipotransmision1;
                    System.out.println("tipo de transmision");
                    System.out.println("Manual = 01");
                    System.out.println("CVT = 02");
                    System.out.println("Manual con Turbo = 03");
                    System.out.println("CVT con Turbo = 04");
                    System.out.println("regresar al seleccion amenidades = 05");
                   
                   switch(tipotransmision){
                    
                    case 1 : tipotransmision=01;
                       tipotransmision1 = "Manual";

                    break;
                    
                    case 2 : tipotransmision=02;
                    tipotransmision1 = "CVT";
                    
                    break;
                    
                    
                    case 3 : tipotransmision=03;
                    tipotransmision1 = "Manual con Turbo";
                    
                    break;
                    
                    case 4 : tipotransmision=04;
                    tipotransmision1 = "CVT con Turbo";
                    
                    break;
                    
                    case 5 : tipotransmision=05;
                    tipotransmision1 = "regresar al seleccion amenidades";
                         
                }
                    System.out.println("Ingresar codigo");
                
                       
                       break;
                       
                    case 2 : usoamenidades=02;
                       usoamenidades2="color pintura exterior";
                       
                        int colorpinturaexterior = scan.nextInt();
                       
                       String colorpinturaexterior1;
                       
                        System.out.println("color pintura exterior");
                        System.out.println("01=Cosmic Blue");
                        System.out.println("02=Burgundy Night");
                       System.out.println("03=Rallye Red");
                          System.out.println("04=Crystal Black ");
                           System.out.println("05=Modern Steel");
                            System.out.println("06=Taffeta White ");
                             System.out.println("07=Energy Gree");
                              System.out.println("08=Kona Coffee ");
                              System.out.println(" 09=Orange Fury");
                              System.out.println("10=Helios Yellow");
                              System.out.println("11=Sonic Gray ");
                              System.out.println("12=Polished Metal");
                              System.out.println("13=Regresas al menu amenidades");
                              
                              switch (colorpinturaexterior){
                                
                                  case 1 : colorpinturaexterior=01;
                                  colorpinturaexterior1 = "Cosmic Blue";
                                  
                                  break; 
                                  
                                  case 2 : colorpinturaexterior=02;
                                  colorpinturaexterior1 = "Burgundy Night";
                                  
                                  break;
                                  
                                  case 3 : colorpinturaexterior=03;
                                  colorpinturaexterior1 = "Rallye Red";
                                  
                                  break;
                                  
                                  
                                  case 4 : colorpinturaexterior=04;
                                  colorpinturaexterior1 = "Crystal Black";
                                  
                                  break;
                                  
                                  case 5 : colorpinturaexterior=05;
                                  colorpinturaexterior1 = "Modern Steel";
                                  
                                  break;
                                  
                                  case 6 : colorpinturaexterior=06;
                                  colorpinturaexterior1 = "Taffeta White";
                                  
                                  break;
                                  
                                  case 7 : colorpinturaexterior=07;
                                  colorpinturaexterior1 = "Energy Gree";
                                  
                                  break;
                                  
                                  
                                  
                                  case 10 : colorpinturaexterior=10;
                                  colorpinturaexterior1 = "Helios Yellow";
                                  
                                  break;
                                  
                                  case 11 : colorpinturaexterior=11;
                                  colorpinturaexterior1 = "Sonic Gray";
                                  
                                  break;
                                  
                                  case 12 : colorpinturaexterior=12;
                                  colorpinturaexterior1 = "Polished Metal";
                                  
                                  break;
                                  
                                  
                                  case 13 : colorpinturaexterior=13;
                                  colorpinturaexterior1 = "Regresas al menu amenidades";
                                  
                                  
                                  
                                  
                              }
                       
                       break;

                       
                    case 3 : usoamenidades=03;
                        usoamenidades2="tamaño de aro";
                        
                        break;
                        
                        
                    case 4 : usoamenidades=04;
                       usoamenidades2="acesorios exteriores";
                       
                       
                       break;
                       
                    case 5 : usoamenidades=05;
                       usoamenidades2="accesorios interiores";
                       
                       break;
                       
                    case 6 :usoamenidades=06;
                       usoamenidades2="accesorios electricos";
                       
                       
                       break;
                       
                    case 7 : usoamenidades=07;
                       usoamenidades2="regresar gama automovil";
                       
                       break; 
                       
                }
                 
                    System.out.println("gama seleccionada: "+autonombre);
                    System.out.println("total:"+autoprecio);
                    
                    System.out.println("precione 1 para salir");
                    
                    
                        
                }
                
        }
    }
}


                
            
                  
               
            
               
        
    


    
    
