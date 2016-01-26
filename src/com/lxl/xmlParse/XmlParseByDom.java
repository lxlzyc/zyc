package com.lxl.xmlParse;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlParseByDom {

	/**
	 * @param args
	 */
	//xml读取方式
	private static DocumentBuilderFactory DBF = DocumentBuilderFactory.newInstance();
	private static DocumentBuilder DB = null;
	private static Document DOC = null;
	
	//xml写入方式
	private static TransformerFactory TF = TransformerFactory.newInstance();
	private static Transformer T = null;
	
	public static void readXmlByDom(){
		try{
			DB = DBF.newDocumentBuilder();
			DOC = DB.parse("C:\\work\\github\\zyc\\src\\com\\lxl\\xmlParse\\TestForWriteXml.xml");
			//取到name节点的nodelist
			NodeList nl = DOC.getElementsByTagName("name");
			//取到name节点下的第一个子节点的第一个文本节点的value
			System.out.println("第一个姓名："+nl.item(0).getFirstChild().getNodeValue());
		}catch(ParserConfigurationException e){
			e.printStackTrace();
		}catch(SAXException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void writeXmlByDom(){
		try{
			DB = DBF.newDocumentBuilder();
		}catch(ParserConfigurationException e){
			e.printStackTrace();
		}
		//创建一个新文档
		DOC = DB.newDocument();
		//建立各个节点
		Element addresslist = DOC.createElement("addresslist");
		Element linkman = DOC.createElement("linkman");
		Element name = DOC.createElement("name");
		Element id = DOC.createElement("id");
		//设置节点的文本内容
		name.appendChild(DOC.createTextNode("li"));
		id.appendChild(DOC.createTextNode("001"));
		//设置节点关系
		linkman.appendChild(name);
		linkman.appendChild(id);
		addresslist.appendChild(linkman);
		DOC.appendChild(addresslist);
		//输出到文档
		try{
			T = TF.newTransformer();
		}catch(TransformerConfigurationException e ){
			e.printStackTrace();
		}
		//设置编码格式
		T.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		//输出文档
		DOMSource source = new DOMSource(DOC);
		StreamResult result = new StreamResult(new File("C:\\work\\github\\zyc\\src\\com\\lxl\\xmlParse\\TestForWriteXml.xml"));
		
		try{
			T.transform(source, result);
		}catch(TransformerException e){
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeXmlByDom();
		readXmlByDom();
		
	}

}
