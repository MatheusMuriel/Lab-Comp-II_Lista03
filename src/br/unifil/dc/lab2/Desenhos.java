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
        BasicStroke bs = new BasicStroke(1);
        BasicStroke ss = new BasicStroke(3);

        int[] gabinete = {250,160,200,340};
        pincel.drawRect(gabinete[0], gabinete[1], gabinete[2], gabinete[3]);

        //parte superior
        int[] xsTop = { 250, 250, 275, 425, 450, 450 };
        int[] ysTop = { 160, 130, 100, 100, 130, 160 };
        pincel.drawPolygon(xsTop,ysTop,xsTop.length);
        pincel.drawLine(xsTop[1],ysTop[1],xsTop[4],ysTop[4]);
        //

        //botão power
        int[] xsPower = {343, 340, 360, 357};
        int[] ysPower = {122, 107, 107, 122};
        pincel.drawPolygon(xsPower, ysPower, xsPower.length);
        pincel.drawOval(345,110,10,10);
        pincel.drawLine(350,110,350,115);
        //

        //Conectores de fone
        pincel.setStroke(ss);
        pincel.setColor(Color.green);
        pincel.drawOval(336,135,10,10);
        pincel.setColor(Color.pink);
        pincel.drawOval(354,135,10,10);
        pincel.setColor(Color.black);
        pincel.setStroke(bs);
        //

        //USB
        pincel.drawRect(304,135,15,8);
        pincel.fillRect(304,135,15,4);

        pincel.drawRect(382,135,15,8);
        pincel.fillRect(382,135,15,4);
        //

        //Baias
        pincel.drawRect(280,180,140,30);
        pincel.drawRect(280,220,140,30);
        pincel.drawRect(280,260,140,30);
        //

        //disquetes
        pincel.drawRect(290,300,120,30); //Drive
        pincel.drawOval(320,305,60,20);  //Concavidade
        pincel.setColor(Color.WHITE);
        pincel.fillRect(300,310,100,10);
        pincel.setColor(Color.black);
        pincel.drawRect(300,310,100,10); //Entrada do disquete
        pincel.drawRect(398,323,10,5);   //botão

        pincel.drawRect(290,340,120,30); //Drive
        pincel.drawOval(320,345,60,20);  //Concavidade
        pincel.setColor(Color.WHITE);
        pincel.fillRect(300,350,100,10); //Entrada do disquete
        pincel.setColor(Color.black);
        pincel.drawRect(300,350,100,10);
        pincel.drawRect(398,363,10,5);   //botão
        //

        //Escrito da Marca
        pincel.drawString("AlunoTEC", 325,480);


    }

    public static int centralizar(int valor){
        return 0;

    }
    
    public static void desenharAsterisco(Graphics2D g2d) {
        throw new UnsupportedOperationException("O aluno ainda não implementou este método.");
    }
    
}
