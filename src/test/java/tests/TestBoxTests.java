package tests;

import org.junit.jupiter.api.Test;

public class TestBoxTests extends TestBase{
    @Test
    void TextBox() {
        textBoxPage.openPage()
                .setUserName("Nikita Postnikov")
                .setUserEmail("nikita.postnikov.00@gmail.com")
                .setCurrentAddress("Saint-Petersburg")
                .setPermanentAddress("Saint-Petersburg")
                .clickSubmit();

        textBoxPage.checkResultTextBox("Name:", "Nikita Postnikov")
                .checkResultTextBox("Email:", "nikita.postnikov.00@gmail.com")
                .checkResultTextBox("Current Address :", "Saint-Petersburg")
                .checkResultTextBox("Permananet Address :", "Saint-Petersburg");
    }
}
