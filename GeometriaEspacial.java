import java.lang.Math;

public class GeometriaEspacial {

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

    // troncos de cone e piramide
    public double R;
    public double H;
    public double h1;
    public double r1;
    public double r2;
    public double areaLateralTronco;
    public double areaTotalTronco;
    public double volumeTronco;
    public double areaBaseTronco;
    public double areaBaseMaiorTronco;
    public double areaBaseMenorTronco;



    // construtor - execucao inicial
    public GeometriaEspacial(){
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
    public void TroncoDeCone(){
        this.areaBaseMaiorTronco = this.pi * Math.pow(this.R, 2);
        this.areaBaseMenorTronco = this.pi * Math.pow(this.r, 2);
        this.areaBaseTronco = this.areaBaseMaiorTronco + this.areaBaseMenorTronco;
        this.areaLateralTronco = this.pi * (this.R, this.r * g);
        this.areaTotalTronco = this.areaBaseMaiorTronco + this.areaBaseMenorTronco + this.areaLateralTronco;
        this.volumeTronco = (1.0/3.0) * this.pi * this.h * (Math.pow(this.R, 2) - Math.pow(this.r, 2));
    }
    public void TroncoDePiramide(){
        this.areaBaseMaiorTronco = Math.pow(this.R, 2);
        this.areaBaseMenorTronco = Math.pow(this.r, 2);
        this.areaBaseTronco = this.areaBaseMaiorTronco + this.areaBaseMenorTronco;
        this.areaLateralTronco = (this.R, this.r) * this.g;
        this.areaTotalTronco = this.areaBaseMaiorTronco + this.areaBaseMenorTronco + this.areaLateralTronco;
        this.volumeTronco = (1.0/3.0) * this.h * (Math.pow(this.R, 2) - Math.pow(this.r, 2));
    }


    public static void main(String[] args) {
		
        // instancia a classe

        GeometriaEspacial objEsfera = new GeometriaEspacial();
        objEsfera.r = 4;
        objEsfera.Esfera();
        System.out.println(objEsfera.area);
        System.out.println(objEsfera.volume);

        GeometriaEspacial objCone = new GeometriaEspacial();
        objCone.g = 5;
        objCone.h = 3;
        objCone.r = 2;
        objCone.Cone();
        System.out.println(objCone.areaLateral);
        System.out.println(objCone.areaBase);
        System.out.println(objCone.volume);

        GeometriaEspacial objCilindro = new GeometriaEspacial();
        objCilindro.h = 3;
        objCilindro.Cilindro();
        System.out.println(objCilindro.areaLateral);
        System.out.println(objCilindro.areaBase);
        System.out.println(objCilindro.volume);

        GeometriaEspacial objTroncoCone = new GeometriaEspacial();
        objTroncoCone.R = 5;
        objTroncoCone.r = 3;
        objTroncoCone.h = 4;
        objTroncoCone.TroncoDeCone();
        System.out.println(objTroncoCone.areaBaseMaiorTronco);
        System.out.println(objTroncoCone.areaBaseMenorTronco);
        System.out.println(objTroncoCone.areaBaseTronco);
        System.out.println(objTroncoCone.areaLateralTronco);
        System.out.println(objTroncoCone.areaTotalTronco);
        System.out.println(objTroncoCone.volumeTronco);
        
        GeometriaEspacial objTroncoPiramide = new GeometriaEspacial();
        objTroncoPiramide.R = 5;
        objTroncoPiramide.r = 3;
        objTroncoPiramide.h = 4;
        objTroncoPiramide.TroncoDePiramide();
        System.out.println(objTroncoPiramide.areaBaseMaiorTronco);
        System.out.println(objTroncoPiramide.areaBaseMenorTronco);
        System.out.println(objTroncoPiramide.areaBaseTronco);
        System.out.println(objTroncoPiramide.areaLateralTronco);
        System.out.println(objTroncoPiramide.areaTotalTronco);
        System.out.println(objTroncoPiramide.volumeTronco);



	}

}