/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package poepartone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Student
 */
public class MessagesTest {

    @Test
    public void testGenerateMessageID() {

        Messages msg = new Messages();

        String messageID = msg.generateMessageID();

        assertNotNull(messageID);
        assertEquals(10, messageID.length());
    }

    @Test
    public void testGenerateUniqueMessageIDs() {

        Messages msg = new Messages();

        String firstID = msg.generateMessageID();
        String secondID = msg.generateMessageID();

        assertNotEquals(firstID, secondID);
    }

    @Test
    public void testValidLocalCellNumber() {

        Messages msg = new Messages();

        assertEquals(
                "Valid number",
                msg.checkRecipientCell("0821234567")
        );
    }

    @Test
    public void testValidInternationalCellNumber() {

        Messages msg = new Messages();

        assertEquals(
                "Valid number",
                msg.checkRecipientCell("+27821234567")
        );
    }

    @Test
    public void testInvalidCellNumber() {

        Messages msg = new Messages();

        assertEquals(
                "Invalid number.",
                msg.checkRecipientCell("12345")
        );
    }

    @Test
    public void testCellNumberWithLetters() {

        Messages msg = new Messages();

        assertEquals(
                "Invalid number.",
                msg.checkRecipientCell("abcdefghij")
        );
    }

    @Test
    public void testCreateMessageHash() {

        Messages msg = new Messages();

        String hash = msg.createMessageHash(
                "1234567890",
                1,
                "Hello World"
        );

        assertEquals("12:1:HELLOWORLD", hash);
    }

    @Test
    public void testCreateMessageHashOneWord() {

        Messages msg = new Messages();

        String hash = msg.createMessageHash(
                "9876543210",
                2,
                "Hello"
        );

        assertEquals("98:2:HELLOHELLO", hash);
    }

    @Test
    public void testReturnTotalMessagesInitiallyZero() {

        Messages msg = new Messages();

        assertEquals(0, msg.returnTotalMessages());
    }

    @Test
    public void testPrintMessagesWhenEmpty() {

        Messages msg = new Messages();

        String result = msg.printMessages();

        assertEquals("", result);
    }
}
