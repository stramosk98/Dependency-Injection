package D_injection;

import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Model.Produto;
import Enum.Caminho;

public class JSONProduto implements IProduto {

	@Override
	public void salvarDados(Produto produto) {
//		 JSONObject obj = new JSONObject();
       HashMap<String,Object> obj = new HashMap<String,Object>();
       obj.put("id", produto.getIdProduto());
       obj.put("nome", produto.getNomeProduto());
       obj.put("marca", produto.getIdMarca());
       obj.put("preco", produto.getPreco());
       
       JSONParser parser = new JSONParser();
       
       try (FileReader reader = new FileReader(Caminho.JSONPATH.getDescricao())) {
    	   Object obj2 = parser.parse(reader);
    	   
    	   JSONObject jsonObject = (JSONObject) obj2;
 
    	   JSONArray valores = (JSONArray) jsonObject.get("produtos");
    	   
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
