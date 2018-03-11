package br.unifil.dc.lab2;

import java.awt.*;
import java.awt.geom.Line2D;


/**
 * Write a description of class Desenhos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desenhos
{
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {
        int[] gabinete = {250,100,200,400};
        pincel.drawRect(gabinete[0], gabinete[1], gabinete[2], gabinete[3]);
        int[] baias ={gabinete[0] + 30, gabinete[1] + 10, 150, 30};
        pincel.drawRect(baias[0], baias[1], baias[2], baias[3]);
        pincel.setStroke(new BasicStroke(3));
        pincel.draw(new Line2D.Double(0,0, 100, 100));

    }

    public static int centralizar(int valor){
        return 0;

    }
    
    public static void desenharAsterisco(Graphics2D g2d) {
        throw new UnsupportedOperationException("O aluno ainda não implementou este método.");
    }
    
}
