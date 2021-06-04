package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CleanDatos {
    BufferedReader bufferedReader = null;
    String[] data = null;
    FileWriter fichero = null;

    public void LimpiarDatos(List<String> archivos) throws IOException {
        Charset inputCharset = StandardCharsets.ISO_8859_1;

        fichero = new FileWriter( "ListaEmpresas.csv", inputCharset );
        PrintWriter pw = new PrintWriter( fichero );

        archivos.forEach( estado -> {
            System.out.println(estado);
            try {
                FileReader fr = new FileReader( estado, inputCharset );
                bufferedReader = new BufferedReader( fr );
                String row = "";
                long i = 1;
                while ((row = bufferedReader.readLine()) != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    data = row.split( "\t" );
                    if (  data.length >= 8) {

                        if ( ! data[10].equals( "PERSONAS NATURALES" ) && ! data[0].equals( "NUMERO_RUC" ) ) {
                            String razonSocial = data[1].replace( ";", "" );
                            String nombreComercial = data[2].isEmpty() ? razonSocial : data[2].replace( ";", "" );
                            String patrono = data[12].isEmpty() ? razonSocial : data[12].replace( ";", "" );
                            String estadoEmpresa = "VERDADERO";
                            String tipo = "SOCIEDADES";
                            pw.println( i + ";" + data[0] + ";" + razonSocial + ";" + nombreComercial + ";" + patrono + ";" + estadoEmpresa + ";" + tipo );
                            i++;
                        }
                    }

                }


            }catch (IOException e) {
                e.printStackTrace();
            }

        } );
    }
}
