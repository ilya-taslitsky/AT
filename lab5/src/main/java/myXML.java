import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class myXML
{
    public String name;
    public int runtime;
    public String directors;
    public int released;
    public String cast;
    public myXML(){}

    public myXML(String name, int runtime, String directors,int released, String cast) {
        this.name = name;
        this.runtime = runtime;
        this.directors = directors;
        this.released = released;
        this.cast = cast;
    }
    public static myXML DeserializeFromXML(String SERIALIZED_FILE_NAME ) {

        XMLDecoder decoder=null;
        try {
            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File dvd.xml not found");
        }
        myXML bourneSeries=(myXML)decoder.readObject();
        System.out.println(bourneSeries);
        return bourneSeries;
    }
    public static void SerializeToXML(String SERIALIZED_FILE_NAME, myXML object) {

        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));
        }catch(FileNotFoundException fileNotFound){
        }
        encoder.writeObject(object);
        encoder.close();

    }

    public static void main(String[] args)
    {
        myXML object=new myXML("The Bourne Identity",119,"Doug Liman",2002,"Matt Damon, Franka Potente");

        SerializeToXML("input.xml", object);
        myXML xml = DeserializeFromXML("input.xml");
        xml.cast = "NewCast";
        xml.directors="NewDirectors";
        xml.name = "NewName";
        SerializeToXML("output.xml", xml);
    }
}
