package com.macbook.org;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jsonfilereading
{
    public static void main(String[] args) throws IOException, ParseException {
        //creating object on json
        JSONParser jsonParser=new JSONParser();
        //parsing  the content of the json file
        JSONObject jsonObject =(JSONObject) jsonParser.parse(new FileReader("C:\\Users\\Sai Jyothi\\Documents\\apache-maven-3.8.7-bin\\apache-maven-3.8.7\\macbook\\src\\test\\java\\json\\json file"));
        String id=(String) jsonObject.get("EmployeeID");
        String FirstName=(String) jsonObject.get("FirstName");
        String LastName=(String) jsonObject.get("LastName");
        String country=(String) jsonObject.get("country");

        System.out.println("final data in the console");
        System.out.println(id);
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(country);







    }
}
