
package data.Papeleo;

import data.Usuarios.Cliente.Cliente;


public class Formulario {
    
    
    
    String Hechos;
    String documentos;
    Cliente Autor;

    public Formulario(String Hechos, String documentos, Cliente Autor) {
        this.Hechos = Hechos;
        this.documentos = documentos;
        this.Autor = Autor;
    }

    public String getHechos() {
        return Hechos;
    }

    public String getDocumentos() {
        return documentos;
    }

    public Cliente getAutor() {
        return Autor;
    }

    public void setHechos(String Hechos) {
        this.Hechos = Hechos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public void setAutor(Cliente Autor) {
        this.Autor = Autor;
    }

    
   
    
    
    
}
