package com.lxl.xmlParse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.jdom2.output.support.XMLOutputProcessor;


public class XmlParseByJDom {

	/**
	 * @param args
	 */
	public static void writeXmlByJDom(){
		//建立各个节点
		Element addresslist = new Element("addresslist");
		Element linkman = new Element("linkman");
		Element name = new Element("name");
		Element id = new Element("id");
		Attribute email = new Attribute("email", "lxl@qq.com");
		Document doc = new Document(addresslist);
		name.setText("nameLi");
		id.setText("001");
		name.setAttribute(email);
		linkman.addContent(name);
		linkman.addContent(id);
		addresslist.addContent(linkman);
		//输出xml文件
		XMLOutputter out = new XMLOutputter();
		out.setFormat(out.getFormat().setEncoding("UTF-8"));
		try{
			out.output(doc, new FileOutputStream("C:\\work\\github\\zyc\\src\\com\\lxl\\xmlParse\\TestForWriteXml.xml"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void readXmlByJdom() throws JDOMException, IOException{
		//建立sax解析
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build("C:\\work\\github\\zyc\\src\\com\\lxl\\xmlParse\\TestForWriteXml.xml");
		//取到根元素
		Element stu = doc.getRootElement();
		List list = stu.getChildren("linkman");
		for(int i = 0; i<list.size();i++){
			Element e = (Element)list.get(i);
			String name = e.getChildText("name");
			String email = e.getChild("name").getAttribute("email").getValue();
			System.out.println("用户："+name+" 邮箱："+email);
		}
		
		
	}
	
	public static void main(String[] args) throws JDOMException, IOException {
		// TODO Auto-generated method stub
		writeXmlByJDom();
		readXmlByJdom();
	}

}
