package com.med.med.utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Ping {
    public String getStatus(String url, String user_key) throws IOException {

        String result = "";
        int code = 200;
        try {
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(3000);
            connection.setRequestProperty("User-Agent",user_key);
            connection.connect();

            code = connection.getResponseCode();
            if (code == 200) {
                result = "-> Green <-\t" + "Code: " + code;
                ;
            } else {
                result = "-> Yellow <-\t" + "Code: " + code;
            }
        } catch (Exception e) {
            result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();

        }
        System.out.println(url + "\t\tStatus:" + result);
        return result;
    }

}
