package poepartone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Student
 */
public class RegistrationTest {

    Registration registration = new Registration();

    @Test
    public void testCheckUserNameValid() {
        assertTrue(
                registration.checkUserName("kyl_1")
        );
    }

    @Test
    public void testCheckUserNameInvalid() {
        assertFalse(
                registration.checkUserName("kyle!!!!!!")
        );
    }

    @Test
    public void testCheckPasswordComplexityValid() {
        assertTrue(
                registration.checkPasswordComplexity("Ch&&sec@ke99!")
        );
    }

    @Test
    public void testCheckPasswordComplexityInvalid() {
        assertFalse(
                registration.checkPasswordComplexity("password")
        );
    }

    @Test
    public void testCheckCellPhoneNumberValid() {
        assertTrue(
                registration.checkCellPhoneNumber("+27838968976")
        );
    }

    @Test
    public void testCheckCellPhoneNumberInvalid() {
        assertFalse(
                registration.checkCellPhoneNumber("08966553")
        );
    }

    @Test
    public void testRegisterUserSuccess() {
        assertEquals(
                "Registration was a success",
                registration.registerUser(
                        "kyl_1",
                        "Ch&&sec@ke99!",
                        "+27838968976"
                )
        );
    }

    @Test
    public void testRegisterUserInvalidUsername() {
        assertEquals(
                "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.",
                registration.registerUser(
                        "kyle!!!!!!",
                        "Ch&&sec@ke99!",
                        "+27838968976"
                )
        );
    }

    @Test
    public void testRegisterUserInvalidPassword() {
        assertEquals(
                "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
                registration.registerUser(
                        "kyl_1",
                        "password",
                        "+27838968976"
                )
        );
    }

    @Test
    public void testRegisterUserInvalidCellphone() {
        assertEquals(
                "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.",
                registration.registerUser(
                        "kyl_1",
                        "Ch&&sec@ke99!",
                        "08966553"
                )
        );
    }
}
