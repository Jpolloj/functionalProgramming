package com.programacionFuncional.dummy.streams.opereacionesReduccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionesReduce {

    public static void main(String args[]){
        int[] numeros = {5,1,5,20,44,1,2,55,1,60,41,37,65,41,89,86,99,76};

        int suma  = IntStream.of(numeros)
                .reduce(0, new IntBinaryOperator() {
                    @Override
                    public int applyAsInt(int left, int right) {
                        return left+right;
                    }
                });

        suma = IntStream.of(numeros).reduce(0, (num1, num2) -> Integer.sum(num1, num2));

        System.out.println("la suma es: "+suma);

        Path path1 = Paths.get("src/main/resources/static/Parrafos.txt");
        String texto = "";
        try(Stream<String> lineas = Files.lines(path1)){
            texto = lineas.map(linea -> linea.replace(",", ""))
                    .reduce("", (line1, line2) ->  line1.concat("\n").concat(line2));
        } catch (IOException ex){
            ex.printStackTrace();
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/static/Parrafos2.txt"))){
            bw.write(texto);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
