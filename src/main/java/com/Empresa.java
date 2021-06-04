package com;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    Integer id;
    String codigo;
    String nombre_comercial;
    String razon_social;
    String patrono;
    Boolean activo;
    String tipo_empresa;

    public Empresa() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Empresa(Integer id, String codigo, String nombre_comercial, String razon_social, String patrono, Boolean activo, String tipo_empresa) {
        this.codigo = codigo;
        this.nombre_comercial = nombre_comercial;
        this.razon_social = razon_social;
        this.patrono = patrono;
        this.activo = activo;
        this.tipo_empresa = tipo_empresa;
        this.id = id;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_comercial() {
        return nombre_comercial;
    }

    public void setNombre_comercial(String nombre_comercial) {
        this.nombre_comercial = nombre_comercial;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getPatrono() {
        return patrono;
    }

    public void setPatrono(String patrono) {
        this.patrono = patrono;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getTipo_empresa() {
        return tipo_empresa;
    }

    public void setTipo_empresa(String tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }

    @Override
    public int hashCode() {
        return (this.nombre_comercial.hashCode() + this.codigo.hashCode() + this.razon_social.hashCode() + this.patrono.hashCode());
    }

    @Override
    public boolean equals(Object obj) {


        if ( obj == null ) return false;
        else if ( obj instanceof Empresa && getCodigo() == ((Empresa) obj).getCodigo() && getRazon_social() == ((Empresa) obj).getRazon_social() && getNombre_comercial() == ((Empresa) obj).getNombre_comercial() && getPatrono() == ((Empresa) obj).getPatrono() )
            return true;
        else return false;

    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", codigo='" + codigo + '\'' + ", nombre_comercial='" + nombre_comercial + '\'' + ", razon_social='" + razon_social + '\'' + ", patrono='" + patrono + '\'' + ", activo=" + activo + ", tipo_empresa='" + tipo_empresa + '\'' + '}';
    }

    public List<String> getListaProvincias() {

        List<String> provincias = new ArrayList<>();
        provincias.add( "db\\AZUAY.txt" );
        provincias.add( "db\\BOLIVAR.txt" );
        provincias.add( "db\\CANAR.txt" );
        provincias.add( "db\\CARCHI.txt" );
        provincias.add( "db\\CHIMBORAZO.txt" );
        provincias.add( "db\\COTOPAXI.txt" );
        provincias.add( "db\\EL_ORO.txt" );
        provincias.add( "db\\ESMERALDAS.txt" );
        provincias.add( "db\\GALAPAGOS.txt" );
        provincias.add( "db\\GUAYAS.txt" );
        provincias.add( "db\\IMBABURA.txt" );
        provincias.add( "db\\LOJA.txt" );
        provincias.add( "db\\LOS_RIOS.txt" );
        provincias.add( "db\\MANABI.txt" );
        provincias.add( "db\\MORONA_SANTIAGO.txt" );
        provincias.add( "db\\NAPO.txt" );
        provincias.add( "db\\ORELLANA.txt" );
        provincias.add( "db\\PASTAZA.txt" );
        provincias.add( "db\\PICHINCHA.txt" );
        provincias.add( "db\\SANTA_ELENA.txt" );
        provincias.add( "db\\SANTO_DOMINGO.txt" );
        provincias.add( "db\\SUCUMBIOS.txt" );
        provincias.add( "db\\TUNGURAHUA.txt" );
        provincias.add( "db\\ZAMORA_CHINCHIPE.txt" );
        return provincias;
    }
}
