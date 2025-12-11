import java.sql.*;
import java.util.Scanner;

public class App {
    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/yogesh", "root",
                "root");

        System.out.println("Connection Establish");

        while (true) {
            System.out.println("Welcome to Avenger database");
            System.out.println("1. View Avenger");
            System.out.println("2. Add Avenger");
            System.out.println("3. Update Avenger");
            System.out.println("4. Delete Avenger");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1": viewAvenger();
                break;
                case "2": addAvenger();
                break;
                case "3": updateAvenger();
                break;
                case "4": deleteAvenger();
                break;
                case "5": sc.close();
                return;

                default: System.out.println("Enter Correct Option");
                break;
            }
        } //loop end
    } //main method end

    static void viewAvenger() throws SQLException{
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("select * from avengers");

        while (rs.next()) {
            int ar_id = rs.getInt("ar_id");
            String f_name = rs.getString("f_name");
            String l_name = rs.getString("l_name");
            String heroic_name = rs.getString("heroic_name");
            String city = rs.getString("city");

            System.out.println(ar_id+" "+f_name+" "+l_name+" "+heroic_name+" "+city);
        }
    }

    static void addAvenger() throws SQLException {
        String query = "INSERT INTO AVENGERS(f_name,l_name,heroic_name,city) VALUES(?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(query);

        System.out.println("Enter first name: ");
        String f_name = sc.nextLine();
        System.out.println("Enter last name: ");
        String l_name = sc.nextLine();
        System.out.println("Enter Heroic name: ");
        String heroic_name = sc.nextLine();
        System.out.println("Enter city name: ");
        String city = sc.nextLine();

        pst.setString(1, f_name);
        pst.setString(2, l_name);
        pst.setString(3, heroic_name);
        pst.setString(4, city);

        pst.executeUpdate();
    }

    static void updateAvenger() throws SQLException {
        String updQuery = "UPDATE avengers SET heroic_name=? WHERE f_name=?";
        PreparedStatement pst = con.prepareStatement(updQuery);
        System.out.println("Enter First name of the hero you want to update: ");
        String f_name = sc.nextLine();
        System.out.println("Enter Heroic Name");
        String heroic_name = sc.nextLine();

        pst.setString(1, heroic_name);
        pst.setString(2, f_name);

        int row = pst.executeUpdate();
        if (row > 0) {
            System.out.println("Avenger Updated successfully");
        }else {
            System.out.println("Please try again.");
        }
    }

    static void deleteAvenger() throws SQLException {
        String delQuery = "DELETE FROM avengers WHERE f_name=?";
        PreparedStatement pst = con.prepareStatement(delQuery);
        System.out.println("Enter First Name of the hero you want to delete: ");
        String f_name = sc.nextLine();
       
        pst.setString(1, f_name);

        int row = pst.executeUpdate();
        if (row > 0) {
            System.out.println("Avenger Deleted successfully");
        } else {
            System.out.println("Please try again.");
        }

    }
}
