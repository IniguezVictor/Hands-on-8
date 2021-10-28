package practica.gradiente;

public class HelperArithmetic {
    
    DataSet aux = new DataSet();
    
    //Constructor
    public HelperArithmetic(){};
    
    //Calcula el error respecto a los valores actuales de beta0 y beta 1
    public double Error(double beta0, double beta1){
        double resultado = 0;
        double[] auxX = aux.getX();
        double[] auxY = aux.getY();
        double n = aux.getN();
        
        for(int i = 0; i < n; i++){
            resultado += Math.pow(auxY[i] - beta0 - (beta1 * auxX[i]),2);
        }
        resultado = resultado / n;
        return resultado;
    } 
    
    //Sustituye los valores de beta0 y beta1 en la derivada parcial respecto a beta0
    public double derB0(double beta0, double beta1){
        double resultado = 0;
        double[] auxX = aux.getX();
        double[] auxY = aux.getY();
        double n = aux.getN();
        
        for(int i = 0; i < n; i++){
            resultado += auxY[i] + (-1 * (beta0 + (beta1 * auxX[i])));
        }
        resultado = (-2 * resultado) / n;
        return resultado;
    } 
    
    //Sustituye los valores de beta0 y beta1 en la derivada parcial respecto a beta1
    public double derB1(double beta0, double beta1){
        double resultado = 0;
        double[] auxX = aux.getX();
        double[] auxY = aux.getY();
        int n = aux.getN();
        
        for(int i = 0; i < n; i++){
            resultado += auxX[i] * (auxY[i] + (-1 * (beta0 + (beta1 * auxX[i]))));
        }
        resultado = (-2 * resultado) / n;
        return resultado;
    } 
}
