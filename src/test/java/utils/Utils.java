package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class Utils {
    public Properties showConfig(){
        InputStream in = Utils.class.getClassLoader().getResourceAsStream("info.properties");
        Properties props = new Properties();
        try {
            //props.load(in);
            //props.load(new InputSteam);
            props.load(new InputStreamReader(in, "utf-8"));
        } catch (IOException e){
            e.printStackTrace();
        }
        return props;
    }

    public String changeEncode(String stringCode){
        try {
            stringCode = new String(stringCode.getBytes("utf-8"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return stringCode;
    }
}
