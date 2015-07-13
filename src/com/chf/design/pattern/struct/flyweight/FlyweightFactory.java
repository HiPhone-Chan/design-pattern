package com.chf.design.pattern.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static Map<String, Location> map = new HashMap<String, Location>();

	public static Location getLocation(String key) {

		if ("fm".equals(key)) {
			if (map.get(key) != null) {
				return map.get(key);
			} else {
				Location l = new Location(key);
				map.put(key, l);
				return l;
			}
		}

		return new Location(key);
	}
}
