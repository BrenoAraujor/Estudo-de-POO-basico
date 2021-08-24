package Caneta;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Caneta de cor: " + this.cor);
       System.out.println("Ponta:" + this.ponta);
       System.out.println("Carga:" + this.carga);
       System.out.println("Está tampada? " + this.tampada);
       //*O "this" da referência/a quem está chamando o  método/*
      

    }
     
    void rabiscar(){
      if(tampada == true){
         System.out.print("ERRO! Não pode rabiscar");
            
        } else {
         System.out.print("Rabiscando...");
        }
      }
     void tampar () {
       this.tampada = true;
        
    }
    
      void destampar () {
       this.tampada = false;

    }
   

       
     


    }
    

