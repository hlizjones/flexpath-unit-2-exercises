import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTests {
    private static DB db;
    private static Connection connection;

    @BeforeAll
    public static void setup() throws Exception {
        var configBuilder = DBConfigurationBuilder.newBuilder();
        configBuilder.setPort(0);
        db = DB.newEmbeddedDB(configBuilder.build());
        db.start();
        db.createDB("test", "root", "");

        connection = DriverManager.getConnection(
            "jdbc:mariadb://localhost:" + db.getConfiguration().getPort() + "/test",
            "root",
            ""
        );

        var reader = new java.io.InputStreamReader(
            ExerciseTests.class.getResource("/create-database.sql").openStream()
        );

        var sr = new ScriptRunner(connection);
        sr.setStopOnError(true);
        sr.setLogWriter(null);
        sr.setErrorLogWriter(null);
        sr.runScript(reader);
    }

    @AfterAll
    public static void tearDown() throws Exception {
        connection.close();
        db.stop();
    }

    @Test
    public void testOrderDetails() throws Exception {
        var sql = Files.readString(
            Path.of(ExerciseTests.class.getResource("/01-unordered-products.sql").toURI())
        );

        var results = connection.prepareStatement(sql).executeQuery();
        var i = 0;

        while (results.next()) {
            if (i == 0 && (
                results.getInt("ProductID") != 2 ||
                !results.getString("ProductName").equals("Laptop")
            )) {
                Assertions.fail("Order #1 details are not correct");
            }
            i++;
        }
        assertEquals(1, i, "Number of orders is not correct");
    }

    @Test
    public void testJDoeOrders() throws Exception {
        var sql = Files.readString(
            Path.of(ExerciseTests.class.getResource("/02-jdoe-orders.sql").toURI())
        );

        var results = connection.prepareStatement(sql).executeQuery();
        var i = 0;

        while (results.next()) {
            if (i == 0 && (
                results.getInt("OrderID") != 1 ||
                !results.getString("ShippingAddress").equals("123 Main St")
            )) {
                Assertions.fail("Order #1 details are not correct");
            }
            i++;
        }
        assertEquals(1, i, "Number of orders is not correct");
    }
}
