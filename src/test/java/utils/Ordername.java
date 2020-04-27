package utils;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:56 2019/12/30
 **/
public class Ordername {
    public String aotuordername(String number){
        StringBuffer ordername = new StringBuffer("Autotest");
        return ordername.append(number).toString();
    }
}
