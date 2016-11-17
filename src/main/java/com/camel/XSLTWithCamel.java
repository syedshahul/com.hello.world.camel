package com.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class XSLTWithCamel {
	   public static void main(String[] args) throws Exception {
	        CamelContext context = new DefaultCamelContext();

	        context.addRoutes(new RouteBuilder() {
	            public void configure() {
	                from("file:/home/osgi/Inbox?delete=true")
	                .to("xslt:file:/home/osgi/Inbox/xsl/tutorialtransform.xsl")
	                       // .to("sftp://shahul@172.17.18.212:22/home/shahul/Outbox/?password=Temp123&timeout=30000")
	                .to("file:/home/osgi/Inbox/Archive");
	            }
	        });

	        context.start();
	        Thread.sleep(70000);
	        context.stop();
	    }
}
