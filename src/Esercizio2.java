import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci i litri consumati");
            double litriConsuati = scanner.nextDouble();

            System.out.println("Inserisci i km percorsi");
            double kmPercorsi = scanner.nextDouble();

             double kmLitro= calcolo(litriConsuati, kmPercorsi);
             System.out.println("Rapporto km/l= " + kmLitro);

        }
        catch (ArithmeticException exception){
            System.out.println("0 litri consumati");
        }

         finally {
            scanner.close();
        }


        }

    private static double calcolo(double litriConsumati, double kmPercorsi) {
        if (litriConsumati == 0) {
            throw new ArithmeticException();
        }
        return kmPercorsi / litriConsumati;
    }
    }

