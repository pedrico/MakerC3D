package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etiV;
    public String C3D = "";

    public String getEtiV() {
        return etiV;
    }

    public void setEtiV(String etiV) {
        this.etiV = etiV;
    }

    public String getEtiF() {
        return etiF;
    }

    public void setEtiF(String etiF) {
        this.etiF = etiF;
    }
    private String etiF;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
        
}
