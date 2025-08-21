class Geometria{

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

        GeometriaEspacial objPiramide = new GeometriaEspacial();
        objPiramide.n = 4;
        objPiramide.b = 2;
        objPiramide.ap = 2;
        objPiramide.Piramide();
        System.out.println(objPiramide.areaLateralPiramide);
        System.out.println(objPiramide.areaTotalPiramide);
        System.out.println(objPiramide.volumePiramide);

        GeometriaEspacial objPrisma = new GeometriaEspacial();
        objPrisma.P = 2;
        objPrisma.Prisma();
        System.out.println(objPrisma.areaLateralPrisma);
        System.out.println(objPrisma.areaTotalPrismas);
        System.out.println(objPrisma.volumePrisma);





	}
}