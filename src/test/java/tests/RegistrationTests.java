package tests;

import org.junit.jupiter.api.Test;

public class RegistrationTests extends TestBase {
    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .setFirstName("Nikita")
                .setLastName("Postnikov")
                .setEmail("nikita.postnikov.00@gmail.com")
                .setGender("Male")
                .setUserNumber("1234567890")
                .setDateOfBirth("10", "September", "2023")
                .setSubjects("Maths")
                .upLoadPictureInput("qwe.png")
                .selectHobbies("Sports")
                .setCurrentAddress("Address")
                .selectStateCity("NCR", "Delhi")
                .submit();

        registrationPage.checkResult("Student Name", "Nikita Postnikov")
                .checkResult("Student Email", "nikita.postnikov.00@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "10 September,2023")
                .checkResult("Subjects", "Maths")
                .checkResult("Hobbies", "Sports")
                .checkResult("Address", "Address")
                .checkResult("State and City", "NCR Delhi");
    }
}