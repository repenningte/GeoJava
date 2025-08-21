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

    // piramide
    public double n;
    public double b;
    public double ap;
    public double areaTotalPiramide;
    public double areaLateralPiramide;
    public double volumePiramide;

    // prismas
    public double P;
    public double areaLateralPrisma;
    public double areaTotalPrismas;
    public double volumePrisma;



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

    public void Piramide(){
        this.areaTotalPiramide = (n * b * ap) / 2;
        this.areaTotalPiramide = this.areaLateralPiramide + this.areaBase;
        this.volumePiramide = (1.0/3.0) * this.areaBase * h;
    }

    public void Prisma(){
        this.areaLateralPrisma = P * h;
        this.areaTotalPrismas = this.areaLateralPrisma + 2 * this.areaBase;
        this.volume = this.areaBase * h;
    }

}