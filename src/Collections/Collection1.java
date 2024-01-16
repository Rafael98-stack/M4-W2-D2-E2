package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class Collection1 {

    public Collection1(){}
    public void getScanner(){

        System.out.println("Inserisci quanti elementi devono essere inseriti");
        Scanner scanner = new Scanner(System.in);
        HashSet<String> str= new HashSet<String>();
        int Quantita= scanner.nextInt();

       try {
           System.out.println("Inserisci quali parole vuoi inserire");
           for (int i =0; i<Quantita;i++){

            String Parole=scanner.next();
            str.add(Parole);
        }
        System.out.println("Parole Distinte e Parole: "+str.size());
           System.out.println(" Parole: "+str);
       }catch (Exception e){}

    }
}

