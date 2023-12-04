import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int opzione;
        int [] arr = new int[5];
        for (int i = 0; i<5; i++){
        double randomNumber = Math.random() *10+1;
        int intRandomNumber = (int) randomNumber;
            arr[i] = intRandomNumber;
            System.out.println(arr[i]);
        }
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Scegli la posizione del numero da cambiare, 0 per chiudere l'applicazione");
            opzione = scanner.nextInt();
            switch (opzione){
                case 1:
                    System.out.println("Inserisci il numero da inserire in questa posizione: ");
                    arr[0] = scanner.nextInt();
                    System.out.println(arr[0]);
                    break;

                case 2:
                    System.out.println("Inserisci il numero da inserire in questa posizione: ");
                    arr[1] = scanner.nextInt();
                    System.out.println(arr[1]);
                    break;
                case 3:
                    System.out.println("Inserisci il numero da inserire in questa posizione: ");
                    arr[2] = scanner.nextInt();
                    System.out.println(arr[2]);
                    break;

                case 4:
                    System.out.println("Inserisci il numero da inserire in questa posizione: ");
                    arr[3] = scanner.nextInt();
                    System.out.println(arr[3]);
                    break;
                    case 5:
                        System.out.println("Inserisci il numero da inserire in questa posizione: ");
                        arr[4] = scanner.nextInt();
                        System.out.println(arr[4]);
                        break;
                case 0:
                    System.out.println("Nuovo array: ");
                    for (int i = 0; i<5; i++){
                        System.out.println(arr[i]);
                    }
                    System.out.println("Chiusura programma");
                    scanner.close();

                    default:
                        System.out.println("Scelta non valida, riprova");
            }      }
        while (opzione!=0);



    }
}