package com.lxl.xmlParse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;



public class XmlParseByDom4j {

	/**
	 * @param args
	 */
//	public static void writeXmlByDom4j(){
		//创建一个新文档
//		Document DOC = DocumentHelper.createDocument();
//		//建立各个节点
//		Element addresslist = DOC.addElement("addresslist");
//		Element linkman = addresslist.addElement("linkman");
//		Element name = linkman.addElement("name");
//		Element email = linkman.addElement("email");
//		name.setText("小明");
//		email.setText("lxl@qq.com");
//		//输出
//		OutputFormat format = OutputFormat.createPrettyPrint();
//		format.setEncoding("UTF-8");
//		try{
//			XMLWriter writer = new XMLWriter(new FileOutputStream(new File("C:\\work\\github\\zyc\\src\\com\\lxl\\xmlParse\\TestForWriteXml.xml")),format);
//			writer.write(DOC);
//			writer.close();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//	}
//	
//	public static void readXmlByDom4j(){
//		File file = new File("C:\\work\\github\\zyc\\src\\com\\lxl\\xmlParse\\TestForWriteXml.xml");
//		//建立sax解析
//		SAXReader reader = new SAXReader();
//		Document doc = null;
//		try{
//			doc = reader.read(file);
//		}catch(DocumentException e){
//			e.printStackTrace();
//		}
//		//取得根元素
//		Element root = doc.getRootElement();
//		//取得全部子元素
//		Iterator iter = root.elementIterator();
//		while(iter.hasNext()){
//			Element linkman = (Element) iter.next();
//			System.out.println("用户："+linkman.elementText("name")+" 邮箱："+linkman.elementText("email"));
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		writeXmlByDom4j();
//		readXmlByDom4j();
//	}

}
