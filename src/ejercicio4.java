public class ejercicio4 {

  public static void main(String[] args) {

    int num = 10;
    if(num > 0) {
        System.out.print("el numero es positivo");
    } else if(num < 0) {
        System.out.print("el numero es negativo");
    } else {
        System.out.print("el numero no es ni positivo ni negativo");
    }
    
    int numeroWhile = 3;

    while(numeroWhile < 3){
        numeroWhile++;
        System.out.print(numeroWhile);
    }

    do {
        numeroWhile++;
        System.out.print(numeroWhile);
    } while (numeroWhile < 3);


    for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
        System.out.print(numeroFor);
    }

    var estacion = "inviernoooo";

    switch (estacion) {
        case "OTOÑO":
            System.out.print("la estacion es otoño");
            break;
        case "INVIERNO":
            System.out.print("la estacion es invierno");
            break;
        case "PRIMAVERA":
            System.out.print("la estacion es primavera");
            break;
        case "VERANO":
            System.out.print("la estacion es verano");
            break;
        default:
            System.out.print("la estacion es " + estacion);
            break;
    }

  }

}