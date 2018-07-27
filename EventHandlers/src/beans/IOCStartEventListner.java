package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IOCStartEventListner implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent cse) {
		// TODO Auto-generated method stub
		
		System.out.println(" On IOC start ... method");
		
	}
}
