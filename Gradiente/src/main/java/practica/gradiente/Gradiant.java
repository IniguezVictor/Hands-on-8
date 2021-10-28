package practica.gradiente;

public class Gradiant {
    
    HelperArithmetic helper = new HelperArithmetic();
    Coeficientes c = new Coeficientes();
    
    private double a;
    
    //Constructor
    public Gradiant(){  this.a = 0.000543; }
    
    public void setA(double aux){   this.a = aux;   }
    public double getA(){   return this.a;  }
    
    //Aplicacion del metodo Gradiente descendiente
    public void Metod(){
        
        double b0 = c.getBeta0();
        double b1 = c.getBeta1();
        double alfa = getA();
        
        double error = helper.Error(b0, b1);
        double aux = 0;
        
        for(int i = 0; i < 10000; i++){
            
            c.setBeta0(b0 - (alfa * helper.derB0(b0,b1)));
            c.setBeta1(b1 - (alfa * helper.derB1(b0,b1)));
            
            aux = helper.Error(c.getBeta0(), c.getBeta1());
            System.out.println("error dentro del for: " + aux);
            
            if(aux < 0){
                System.out.println("\nConverge\n");
                break;
            }
            error = aux;
            b0 = c.getBeta0();
            b1 = c.getBeta1();
        }
        System.out.println("\nBeta0 = " + b0);
        System.out.println("Beta1 = " + b1);
        System.out.println("Error = " + error);
    }
}
