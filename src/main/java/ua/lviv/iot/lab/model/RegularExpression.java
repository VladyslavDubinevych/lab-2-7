package ua.lviv.iot.lab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegularExpression {

    private String text;

    public String findRegularExpressionInText() {
        String regex = "(([A-Za-z]+\\s+[A-Za-z]+)|\\w)+\\,+\\s+str+\\.+\\s+\\w+\\,+\\s+((\\d+[a-zA-Z])|\\d+)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(this.text);
        return m.replaceAll("ADDRESS");
    }

}
