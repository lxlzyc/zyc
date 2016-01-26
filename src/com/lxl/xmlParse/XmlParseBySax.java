package com.lxl.xmlParse;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlParseBySax extends DefaultHandler{

	/**
	 * @param args
	 * sax 解析器
	 */
	//文档开始
	public void startDocument() throws SAXException {
		System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	}
	//文档结束
	public void endDocument() throws SAXException {
		System.out.println("\n 文档读取结束。。。");
	}
	//元素开始
	public void startElement(String uri, String localName, String name, Attributes attributes)throws SAXException{
		System.out.println("<");
		//输出元素名称
		System.out.println(name);
		//取得全部属性
		if(attributes != null){
			for(int x = 0; x<attributes.getLength();x++){
				System.out.println(" "+attributes.getQName(x)+"=\""+attributes.getValue(x+"\""));
			}
		}
		System.out.println(">");
	}
	public void characters(char[] ch, int start, int length) throws SAXException{
		//取得元素内容并输出
		System.out.println(new String(ch,start,length));
	}
	public void endElement(String uri, String localName, String name) throws SAXException{
		System.out.println("</");
		System.out.println(name);
		System.out.println(">");
	}
	/**
	 * 解析器结束
	 * @param args
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	
	public static void SaxUse() throws ParserConfigurationException, SAXException, IOException{
		//建立sax解析工厂类
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//构造解析器
		SAXParser parser = factory.newSAXParser();
		//解析xml  使用解析
		parser.parse("C:\\work\\github\\zyc\\src\\com\\lxl\\xmlParse\\TestForWriteXml.xml", new XmlParseBySax());
	}
	
	
	
	
	
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		SaxUse();
	}

}
