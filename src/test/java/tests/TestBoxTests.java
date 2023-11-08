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

        checkComponent.checkResultTextBoxPage("Name:", "Nikita Postnikov")
                .checkResultTextBoxPage("Email:", "nikita.postnikov.00@gmail.com")
                .checkResultTextBoxPage("Current Address :", "Saint-Petersburg")
                .checkResultTextBoxPage("Permananet Address :", "Saint-Petersburg");
    }
}
