package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel{

    public String getMessage() {
        try (FileReader fr = new FileReader(Model.class.getResource("message.txt").getFile());
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "Unread file";
        }
    }
}
