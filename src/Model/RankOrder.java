/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

public class RankOrder {
    private int id;
    private String question;
    private ArrayList<String> answerInOrder;

    public RankOrder(int id, String question, ArrayList<String> answerInOrder) {
        this.id = id;
        this.question = question;
        this.answerInOrder = answerInOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswerInOrder() {
        return answerInOrder;
    }

    public void setAnswerInOrder(ArrayList<String> answerInOrder) {
        this.answerInOrder = answerInOrder;
    }
    
}
