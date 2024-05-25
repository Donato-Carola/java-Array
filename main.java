//! esercizio 1

//?Memorizzare in un array di dieci posizioni dieci numeri naturali

// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//          int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//     }
// }

//! esercizio 2

//??Dato un array di interi già valorizzato, stampare il contenuto

// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//         int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//         for (int i = 0; i < array.length; i++) {
//             System.out.print(" " + array[i]);
//         }

//     }
// }

//! esercizio 3

//?Dato un array di interi già valorizzato, stampare tutti gli elementi maggiori di 10

// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//          int [] array = {55, 1, 10, 80, 75, 60, 45};

//          for(int i = 0; i < array.length; i++){
//             if( array[i] > 10){
//               System.out.println(array[i]);  
//             }

//          }

//     }
// }

//!esercizio 4

//?Dato un array di interi già valorizzato, stampare la somma di tutti gli elementi

//import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//         int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int sum = 0;
//         for (int i = 0; i < array.length; i++) {
//             sum += array[i];

//         }
//         System.out.println(sum);

//     }
// }

//! esercizio 5

//?Dato un array di interi già valorizzata, stampare la media

// public class main {

//     public static void main(String[] args) {
//         int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int sum = 0;
        
//         for (int i = 0; i < array.length; i++) {
//             sum += array[i];

//         }
//         float media = (float) sum/array.length;
//         System.out.println(media);

//     }
// }

//!esercizio 6 

//Dato un array di interi già valorizzato, contare quante volte è presente il numero 10 

public class main {

    public static void main(String[] args) {
        int[] array = { 10, 10, 50, 45, 75, 10, 52, 10, 10, 10, 10, 10 };
        int count = 0;

        for (int i = 0; i < array.length; i++) {
          if(array[i] == 10){
            count += 1;
          }

        }
        System.out.println("di numeri 10 ce nesono: " + count);
      

    }
}
