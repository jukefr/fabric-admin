package org.jukefr.fabric_admin.config;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class UserConfig {
    Config config = ConfigFactory.load();
    int bar1 = config.getInt("foo.bar");
}
