package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class JDBCFeaturesTest {
    @Test
    public void initData() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/people", "root", "my-secret-pw");
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001−05−06 02:15')");
            stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002−08−15 09:12')");
            stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002−09−09 10:36')");
            stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010−06−08 01:24')");
            stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005−11−12 03:44')");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void fetchAllAnimals() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/people",
                    "root", "my-secret-pw");
            Statement stmt = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("select * from animal");
            while (rs.next()) {
                System.out.println(rs.getTimestamp(4));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void testResultSetPosition() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/people",
                "root", "my-secret-pw")) {
            String sql = "select * from animal";
            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs.absolute(0));
            System.out.println(rs.absolute(5));
            System.out.println(rs.previous());
            System.out.println(rs.relative(-2));
            System.out.println(rs.relative(-100));
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}