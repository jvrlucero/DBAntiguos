package jugos;

import java.sql.ResultSet;
public class Jugos {
    
    
    //instanciar un objeto
    Conexion cn = new Conexion();

    public void insertar(String jugo, String sabor) {
        cn.UID("INSERT INTO jugos(jugo,nombre) VALUES('" + jugo + "','" + sabor + "')");
    }
    
    public void eliminar(String cual){
        cn.UID("DELETE FROM jugos WHERE jugo=" +cual);
    }
    
    public ResultSet contarRegistros(){
        return (cn.getValores("SELECT MAX(jugo) FROM jugos"));
    }
    
    public void actualizar(String jugo, String nombre) {
        cn.UID("UPDATE jugos SET nombre='" + nombre + "' WHERE jugo='" + jugo + "'");
    }

    
    public ResultSet buscar(String codigo) {
        return (cn.getValores("SELECT * FROM jugos WHERE jugo='" + codigo + "'"));
    }

    

}
