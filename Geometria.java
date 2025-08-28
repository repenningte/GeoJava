import java.util.Scanner;

public class Geometria {


        public static void Esfera(){
        
                // instacia de classe
                GeometriaEspacial objEsfera = new GeometriaEspacial();
                // instancia o objeto scanner
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o raio da esfera: ");
                // envia para o atributo do objeto o valor que foi lido
                objEsfera.r = ler.nextDouble();
                // executa o metodo 
                objEsfera.Esfera();
                // escreve na tela o atributo de retorno
                System.out.println(objEsfera.area);
                System.out.println(objEsfera.volume);
        }

        public static void Cone(){
                GeometriaEspacial objCone = new GeometriaEspacial();
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o raio do Cone: ");
                System.out.println("Digite a geratriz do cone: ");
                System.out.println("Digite a altura do cone: ");
                objCone.r = ler.nextDouble();
                objCone.g = ler.nextDouble();
                objCone.h = ler.nextDouble();
                objCone.Cone();
                System.out.println(objCone.areaBase);
                System.out.println(objCone.areaLateral);
                System.out.println(objCone.volume);
        }

        public static void Cilindro(){
                GeometriaEspacial objCilindro = new GeometriaEspacial();
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite a altura do Cilindro: ");
                objCilindro.h = ler.nextDouble();
                objCilindro.Cilindro();
                System.out.println(objCilindro.areaLateral);
                System.out.println(objCilindro.areaBase);
                System.out.println(objCilindro.volume);
        }

        public static void TroncoDeCone(){
                GeometriaEspacial objTroncoCone = new GeometriaEspacial();
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite a altura do Tronco de Cone: ");
                System.out.println("Digite o raio do Tronco de Cone: ");
                System.out.println("Digite o raio maior Tronco de Cone: ");
                objTroncoCone.R = ler.nextDouble();
                objTroncoCone.r = ler.nextDouble();
                objTroncoCone.h = ler.nextDouble();
                objTroncoCone.TroncoDeCone();
                System.out.println(objTroncoCone.areaBaseMaiorTronco);
                System.out.println(objTroncoCone.areaBaseMenorTronco);
                System.out.println(objTroncoCone.areaBaseTronco);
                System.out.println(objTroncoCone.areaLateralTronco);
                System.out.println(objTroncoCone.areaTotalTronco);
                System.out.println(objTroncoCone.volumeTronco);
        }

        public static void TroncoDePiramide(){
                GeometriaEspacial objTroncoPiramide = new GeometriaEspacial();
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite a altura do Tronco da Piramide: ");
                System.out.println("Digite o raio do Tronco da Piramide: ");
                System.out.println("Digite o raio maior Tronco ds Piramide: ");
                objTroncoPiramide.R = ler.nextDouble();
                objTroncoPiramide.r = ler.nextDouble();
                objTroncoPiramide.h = ler.nextDouble();
                objTroncoPiramide.TroncoDePiramide();
                System.out.println(objTroncoPiramide.areaBaseMaiorTronco);
                System.out.println(objTroncoPiramide.areaBaseMenorTronco);
                System.out.println(objTroncoPiramide.areaBaseTronco);
                System.out.println(objTroncoPiramide.areaLateralTronco);
                System.out.println(objTroncoPiramide.areaTotalTronco);
                System.out.println(objTroncoPiramide.volumeTronco);
        }

        public static void Piramide(){
                GeometriaEspacial objPiramide = new GeometriaEspacial();
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o valor da base da piramide: ");
                System.out.println("Digite a apótema da piramide: ");
                objPiramide.b = ler.nextDouble();
                objPiramide.ap = ler.nextDouble();
                objPiramide.Piramide();
                System.out.println(objPiramide.areaLateralPiramide);
                System.out.println(objPiramide.areaTotalPiramide);
                System.out.println(objPiramide.volumePiramide);
        }

        public static void Prisma(){
                GeometriaEspacial objPrisma = new GeometriaEspacial();
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o perímetro da base do prisma: ");
                objPrisma.P = ler.nextDouble();
                objPrisma.Prisma();
                System.out.println(objPrisma.areaLateralPrisma);
                System.out.println(objPrisma.areaTotalPrismas);
                System.out.println(objPrisma.volumePrisma);
        }


        

        
}