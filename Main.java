public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;

        if(numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo.");
        }
        if(numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es negativo.");
        }
        if(numeroIf == 0){
            System.out.println("El numero es cero.");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println(numeroWhile);
        }while(numeroWhile<3);

        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "PRIMAVERA";

        switch (estacion){
            case("VERANO")-> System.out.println("La estacion es Verano.");
            case("OTOÑO")-> System.out.println("La estacion es Otoño.");
            case("INVIERNO")-> System.out.println("La estacion es Invierno.");
            case("PRIMAVERA")-> System.out.println("La estacion es Primavera.");
            default -> System.out.println("No es una estacion.");
        }

    }
}