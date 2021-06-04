package com;


import java.io.IOException;

public class LeerArchivosCatastrosSri {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        CleanDatos cleanDatos = new CleanDatos();
        CrearObjetos crearObjetos = new CrearObjetos();
    /*    try {

        }catch (IOException e) {
            System.out.println( "Listo" );
        }*/
        try {
         //   cleanDatos.LimpiarDatos( empresa.getListaProvincias() );
            crearObjetos.LimpiarDatos(  );
        }catch (IOException e) {
            System.out.println( "Listo" );
        }
    }


/*
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String[] data = null;
        List<Empresa> cleanData = new ArrayList<Empresa>();
        FileWriter fichero = null;

        Set<Empresa> empresasSet = new HashSet<Empresa>();
        List <Empresa> empresas = new ArrayList<>();
        List <Empresa> empresas2 = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader( new FileReader( new File( "datosBuenos.csv" ), StandardCharsets.UTF_8 ) );
            String row = "";
            fichero = new FileWriter( new File( "ecuadorListaEmpresasBuenas.csv" ), StandardCharsets.UTF_8 );
            PrintWriter pw = new PrintWriter( fichero );
            long i = 1;
            while ((row = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                data = row.split( "," );
                //System.out.println(data.length );

                    if ( ! data[6].equals( "PERSONAS NATURALES" ) ) {
                        //pw.println(data[0]+";"+data[1]+";"+data[2]+";"+data[3]+";"+data[4]+";true;"+"PERSONAS_NATURALES");

//                        empresas.add( new Empresa( i,data[1] ,data[2],data[3],data[4] ,true,data[6] ));

                        pw.println( i + ";" + data[1].replace(";","") + ";" + data[2].replace(";","") + ";" + data[3].replace(";","") + ";" + data[4].replace(";","") + ";true;" + data[6].replace(";","") );
                        i++;
                    }




     
                
/*
                if(!data[2].equals("") && !data[3].equals("")&& data[3].equals("ACTIVO")){
                    cleanData.add(new Empresa(Long.parseLong(data[0]),data[0],data[1]+"_"+data[2],data[2],data[1],data[2],data[3],data[10]));
                   // System.out.println((new Empresa(Long.parseLong(data[0]),data[0],data[1]+"_"+data[2],data[2],data[1],data[2],data[3],data[10]).toString()));
                }
*/

    //EN EL ENUM DE TIPO EMPRESA, INDEPENDIENTE  PERSONA NATURAL , SOCIEDADES  ES SOCIENDADES
    //codigo -> RAZON_SOCIAL_NOMBRE_COMERCIAL
    //nombre comercial -> patrono y en nombre comercial
    //


}

//empresasSet.addAll(empresas);
// List <Empresa> empresas2 = new ArrayList<>();

//empresas2.addAll(empresasSet);

// empresas2.forEach( x -> {
// pw.println( x.id + ";" + x.codigo + ";" + x.nombre_comercial + ";" + x.razon_social + ";" + x.patrono + ";true;" + x.tipo_empresa );
//   if(x.equals(obj2)) list.remove(obj1); // or list.remove(obj2);

//  });
/*                empresas2.addAll(empresas);
            empresas.forEach( obj1 ->
            {
                empresas2.forEach( x -> {
                    if(obj1.equals(x)) empresas.remove(obj1);
                });

            });

            empresas.forEach( x -> {
            pw.println( x.id + ";" + x.codigo + ";" + x.nombre_comercial + ";" + x.razon_social + ";" + x.patrono + ";true;" + x.tipo_empresa );
            //   if(x.equals(obj2)) list.remove(obj1); // or list.remove(obj2);

            });*/

/*            List<Empresa> unique = cleanData.stream()
                    .collect(collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparingLong(Empresa::getId))),
                            ArrayList::new));

        } catch (FileNotFoundException e) {
            return;
        } catch (IOException e) {
            return;
        }


    }



}
*/
