package net.chrisrichardson.eventstore.examples.customersandorders.orders.history.querysideservice;

import io.eventuate.javaclient.spring.httpstomp.EventuateHttpStompClientConfiguration;
import net.chrisrichardson.eventstore.examples.customersandorders.commonswagger.CommonSwaggerConfiguration;
import net.chrisrichardson.eventstore.examples.customersandorders.orders.web.OrderHistoryWebConfiguration;
import net.chrisrichardson.eventstore.examples.customersandorders.views.orderhistory.OrderHistoryViewConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({OrderHistoryWebConfiguration.class, EventuateHttpStompClientConfiguration.class, CommonSwaggerConfiguration.class})
@EnableAutoConfiguration
@ComponentScan
public class OrderHistoryQuerySideServiceConfiguration {
}
