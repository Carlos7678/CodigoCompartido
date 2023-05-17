/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class Zona {

    private Punt cse;
    private Punt cid;

    public Zona(Punt cse, Punt cid) {
        this.cse = cse;
        this.cid = cid;
        System.out.println(this.cse + " " + this.cid);
        if (cid.getY() > cse.getY() && cid.getX() < cse.getX()) {
            Punt p = cid;
            this.cid = cse;
            this.cse = p;
        }
        if (cid.getY() > cse.getY() && cid.getX() > cse.getX()) {
            this.cse = new Punt(cse.getX(), cid.getY());
            this.cid = new Punt(cid.getX(), cse.getY());
        }
        if (cid.getY() < cse.getY() && cid.getX() < cse.getX()) {
            this.cse = new Punt(cid.getX(), cse.getY());
            this.cid = new Punt(cse.getX(), cid.getY());
        }
        System.out.println(this.cse + " " + this.cid);
    }

    public Zona(int xcse, int ycse, int xcid, int ycid) {
        this(new Punt(xcse, ycse),
                new Punt(xcid, ycid));
    }

}
