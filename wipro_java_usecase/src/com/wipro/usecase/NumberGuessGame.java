package com.wipro.usecase;

import java.sql.*;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER = "NAVYASREE";
    static final String PASS = "MANIGINTI";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int userGuess = 0;
        
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        
        System.out.println("Guess the number between 1 and 100!");
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            createTableIfNotExists(conn);
            
            while (userGuess != targetNumber) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations, " + playerName + "! You guessed it in " + attempts + " attempts.");
                    saveAttempt(conn, playerName, attempts);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
    
    private static void createTableIfNotExists(Connection conn) throws SQLException {
        String createTableSQL = "BEGIN " +
                "   EXECUTE IMMEDIATE 'CREATE TABLE GameScores (id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY, playerName VARCHAR2(50), attempts NUMBER)'; " +
                "EXCEPTION " +
                "   WHEN OTHERS THEN " +
                "       IF SQLCODE != -955 THEN RAISE; END IF; " +
                "END;";
        try (CallableStatement stmt = conn.prepareCall(createTableSQL)) {
            stmt.execute();
        }
    }
    
    private static void saveAttempt(Connection conn, String playerName, int attempts) throws SQLException {
        String insertSQL = "INSERT INTO GameScores (playerName, attempts) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, playerName);
            pstmt.setInt(2, attempts);
            pstmt.executeUpdate();
            System.out.println("Your score has been saved in the database.");
        }
    }
}