import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class myJson {

    String name;
    String author;

    public myJson(String name, String author) {
        this.name = name;
        this.author = author;
    }


    public static void main(String[] args) {
        myJson objClass = new myJson("1One", "2Two") ;

        JSONObject object = new JSONObject();
        object.put("Name",objClass.name);
        object.put("Author", objClass.author);


        FileWriter file = null;
        try {
            file = new FileWriter("input.json");
            file.write(object.toJSONString());


        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("input.json"))
        {
            Object obj = jsonParser.parse(reader);

            JSONObject objList = (JSONObject) obj;
            System.out.println(objList);
            myJson myJson = parseObject(objList);

            myJson.author = "ChangedAuthor";
            myJson.name = "ChangedName";

            object = new JSONObject();
            object.put("Name", myJson.name);
            object.put("Author", myJson.author);
            try {
                file = new FileWriter("output.json");
                file.write(object.toJSONString());


            } catch (IOException e) {
                e.printStackTrace();

            } finally {

                try {
                    file.flush();
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static myJson parseObject(JSONObject object)
    {

        String Author = (String) object.get("Author");
        System.out.println(Author);

        String Name = (String) object.get("Name");
        System.out.println(Name);

        return new myJson(Name, Author);

    }

}