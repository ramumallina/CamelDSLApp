package com.javainuse;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:E:/inbox?noop=true").split().tokenize("\n").to("jms:queue:RahulChowdary");
		/*
		 * from("jms:queue:Gajini") .process(new Processor() { public void
		 * process(Exchange arg0) throws Exception {
		 * System.out.println("Body In Gajini Queue is:::"+arg0.getIn().getBody().
		 * toString()); } });
		 */
		/*
		 * from("activemq:AnchorSyamala") .process(new Processor() { public void
		 * process(Exchange arg0) throws Exception {
		 * System.out.println("Body is:::"+arg0.getIn().getBody().toString()); } });
		 */
    }

}