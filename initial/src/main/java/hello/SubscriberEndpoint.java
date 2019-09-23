package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetSubscriberResponse;
import io.spring.guides.gs_producing_web_service.GetSubscriberById;

@Endpoint
public class SubscriberEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private SubscriberRepository subscriberRepository;

	@Autowired
	public SubscriberEndpoint(SubscriberRepository subscriberRepository) {
		this.subscriberRepository = subscriberRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSubscriberById")
	@ResponsePayload
	public GetSubscriberResponse getSubscriber(@RequestPayload GetSubscriberById request) {
		GetSubscriberResponse response = new GetSubscriberResponse();
		response.setSubscriber(subscriberRepository.findSubscriber(request.getId()));

		return response;
	}
}