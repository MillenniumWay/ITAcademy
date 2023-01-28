package HomeWork3;

import java.util.regex.Pattern;

public class EmailValid implements Validator{
    public static final Pattern k = Pattern.compile("\\w+([\\.-]?[\\w]+)@[a-z]+\\.[a-z]+");

    @Override
    public Pattern getPattern() {
        return k;
    }

}

