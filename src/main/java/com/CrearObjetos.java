package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class CrearObjetos {

    BufferedReader bufferedReader = null;
    String[] data = null;
    FileWriter fichero = null;

    public void LimpiarDatos() throws IOException {

        List <Empresa> empresas = new ArrayList<>();
        Charset inputCharset = StandardCharsets.ISO_8859_1;

        fichero = new FileWriter( "FiltroListaEmpresas.csv", inputCharset );
        PrintWriter pw = new PrintWriter( fichero );
        try {
            FileReader fr = new FileReader( "ListaEmpresas.csv", inputCharset );
            bufferedReader = new BufferedReader( fr );
            String row = "";
            long i = 1;
            while ((row = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                data = row.split( ";" );


                empresas.add(new Empresa(Integer.valueOf( data[0] ) ,data[1], data[2], data[3],data[4], true,data[6] ));
            }
            System.out.println("hola " + empresas.size() );
            List<Empresa> unique = empresas.stream()
                    .collect(collectingAndThen(toCollection(() -> new TreeSet<>( Comparator.comparing(Empresa::getCodigo))),
                            ArrayList::new));
            System.out.println("hola " + unique.size() );
            int contador = 1;
            for ( Empresa empresa : unique ) {
                pw.println( contador + ";" + empresa.getRazon_social()+"_"+empresa.getPatrono() + ";" + empresa.getRazon_social() + ";" + empresa.getNombre_comercial() + ";" + empresa.getPatrono() + ";" +  "VERDADERO" + ";" + "SOCIEDADES" );
                contador++;
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
