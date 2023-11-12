import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] tablica1 = {5, 10, 15, 20, 25};
        int[] tablica2 = {6, 12, 18, 24, 30};

        int sumaTablica1 = Arrays.stream(tablica1).sum();
        int sumaTablica2 = Arrays.stream(tablica2).sum();

        // Maksymalna i minimalna wartość
        int maxTablica1 = Arrays.stream(tablica1).max().getAsInt();
        int minTablica1 = Arrays.stream(tablica1).min().getAsInt();
        int maxTablica2 = Arrays.stream(tablica2).max().getAsInt();
        int minTablica2 = Arrays.stream(tablica2).min().getAsInt();

        // Średnia wartości
        double sredniaTablica1 = (double) sumaTablica1 / tablica1.length;
        double sredniaTablica2 = (double) sumaTablica2 / tablica2.length;

        // Kopia tablic
        int[] kopiaTablica1 = Arrays.copyOf(tablica1, tablica1.length);
        int[] kopiaTablica2 = Arrays.copyOf(tablica2, tablica2.length);

        // Wybór elementów podzielnych przez 10
        int[] podzielnePrzez2Tablica1 = Arrays.stream(tablica1).filter(x -> x % 10 == 0).toArray();
        int[] podzielnePrzez2Tablica2 = Arrays.stream(tablica2).filter(x -> x % 10 == 0).toArray();

        // Usuwanie określonego elementu
        int[] tablica1usuwanie = Arrays.stream(tablica1).filter(x -> x != 10).toArray();
        int[] tablica2usuwanie = Arrays.stream(tablica2).filter(x -> x != 18).toArray();

        // Połączenie tablic
        int[] polaczoneTablice = IntStream.concat(Arrays.stream(tablica1), Arrays.stream(tablica2)).toArray();

        // Znalezienie liczby wystąpień wartości 6 w tablica2
        long liczbaWystapien = Arrays.stream(tablica2).filter(x -> x == 6).count();

        // Wyświetlanie wyników
        System.out.println("Suma elementów tablica1: " + sumaTablica1);
        System.out.println("Suma elementów tablica2: " + sumaTablica2);
        System.out.println("Maksymalna wartość w tablica1: " + maxTablica1);
        System.out.println("Minimalna wartość w tablica1: " + minTablica1);
        System.out.println("Maksymalna wartość w tablica2: " + maxTablica2);
        System.out.println("Minimalna wartość w tablica2: " + minTablica2);
        System.out.println("Średnia wartości w tablica1: " + sredniaTablica1);
        System.out.println("Średnia wartości w tablica2: " + sredniaTablica2);
        System.out.println("orginalna tablica1: " + Arrays.toString(tablica1));
        System.out.println("orginalna tablica1: " + Arrays.toString(tablica2));
        System.out.println("Kopia tablica1: " + Arrays.toString(kopiaTablica1));
        System.out.println("Kopia tablica2: " + Arrays.toString(kopiaTablica2));
        System.out.println("Elementy podzielne przez 10 w tablica1: " + Arrays.toString(podzielnePrzez2Tablica1));
        System.out.println("Elementy podzielne przez 10 w tablica2: " + Arrays.toString(podzielnePrzez2Tablica2));
        System.out.println("Tablica1 bez elementu 10: " + Arrays.toString(tablica1usuwanie));
        System.out.println("Tablica2 bez elementu 18: " + Arrays.toString(tablica2usuwanie));
        System.out.println("Połączone tablice: " + Arrays.toString(polaczoneTablice));
        System.out.println("Liczba wystąpień wartości 6 w tablica2: " + liczbaWystapien);
    }
}