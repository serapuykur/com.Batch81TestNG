package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader<IOExceptione> {
    public static Properties properties;

    static {//her methoddan once calisir
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fis);//fisin okudugu bilgileri propertise yukledi

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key){
        /*
        test methodundan yolladigimiz string key degerini alip properties clasini n getProperty()
        methodunu kullanarak bu keye ait valuyu bize getirir
         */
        return properties.getProperty(key);

    }
}
