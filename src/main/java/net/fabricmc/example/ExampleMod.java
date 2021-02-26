package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.dao.LogDAO;
import net.fabricmc.example.dao.impl.LogDaoImpl;
import net.fabricmc.example.entity.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ExampleMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		LogDAO logDAO = new LogDaoImpl();

		Log log = new Log("this is a test log", new Date());

		int id = logDAO.createLog(log);

		System.out.println(id);

	}

}
