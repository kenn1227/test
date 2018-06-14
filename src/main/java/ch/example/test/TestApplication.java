package ch.example.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ch.example.test.util.SignalHandlerExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		Log log=LogFactory.getLog(SignalHandlerExample.class);
		SpringApplication.run(TestApplication.class, args);

		SignalHandlerExample mySignalHandler = new SignalHandlerExample();
		while ( mySignalHandler.getRunningStatus() ) {
			log.info("waiting");
			mySignalHandler.myWait();
			log.info("woken up");
		}
	}
}
