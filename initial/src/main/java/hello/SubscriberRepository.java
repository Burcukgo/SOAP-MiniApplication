package hello;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import io.spring.guides.gs_producing_web_service.Subscriber;

	@Component
	public class SubscriberRepository {
		private static final Map<Integer, Subscriber> subscribers = new HashMap<>();

		@PostConstruct
		public void initData() {
			Subscriber s= new Subscriber();
			s.setId(1);
			s.setName("Sinem");
			s.setMsisdn("5555");
		   subscribers.put(s.getId(), s);

			
		   Subscriber p = new Subscriber();
			p.setId(2);
			p.setName("burcu");
			p.setMsisdn("5555");
		   subscribers.put(p.getId(), p);
		   
		   
		   Subscriber t = new Subscriber();
			t.setId(3);
			t.setName("melis");
			t.setMsisdn("5555");
		   subscribers.put(t.getId(), t);
		   
		   
		}

		public Subscriber findSubscriber(int id) {
			Assert.notNull(id , "The subscriber's id must not be null");
			return subscribers.get(id);
		}
	}
