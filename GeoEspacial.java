import java.lang.Math;

public class GeoEspacial {

    // atributos = variaveis matematicas
    public double r;
    public double c;
    public double pi;
    public double area;
    public double volume;


    // construtor - execucao inicial
    public GeoEspacial(){
        this.pi = Math.PI;
    }
    // metodo - acao = calculo
    public void Esfera(){
        this.area = 4*this.pi*Math.pow(this.r,2);
    }
    public void Cone(){

    }
    public void Troncos(){
        
    }

        
    public static void main(String[] args) {
		
        // instancia a classe
        GeoEspacial objEsp = new GeoEspacial();
        objEsp.r = 4;
        objEsp.c = 8;
        objEsp.Esfera();
        System.out.println(objEsp.area);


	}
    
}