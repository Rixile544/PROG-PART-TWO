package poepartone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Student
 */
public class LoginTest {

    /**
     * Tests a successful login.
     */
    @Test
    public void testLoginSuccessful() {

        Login login = new Login();

        login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

        assertTrue(
                login.loginUser(
                        "kyl_1",
                        "Ch&&sec@ke99!"
                )
        );
    }

    /**
     * Tests an unsuccessful login.
     */
    @Test
    public void testLoginFailed() {

        Login login = new Login();

        login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

        assertFalse(
                login.loginUser(
                        "wrong",
                        "password"
                )
        );
    }
}
