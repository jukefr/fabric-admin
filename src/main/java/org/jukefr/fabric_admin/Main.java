package org.jukefr.fabric_admin;

import net.fabricmc.api.ModInitializer;
import org.jukefr.fabric_admin.dao.LogDAO;
import org.jukefr.fabric_admin.dao.impl.LogDaoImpl;
import org.jukefr.fabric_admin.entity.Log;

import java.util.Date;

public class Main implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		LogDAO logDAO = new LogDaoImpl();

		Log log = new Log("this is a test log", new Date());

		Integer id = logDAO.createLog(log);

		System.out.println(id);

	}

}
