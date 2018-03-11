package br.unifil.dc.lab2;

import java.awt.*;


/**
 * Classe que contem as posiçoes, cores e forma dos desenhos.
 *
 * @author Guilherme Augusto da Rocha Manhani
 * @author MatheusMuriel
 * @version (1.04)
 */
public class Desenhos
{

    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {

    }
    /**
     * @param pincel variavel que receber os metodos draw para desenhar.
     * @param Asterisco vai passar as possições do desenho.
     * @see java.awt.Graphics, java.swing.Graphics2D
     */
    public static void desenharAsterisco(Graphics2D pincel, Dimension Asterisco) {
        int x = 160;
        int y = 200;
        int z = (x+y)/2;
        Graphics2D g2d = (Graphics2D) pincel.create();
        pincel.setStroke(new BasicStroke(10));
        pincel.drawLine(x,x,y,y);
        pincel.drawLine(x,y,y,x);
        pincel.drawLine(z,x,z,y);
        pincel.drawLine(x,z,y,z);
    }

    /**
     * @param pincel variavel que receber os metodos draw, Color e fill para desenhar.
     * @param Smile vai passar as possições do desenho.
     * @see java.awt.Graphics, java.swing.Graphics2D
     */
    public static void desenharSmile(Graphics2D pincel, Dimension Smile){
        int x = 150;
        int t = 30;

        Graphics2D g2d =(Graphics2D) pincel.create();
        pincel.setStroke(new BasicStroke(10));

        Color verdeEscuro = new Color ( 25, 128, 82);
        pincel.setColor(verdeEscuro);
        pincel.fillOval(x,x,x,x);
        pincel.setColor(Color.black);
        pincel.drawOval(x,x,x,x);
        pincel.fillOval( 180, 190, t,t);
        pincel.fillOval( 240, 190, t,t);
        pincel.fillArc(190, 210, 70, 65, 180, 180);
        //pincel.drawLine (190,240, 260,240);

        pincel.drawOval(350,x,x,x);
        pincel.setColor(Color.YELLOW);
        pincel.fillOval(350,x,x,x);
        pincel.setColor(Color.black);
        pincel.drawOval(350,x,x,x);
        pincel.fillOval( 380, 190, t,t);
        pincel.fillOval( 440, 190, t,t);
        pincel.drawLine (470,250, 380,250);

        pincel.drawOval(550,x,x,x);
        pincel.setColor(Color.red);
        pincel.fillOval(550,x,x,x);
        pincel.setColor(Color.black);
        pincel.drawOval(550,x,x,x);
        pincel.fillOval( 580, 190, t,t);
        pincel.fillOval( 640, 190, t,t);
        pincel.drawArc(590, 235, 70, 65, 0, 180);
        pincel.drawLine (590,175, 620,185);
        pincel.drawLine (625,185, 660,175);

    }

    /**
     * Metodo que desenha um gabinete, com 3 baias de leitor de disco, 2 espaços de disquete,
     * entradas de fone e microfone e 2 portas USB
     * @param pincel variavel que receber os metodos draw, Color e fill para desenhar.
     * @param gab vai passar as possições do desenho.
     * @see java.awt.Graphics, java.swing.Graphics2D
     */
    public static void desenharGabinete(Graphics2D pincel, Dimension gab){
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

}



