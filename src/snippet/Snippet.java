package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<web-app version="3.0" 
		xmlns="http://java.sun.com/xml/ns/javaee" 
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
		http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">
	  <display-name></display-name>	
	  
	  <!-- 数据源配置 -->
	  <resource-ref>
	  	<description>DB Connection</description>
	  	<res-ref-name>jdbc/test</res-ref-name>
	  	<res-type>javax.sql.DataSource</res-type>
	  	<res-auth>Container</res-auth>
	  </resource-ref>
	  <!-- 配置session超时时间  默认30分钟 单位分钟 -->
	  <session-config>
	  	<session-timeout>5</session-timeout>
	  </session-config>
	  <!-- 先配置过滤器 再配置监听器 再配置普通servlet -->
	  
	  <!-- 过滤器配置  -->
	  <filter>
	  	<filter-name>SimpleFilter</filter-name>
	  	<filter-class>com.lxl.servlet.fiter.SimpleFilter</filter-class>
	  	<!-- 过滤器初始参数设置 本例设置字符为utf-8 -->
	  	<init-param>
	  		<param-name>charset</param-name>
	  		<param-value>UTF-8</param-value>
	  	</init-param>
	  </filter> 
	  <!-- 过滤器过滤内容配置  可以定义多个filter-mapping-->
	  <filter-mapping>
	  	<filter-name>SimpleFilter</filter-name>
	  	<url-pattern>/jsp/*</url-pattern>
	  </filter-mapping>
	  
	  <!-- 监听器配置 -->
	  <listener>
	  	<listener-class>
	  		com.lxl.servlet.listener.SimpleAppListener
	  	</listener-class>
	  </listener>
	  <listener>
	  	<listener-class>
	  		com.lxl.servlet.listener.SimpleAttrListener
	  	</listener-class>
	  </listener>
	  <listener>
	  	<listener-class>
	  		com.lxl.servlet.listener.SimpleSessListener
	  	</listener-class>
	  </listener>
	  <listener>
	  	<listener-class>
	  		com.lxl.servlet.listener.SimpleSessAttrListener
	  	</listener-class>
	  </listener>
	  <listener>
	  	<listener-class>
	  		com.lxl.servlet.listener.SimpleReqAttrListener
	  	</listener-class>
	  </listener>
	  <listener>
	  	<listener-class>
	  		com.lxl.servlet.listener.SimpleReqListener
	  	</listener-class>
	  </listener>  
	  <!-- servlet 配置 -->
	  <servlet>
	  	<servlet-name>testServlet</servlet-name>
	  	<servlet-class>com.lxl.servlet.TestServlet</servlet-class>
	  </servlet>
	  <servlet-mapping>
	  	<servlet-name>testServlet</servlet-name>
	  	<url-pattern>/testServlet</url-pattern>
	  </servlet-mapping>
	   <servlet>
	  	<servlet-name>loginServlet</servlet-name>
	  	<servlet-class>com.lxl.servlet.LoginServlet</servlet-class>
	  	<!-- web容器启动时servlet自动初始化 <load-on-startup>1</load-on-startup> -->
	  </servlet>
	  <servlet-mapping>
	  	<servlet-name>loginServlet</servlet-name>
	  	<url-pattern>/loginServlet</url-pattern>
	  </servlet-mapping>
	  
	  <!-- 错误页 配置 
	  <error-page>
	  	<error-code>500</error-code>
	  	<location>/jsp/error.jsp</location>
	  </error-page>
	  <error-page>
	  	<error-code>404</error-code>
	  	<location>/jsp/error.jsp</location>
	  </error-page>
	  -->
	
	  <welcome-file-list>
	    <welcome-file>login.jsp</welcome-file>
	  </welcome-file-list>
	</web-app>
	
}

