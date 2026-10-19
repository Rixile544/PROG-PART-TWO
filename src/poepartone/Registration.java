package poepartone;

/**
 *
 * @author Student
 */
public class Registration {

    protected String userName;
    protected String passWord;
    protected String cellPhone;

    /**
     * Checks that the username contains an underscore
     * and is no more than five characters long.
     *
     * @param username username entered by the user
     * @return true if the username is correctly formatted
     */
    public boolean checkUserName(String username) {

        return username != null
                && username.length() <= 5
                && username.contains("_");
    }

    /**
     * Checks that the password meets the required complexity.
     *
     * Password requirements:
     * - At least eight characters long
     * - Contains a capital letter
     * - Contains a number
     * - Contains a special character
     *
     * @param password password entered by the user
     * @return true if the password meets all requirements
     */
    public boolean checkPasswordComplexity(String password) {

        return password != null
                && password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[^a-zA-Z0-9].*");
    }

    /**
     * Checks that the cellphone number contains the
     * South African international country code (+27)
     * followed by exactly nine digits.
     *
     * Regular expression reference:
     * Oracle Java Pattern Documentation:
     * https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
     *
     * @param cellphone cellphone number entered by the user
     * @return true if the cellphone number is correctly formatted
     */
    public boolean checkCellPhoneNumber(String cellphone) {

        return cellphone != null
                && cellphone.matches("^\\+27\\d{9}$");
    }

    /**
     * Registers the user after checking the username,
     * password and cellphone number.
     *
     * @param username username entered by the user
     * @param password password entered by the user
     * @param cellphone cellphone number entered by the user
     * @return appropriate registration message
     */
    public String registerUser(
            String username,
            String password,
            String cellphone) {

        if (!checkUserName(username)) {

            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";

        }

        if (!checkPasswordComplexity(password)) {

            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";

        }

        if (!checkCellPhoneNumber(cellphone)) {

            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";

        }

        this.userName = username;
        this.passWord = password;
        this.cellPhone = cellphone;

        return "Registration was a success";
    }
}
