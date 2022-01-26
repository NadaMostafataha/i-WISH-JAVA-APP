/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.awt.image.BufferedImage;

/**
 *
 * @author dell
 */
public class Product {
    private String NAME;
    private double PRICE;
    private BufferedImage PRODUCTIMG;
    
    public Product(String NAME, double PRICE, BufferedImage PRODUCTIMG) {
        this.NAME = NAME;
        this.PRICE = PRICE;
        this.PRODUCTIMG = PRODUCTIMG;
    }

    public String getNAME() {
        return NAME;
    }

    public double getPRICE() {
        return PRICE;
    }

    public BufferedImage getPRODUCTIMG() {
        return PRODUCTIMG;
    }
}