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

        

        
}