package practica.gradiente;

public class Coeficientes {
    
    private double Beta0, Beta1;
    
    public Coeficientes(){
        this.Beta0 = 0;
        this.Beta1 = 0;
    }
    
    public double getBeta0() {  return Beta0;   }
    public void setBeta0(double beta0) {    this.Beta0 = beta0;}

    public double getBeta1() {  return Beta1;   }
    public void setBeta1(double beta1) {    this.Beta1 = beta1;}
    
}
