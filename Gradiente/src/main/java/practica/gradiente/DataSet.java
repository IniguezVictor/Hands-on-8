package practica.gradiente;

public class DataSet {
    
    private int n;
    private double[] x, y;
    
    //Constructor
    public DataSet(){
        this.n = 9;
        this.x = new double[]{23, 26, 30, 34, 43, 48, 52, 57, 58};
        this.y = new double[]{651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
    }
    
    //Setters y Getters de variables
    public int getN() { return n;   }
    
    public double[] getX(){ return this.x;   }
    public void setX(double[] aux){ this.x = aux;   }
    
    public double[] getY(){ return this.y;   }
    public void setY(double[] aux){ this.y = aux;   }
}
