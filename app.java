public class app {

    public static void main(String[] args) {
        
        System.out.println("Escolha a opcao");
        System.out.println("1) Esfera");
        System.out.println("2) cone");

        switch (opcao) {
            case 1:
                    Geometria objGeo = new Geometria();
                    objGeo.Esfera();
                break;
        
            default:
                break;
        }
    }
    
}
