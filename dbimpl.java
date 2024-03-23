import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class dbimpl extends UnicastRemoteObject implements dbinter {
    protected dbimpl() throws RemoteException {
        super();
    }

    @Override
    public List<Customer> getCustomers() throws RemoteException {
        List<Customer> list = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/bookdb";
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        // Load the MySQL JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM data_books");

            while (rs.next()) {
                Customer customerObj = new Customer();
                customerObj.setName(rs.getString("book_name"));
                customerObj.setPrice(rs.getInt("book_price"));
                customerObj.setAuthor(rs.getString("book_author"));
                customerObj.setQuantity(rs.getInt("book_quantity"));
                customerObj.setPublication(rs.getString("book_publication"));
                customerObj.setDatePublication(rs.getInt("book_date_of_publication"));
                customerObj.setQuanOrder(rs.getInt("book_quantityto_order"));
                customerObj.setTotalCost(rs.getInt("book_totalcost"));

                list.add(customerObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
