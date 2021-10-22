package practica.gradiente;

public class Gradiant {
    
    HelperArithmetic aux = new HelperArithmetic();
    
    private double beta0, beta1, a;
    
    //Constructor
    public Gradiant(){
        this.beta0 = 0;
        this.beta1 = 0;
        this.a = 0.003;
    }
    
    //Setters y Getters
    public void setBeta0(double aux){   this.beta0 = aux;   }
    public double getBeta0(){   return this.beta0;  }
    
    public void setBeta1(double aux){   this.beta1 = aux;   }
    public double getBeta1(){   return this.beta1;  }
    
    public void setA(double aux){   this.a = aux;   }
    public double getA(){   return this.a;  }
    
    //Aplicacion del metodo Gradiente descendiente
    public void Metod(){
        
        double alfa = getA();
        double b0 = getBeta0();
        double b1 = getBeta1();
        
        double e = aux.Error(getBeta0(), getBeta1());
        double auxe;
        
        System.out.println("Error inicial = " + e);
        
        while(e > 0){
            auxe = e;
             
            b0 = getBeta0();
            System.out.println("Beta 0 antes del cambio = " + b0);
            
            b1 = getBeta1();
            System.out.println("Beta 1 antes del cambio = " + b1);
            
            double auxBeta0 = alfa * aux.derB0(b0,b1);
            double auxBeta1 = alfa * aux.derB1(b0,b1);
             
            setBeta0(b0 - auxBeta0);
            System.out.println("Beta 0 despues del cambio " + getBeta0());
            
            setBeta1(b1 - auxBeta1);
            System.out.println("Beta 1 despues del cambio " + getBeta1());
            
            e = aux.Error(getBeta0(), getBeta1());
            
            if(auxe < e){
                System.out.println("Error = " + e);
                break;
            }
            System.out.println("Error en el ciclo = " + e);
        }
    System.out.println("Beta0 = " + getBeta0());
    System.out.println("Beta1 = " + getBeta1());
    }
}
