package D_injection;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Enum.Caminho;
import Model.Marca;

public class JSONMarca {
	
	public void salvarDados(Marca marca) {
		 JSONObject obj = new JSONObject();
//       HashMap<String,Object> obj = new HashMap<String,Object>();
       obj.put("id", marca.getIdMarca());
       obj.put("nome", marca.getNomeMarca());
       
       JSONParser parser = new JSONParser();
       
       try (FileReader reader = new FileReader(Caminho.JSONPATH.getDescricao())) {
    	   Object obj2 = parser.parse(reader);
    	   
    	   JSONObject jsonObject = (JSONObject) obj2;
 
    	   JSONArray valores = (JSONArray) jsonObject.get("marcas");
    	   
    	   valores.add(obj.toString());
    	   try (FileWriter file = new FileWriter(Caminho.JSONPATH.getDescricao())) {
               file.write(jsonObject.toJSONString());
               file.flush();
    	   }

       } catch (IOException | ParseException e) {
           e.printStackTrace();
       }
   }
}
