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
                 objCone.

                 System.out.println(objCone.areaLateral);
        }

        public static void main(String[] args) {
                System.out.println("Oieee Rapha!");            

                Geometria objGeo = new Geometria();
                objGeo.Esfera();
        }

}