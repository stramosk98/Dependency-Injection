package D_injection;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Model.Produto;

public class XMLProduto implements IProduto {

	public void salvarDados(Produto produto) {
		try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = doc.createElement("exemplo");
            doc.appendChild(rootElement);

            Element idElement = doc.createElement("id");
            Element nomeElement = doc.createElement("nome");
            Element qtdElement = doc.createElement("quantidade");
           
            idElement.appendChild(doc.createTextNode(String.valueOf(produto.getIdProduto())));
            nomeElement.appendChild(doc.createTextNode(produto.getNomeProduto()));
//            qtdElement.appendChild(doc.createTextNode(String.valueOf(produto.getQuantidade())));
          
            rootElement.appendChild(idElement);
            rootElement.appendChild(nomeElement);
            rootElement.appendChild(qtdElement);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            File file = new File("C:\\Users\\anton\\OneDrive\\Área de Trabalho\\exemplo.xml");
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
