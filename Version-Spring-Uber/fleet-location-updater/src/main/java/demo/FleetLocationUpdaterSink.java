package demo;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */


import demo.service.ServiceLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import demo.model.CurrentPosition;

/**
 * Spring Cloud Stream {@link Sink}, responsible for sending current position data to
 * connected Websocket clients.
 *
 *
 *
 */
@MessageEndpoint
@EnableBinding(Sink.class)
public class FleetLocationUpdaterSink {

    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ServiceLocationService serviceLocationService;

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void updateLocationaddServiceLocations(String input) throws Exception {

        CurrentPosition payload = this.objectMapper.readValue(input, CurrentPosition.class);

//		serviceLocationService.updateServiceLocations(payload);

        this.template.convertAndSend("/topic/vehicles", payload);
    }

}
