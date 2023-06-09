
public class Main {
    public static void main(String[] args) {

        //Ejercicio n1

        var numerolf = 0;
          if (numerolf <0) {
          System.out.println("es negativo");
        } else if (numerolf >0) {
          System.out.println("es positivo");
        }
          if (numerolf == 0 ) {
          System.out.println("es zero");
      }

      //Ejercicio n2

      int numeroWhile = 0;

      while (numeroWhile <= 3) {
          System.out.println(numeroWhile);
          numeroWhile = numeroWhile + 1;
      }

      //Ejercicio n3
    do {
        System.out.println(numeroWhile);
        numeroWhile = numeroWhile + 1;
    } while (numeroWhile <=1); //Aparece el numero 4 en consola

    //Ejercicio n4
    int numeroFor [] = {0, 1, 2, 3};

    for (int i = 0; i <= 3 ; i++) {
        System.out.println(numeroFor[i]);
    }

    //Ejercicio n5
        var estacion = "OTOÑO";

          switch (estacion) {
              case "VERANO":
                  System.out.println("es verano");
                  break;
              case "INVIERNO":
                  System.out.println("es invierno");
                  break;
              case "PRIMAVERA":
                  System.out.println("es primavera");
                  break;
              case "OTOÑO":
                  System.out.println("es otoño");
                  break;
              default:
                  System.out.println("estoy en default");
          }

    }
}