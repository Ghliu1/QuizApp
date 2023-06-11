/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.image.BufferedImage;

public class PictureQuestion {
    private int id;
    private BufferedImage correct;
    private BufferedImage wrong;

    public PictureQuestion(int id ,BufferedImage correct, BufferedImage wrong) {
        this.id = id;
        this.correct = correct;
        this.wrong = wrong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BufferedImage getCorrect() {
        return correct;
    }

    public void setCorrect(BufferedImage correct) {
        this.correct = correct;
    }

    public BufferedImage getWrong() {
        return wrong;
    }

    public void setWrong(BufferedImage wrong) {
        this.wrong = wrong;
    }
    
    
}
