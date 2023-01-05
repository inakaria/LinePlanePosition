package org.example;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Random;
 

public class WriteJSON {
    public static void write(String line, String eq1, String plane, String eq2, String answer, String a) {
        Random rand = new Random();
        int int_random = rand.nextInt((99999 - 10001) + 1) + 10001;

        JSONObject inDetails = new JSONObject();
        inDetails.put(line, eq1);
        inDetails.put(plane, eq2);
         
        JSONObject inObject = new JSONObject(); 
        inObject.put("in", inDetails);

        JSONObject outDetails = new JSONObject();
        outDetails.put(answer, a);
         
        JSONObject outObject = new JSONObject(); 
        outObject.put("out", outDetails);
        
        JSONArray elemList = new JSONArray();
        elemList.add(inObject);
        elemList.add(outObject);
        
        try (FileWriter file = new FileWriter("output" + Integer.toString(int_random) + ".json")) {
            file.write(elemList.toJSONString()); 
            file.flush();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
