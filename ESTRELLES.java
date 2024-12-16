public class ESTRELLES {

    public static void Estrellas(int a){
        for (int i = 0; i < a ; i++){
            System.out.print("*");
        }
    }

    public static void Guiones(int b){
        for (int i = 0; i < b ; i++){
            System.out.print("-");
        }
    }

    public static void Numeros(int c,int d){
        for (int i = 0; i < d ; i++){
            System.out.print(c);
        }
    }

    public static void main(String[] args){
        Estrellas(8);
        System.out.println("");
        Guiones(1);
        System.out.println("");
        Numeros(5,6);
        System.out.println("");
        Estrellas(3);
        System.out.println("");
        Guiones(4);
        System.out.println("");
        Numeros(3,2);
    }
}




