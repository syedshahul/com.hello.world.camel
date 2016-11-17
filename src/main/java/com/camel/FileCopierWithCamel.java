package com.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by osgi on 7/11/16.
 */
public class FileCopierWithCamel {
    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("sftp://shahul@172.17.18.212:22/home/shahul/Inbox/?password=Temp123&timeout=30000&delete=true")
                        .to("sftp://shahul@172.17.18.212:22/home/shahul/Outbox/?password=Temp123&timeout=30000")
                .to("sftp://shahul@172.17.18.212:22/home/shahul/Inbox/Archive/?password=Temp123&timeout=30000");
            }
        });

        context.start();
        Thread.sleep(70000);
        context.stop();
    }
}
