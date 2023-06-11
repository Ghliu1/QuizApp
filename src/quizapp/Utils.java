/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import Model.FastestQuestion;
import Model.PictureQuestion;
import Model.MCQ;
import Model.RankOrder;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Utils {

    private static Connection conn;
    public static int questionCounter = 0;
    public static int mcqCounter = 0;
    public static int picCounter = 0;
    public static int fCounter = 0;
    public static int rOCounter = 0;
    
    public static int redTeamQuestionCounter = 0;
    public static int blueTeamQuestionCounter = 0;
    public static ArrayList<MCQ> mcQs;
    public static ArrayList<RankOrder> rOs;
    public static ArrayList<FastestQuestion> fQs;
    public static ArrayList<PictureQuestion> pQs;
    public static int blueTeamScore;
    public static int redTeamSCore;
    
    public static void connectToDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("No error");

            String url = "jdbc:sqlite:quiz.db";
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public static void createTables() {
        createMCQTable();
        createPicturesTable();
        createFastestAnswerTable();
        createRankQuestionTable();

    }

    public static ArrayList<MCQ> getMCQs() {
        String sql = "SELECT * from mc_questions";
        Statement smt;
        ArrayList<MCQ> mcqs = new ArrayList<>();

        try {
            smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String question = rs.getString("question");
                String correct = rs.getString("correct");
                String wrongOne = rs.getString("wrongOne");
                String wrongTwo = rs.getString("wrongTwo");
                String wrongThree = rs.getString("wrongThree");
                MCQ mcq = new MCQ(id, question, correct, wrongOne, wrongTwo, wrongThree);
                mcqs.add(mcq);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error occurred in getting data from db\n" + ex.toString());
        }
        return mcqs;
    }

    public static int insertMCQtoDB(String question, String correct, String wrongOne, String wrongTwo, String wrongThree) {
        String sql = "INSERT INTO mc_questions(question, correct, wrongOne, wrongTwo,"
                + "wrongThree) VALUES(?,?,?,?,?)";
        PreparedStatement psmt;
        try {
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, question);
            psmt.setString(2, correct);
            psmt.setString(3, wrongOne);
            psmt.setString(4, wrongTwo);
            psmt.setString(5, wrongThree);
            int insert = psmt.executeUpdate();
            return insert;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
        return 0;
    }

    public static ArrayList<RankOrder> getRankedQuestions() {
        String sql = "SELECT * from rank_questions";
        Statement smt;
        ArrayList<RankOrder> rOQs = new ArrayList<>();

        try {
            smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String question = rs.getString("question");
                String r_one = rs.getString("r_one");
                String r_two = rs.getString("r_two");
                String r_three = rs.getString("r_three");
                String r_four = rs.getString("r_four");
                ArrayList<String> rankedAnswers = new ArrayList<>();
                rankedAnswers.add(r_one);
                rankedAnswers.add(r_two);
                rankedAnswers.add(r_three);
                rankedAnswers.add(r_four);
                RankOrder ro = new RankOrder(id,question, rankedAnswers);
                rOQs.add(ro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error occurred in getting data from db\n" + ex.toString());
        }
        return rOQs;
    }

    public static ArrayList<PictureQuestion> getPictureQuestions() {
        String sql = "SELECT * from pic_questions";
        Statement smt;
        ArrayList<PictureQuestion> pQs = new ArrayList<>();

        try {
            smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {

                int id = rs.getInt("id");
                BufferedImage correct = ImageIO.read(rs.getBinaryStream("correct_pic"));
                BufferedImage wrong = ImageIO.read(rs.getBinaryStream("wrong_pic"));
                PictureQuestion pq = new PictureQuestion(id, correct, wrong);
                pQs.add(pq);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error occurred in getting image data from db\n" + ex.toString());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error occurred in getting image data from db\n" + ex.toString());
        }
        return pQs;
    }

    public static int insertRankOrdertoDB(String question, ArrayList<String> rankedAnswers) {
        String sql = "INSERT INTO rank_questions(question, r_one, r_two, r_three,"
                + "r_four) VALUES(?,?,?,?,?)";
        PreparedStatement psmt;
        try {
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, question);
            psmt.setString(2, rankedAnswers.get(0));
            psmt.setString(3, rankedAnswers.get(1));
            psmt.setString(4, rankedAnswers.get(2));
            psmt.setString(5, rankedAnswers.get(3));
            int insert = psmt.executeUpdate();
            return insert;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
        return 0;
    }

    public static ArrayList<FastestQuestion> getFastestQuestions() {
        String sql = "SELECT * from fast_questions";
        Statement smt;
        ArrayList<FastestQuestion> fQs = new ArrayList<>();

        try {
            smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String question = rs.getString("question");
                FastestQuestion fq = new FastestQuestion(id, question);
                fQs.add(fq);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error occurred in getting data from db\n" + ex.toString());
        }
        return fQs;
    }

    public static int insertFastQuestiontoDB(String question) {
        String sql = "INSERT INTO fast_questions(question) VALUES(?)";
        PreparedStatement psmt;
        try {
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, question);
            int insert = psmt.executeUpdate();
            return insert;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
        return 0;
    }

    public static int inserPicturetoDB(String correctFile, String wrongFile) {
        String sql = "INSERT INTO pic_questions(correct_pic, wrong_pic) VALUES(?,?)";
        PreparedStatement psmt;

        try {
            psmt = conn.prepareStatement(sql);

            // set parameters
            psmt.setBytes(1, readFile(correctFile));
            psmt.setBytes(2, readFile(wrongFile));

            int result = psmt.executeUpdate();
            System.out.println("Stored the file in the BLOB column.");
            return result;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    private static void createMCQTable() {
        String sql = "CREATE TABLE IF NOT EXISTS mc_questions(id integer PRIMARY KEY AUTOINCREMENT, "
                + "question text NOT NULL, "
                + "correct text NOT NULL, "
                + "wrongOne text NOT NULL, "
                + "wrongTwo text, "
                + "wrongThree text);";
        Statement smt;
        try {
            smt = conn.createStatement();

            smt.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private static void createPicturesTable() {
        String sql = "CREATE TABLE IF NOT EXISTS pic_questions(id integer PRIMARY KEY AUTOINCREMENT, "
                + "correct_pic blob NOT NULL, "
                + "wrong_pic blob NOT NULL);";
        Statement smt;
        try {
            smt = conn.createStatement();

            smt.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private static void createFastestAnswerTable() {
        String sql = "CREATE TABLE IF NOT EXISTS fast_questions(id integer PRIMARY KEY AUTOINCREMENT, "
                + "question text NOT NULL);";
        Statement smt;
        try {
            smt = conn.createStatement();

            smt.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private static void createRankQuestionTable() {
        String sql = "CREATE TABLE IF NOT EXISTS rank_questions(id integer PRIMARY KEY AUTOINCREMENT, "
                + "question text NOT NULL, "
                + "r_one text NOT NULL, "
                + "r_two text NOT NULL, "
                + "r_three text, "
                + "r_four text);";
        Statement smt;
        try {
            smt = conn.createStatement();

            smt.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private static byte[] readFile(String file) {
        ByteArrayOutputStream bos = null;
        try {
            File f = new File(file);
            FileInputStream fis = new FileInputStream(f);
            byte[] buffer = new byte[1024];
            bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        }
        return bos != null ? bos.toByteArray() : null;
    }

    public static void readData() {
        mcQs = getMCQs();
        fQs =getFastestQuestions();
        rOs = getRankedQuestions();
        pQs = getPictureQuestions();
        System.out.println();
    }
    public static int updateFastestQuestion(FastestQuestion fq){
        String sql = "UPDATE fast_questions SET question = ? WHERE id = ?";
        PreparedStatement psmt;
        try {
            psmt = conn.prepareStatement(sql);
        
        psmt.setString(1, fq.getQuestion());
        psmt.setInt(2, fq.getId());
        int insert = psmt.executeUpdate();
        return insert;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        
        }        
       return 0;
    }
    public static int updatePictureQuestion(PictureQuestion pq, String correct , String wrong){
        String sql = "UPDATE pic_questions SET correct_pic = ?, "
                + "wrong_pic = ? WHERE id = ?";
        PreparedStatement psmt;
        try {
            psmt = conn.prepareStatement(sql);
        
        psmt.setBytes(1, readFile(correct));
        psmt.setBytes(2, readFile(wrong));
        psmt.setInt(3, pq.getId());
        int insert = psmt.executeUpdate();
        return insert;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        
        }        
       return 0;
    }
    public static int updateRankOrder(RankOrder ro){
        String sql = "UPDATE rank_questions SET question = ?, "
                + "r_one = ?, r_two = ?, r_three = ?,"
                + "r_four = ? WHERE id = ?";
        PreparedStatement psmt;
        try {
            psmt = conn.prepareStatement(sql);
        
        psmt.setString(1, ro.getQuestion());
        psmt.setString(2, ro.getAnswerInOrder().get(0));
        psmt.setString(3, ro.getAnswerInOrder().get(1));
        psmt.setString(4, ro.getAnswerInOrder().get(2));
        psmt.setString(5, ro.getAnswerInOrder().get(3));
        psmt.setInt(6, ro.getId());
        int insert = psmt.executeUpdate();
        return insert;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        
        }        
       return 0;
    }
    public static int updateMCQ(MCQ mcq){
        String sql = "UPDATE mc_questions SET question = ?, "
                + "correct = ?, wrongOne = ?, wrongTwo = ?,"
                + "wrongThree = ? WHERE id = ?";
        PreparedStatement psmt;
        try {
            psmt = conn.prepareStatement(sql);
        
        psmt.setString(1, mcq.getQuestion());
        psmt.setString(2, mcq.getCorrectAnswer());
        psmt.setString(3, mcq.getWrongAnswerOne());
        psmt.setString(4, mcq.getWrongAnswerTwo());
        psmt.setString(5, mcq.getWrongAnswerThree());
        psmt.setInt(6, mcq.getId());
        int insert = psmt.executeUpdate();
        return insert;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        
        }        
       return 0;
    }

}
