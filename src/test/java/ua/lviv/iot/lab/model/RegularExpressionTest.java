package ua.lviv.iot.lab.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegularExpressionTest {

    private RegularExpression expression;

    @BeforeEach
    void setUp() {
        expression = new RegularExpression();
    }

    @AfterEach
    void tearDown()  {
    }

    @Test
    void findRegularExpressionInTextTest() {
        expression.setText("TEXT, str. TEXT, 123C; Lviv, str. Naukova, 7a" +
                "/// Kryvyi Rih, str. sth, 228-9 Lv7 ase, str. swq, 69QB");
        String expected = "ADDRESS; ADDRESS/// ADDRESS-9 Lv7 ADDRESSB";
        Assertions.assertEquals(expected, expression.findRegularExpressionInText());
    }

}
