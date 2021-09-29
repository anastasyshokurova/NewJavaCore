package HW6;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;

public class UrlConnectionExamples {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https", "gb.ru", "/");
        InputStream in = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);
        }

        bufferedReader.close();

        URL url1 = new URL("https://restful-booker.herokuapp.com/auth");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url1.openConnection();

        httpsURLConnection.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);

        String requestBody = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        try (BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(httpsURLConnection.getOutputStream()))){
            bufferedWriter.write(requestBody);
        }
        BufferedReader bufferedReader1 = new BufferedReader( new InputStreamReader((httpsURLConnection.getInputStream())));
        String temp;

        while ((temp = bufferedReader1.readLine()) != null) {
            System.out.println(temp);
        }

    }
}
