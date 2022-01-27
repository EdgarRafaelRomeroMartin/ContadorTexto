import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Split {

    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Falta el nombre del archivo");
            System.exit(1);
        }

        String fileName = args[0];

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("El nombre del archivo no se encuentra");
            System.exit(2);
        }

        BufferedReader in = new BufferedReader(fileReader);


        String UwU= null;

        String []palabras;

        int contadorPalabras=0;
        long start = System.currentTimeMillis();
        try {
            while ((UwU = in.readLine()) != null) {
                palabras = UwU.split("\\s+");
                for(String a : palabras) {
                    contadorPalabras++;
                }
                }


        } catch (IOException e) {
            System.out.println("Error");
            System.exit(3);
        }



        long time = System.currentTimeMillis() - start;
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("El archivo " + fileName + " tiene " + contadorPalabras );
        System.out.println( "Palabras y " + "el progrma duro "+ time +" ms en correr");
        //Con este metodo duro 184 ms, por lo que duro 102 ms mas que el metodo Tokenizer

    }

}

