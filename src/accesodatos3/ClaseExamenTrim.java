/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos3;

/**
 *
 * @author jaime
 */
public class ClaseExamenTrim {

    private String atributo1;
    private int orden;
    private float precio;

    public ClaseExamenTrim(String atributo1, int orden, float precio) {
        this.atributo1 = atributo1;
        this.orden = orden;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ClaseExamenTrim{" + "atributo1=" + atributo1 + ", orden=" + orden + ", precio=" + precio + '}';
    }

}
