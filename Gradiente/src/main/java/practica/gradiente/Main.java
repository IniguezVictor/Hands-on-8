package practica.gradiente;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class Main extends Agent{
    
    @Override
    protected void setup(){
        System.out.println("Inicio del agente " + getLocalName());
        addBehaviour(new MyOneShotBehaviour());
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
        System.out.println("-Agente en accion-");
        
        Gradiant Benetton = new Gradiant();
        Benetton.Metod();
    } 
    
    @Override
    public int onEnd() {
      System.out.println("-Agente muriendo-");
      myAgent.doDelete();   
      return super.onEnd();
    } 
  } 
}
