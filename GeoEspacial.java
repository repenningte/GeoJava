import java.lang.Math;

public class GeoEspacial {

    // atributos = variaveis matematicas
    // esfera
    public double r;
    public double c;
    public double pi;
    public double area;
    public double volume;

    // cone
    public double g;
    public double h;
    public double areaLateral;
    public double areaBase;

    // cilindro
    public double V;

    // troncos
    public double R;
    public double areaBaseMaior;
    public double areaBaseMenor;
    public double areaTotal;


    // construtor - execucao inicial
    public GeoEspacial(){
        this.pi = Math.PI;
    }

    // metodo - acao = calculo
    public void Esfera(){
        this.area = 4 * this.pi * Math.pow(this.r,2);
        this.volume = (4.0/3.0) * this.pi * Math.pow(this.r, 3);
    }

    public void Cone(){
        this.areaLateral = this.pi * r * g;
        this.areaBase = this.pi * Math.pow(this.r, 2);
        this.volume = this.pi * Math.pow(this.r, 2) * h / 3;
    }

    public void Cilindro(){
        this.areaBase = this.pi * Math.pow(this.r, 2);
        this.areaLateral = 2 * this.pi * r *h;
        this.volume = this.pi * Math.pow(this.r, 2) * h;
    }

    public void TroncosCone(){
        this.areaBaseMaior = this.pi * Math.pow(this.R, 2);
        this.areaBaseMenor = this.pi * Math.pow(this.r, 2);
        this.areaLateral = this.pi * g * (R + r);
        this.areaTotal =  areaBaseMaior + areaBaseMenor + areaLateral;
        this.volume = (1/3) * this.pi * h * (Math.pow(this.R, 2) + R * r + Math.pow(this.r, 2));
    }

    public void TroncosPiramide(){
        this.volume = (1/3) * h * (areaBaseMaior + areaBaseMenor + Math.sqrt(areaBaseMaior * areaBaseMenor));
    }

    public static void main(String[] args) {
		
        // instancia a classe

        GeoEspacial objEsfera = new GeoEspacial();
        objEsfera.r = 4;
        objEsfera.Esfera();
        System.out.println(objEsfera.area);
        System.out.println(objEsfera.volume);

        GeoEspacial objCone = new GeoEspacial();
        objCone.g = 5;
        objCone.h = 3;
        objCone.r = 2;
        objCone.Cone();
        System.out.println(objCone.areaLateral);
        System.out.println(objCone.areaBase);
        System.out.println(objCone.volume);

        GeoEspacial objCilindro = new GeoEspacial();
        objCilindro.h = 3;
        objCilindro.Cilindro();
        System.out.println(objCilindro.areaLateral);
        System.out.println(objCilindro.areaBase);
        System.out.println(objCilindro.volume);

        GeoEspacial objTroncosCone = new GeoEspacial();
        objTroncosCone.R = 2;
        objTroncosCone.TroncosCone();
        System.out.println(objTroncosCone.areaBaseMaior);
        System.out.println(objTroncosCone.areaBaseMenor);
        System.out.println(objTroncosCone.areaLateral);
        System.out.println(objTroncosCone.areaTotal);
        System.out.println(objTroncosCone.volume);




	}

}