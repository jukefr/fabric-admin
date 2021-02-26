package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.schemas.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExampleMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		Log log = new Log();
		log.setMessage("this is a test log");
		log.setTimestamp(System.currentTimeMillis());

		SessionFactory sessionFactory = buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("1");
		System.out.println(log.getMessage() + log.getTimestamp());
		session.save(log);
		System.out.println("2");

		Log savedLog = session.get(Log.class, 1);

		System.out.println(savedLog);

		session.close();
		sessionFactory.close();

	}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
				.configure()
				.addAnnotatedClass(Log.class)
				.buildSessionFactory();
	}
}
