import org.example.RegEx;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RegExTest {
    RegEx regex = new RegEx();

    @Test
    public void testFirstName() {
        boolean result = regex.isFirstNameCorrect("Lokesh", "[A-Z]{1}[a-z]{2,}");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testLastName() {
        boolean result = regex.isLastNameCorrect("Kumar", "[A-Z]{1}[a-z]{2,}");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testEmail() {
        boolean result = regex.isEmailCorrect("abc.lokesh@bl.com", "abc[.A-Za-z0-9_+-]*@[a-z0-9]+.[a-z]+[.a-z]*");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPhone() {
        boolean result = regex.isPhoneCorrect("91 9677595842", "\\d{1,3}\\s\\d{10}");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPassword() {
        boolean result = regex.isPasswordCorrect("Lokesh@98", "([A-Z]+[a-z]*[@_][0-9]+)");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testHappy() {
        String mood = regex.analyseMood("This is happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void testSad() {
        String mood = regex.analyseMood("This is sad message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));

    }

    @ParameterizedTest
    @CsvSource({"abc.lokesh@gmail.com, true", "abc@@.com, false"})
    public void testAllEmail(String email, boolean expected) {
        boolean result = regex.isEmailCorrect(email, "abc[.A-Za-z0-9_+-]*@[a-z0-9]+.[a-z]+[.a-z]*");
        Assert.assertEquals(expected, result);
    }

}
