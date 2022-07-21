package pages;

import io.restassured.path.json.JsonPath;

public class RcbPlayers {

	public static int foreignPlayer(JsonPath js) {
		int totalPlayers = js.getInt("player.size()");

		int Count = 0;
		for (int i = 0; i < totalPlayers; i++) {
			if (!(js.get("player[" + i + "].country").toString().equalsIgnoreCase("India"))) {

				Count++;
			}

		}
		return Count;

	}

	public static boolean wicketKeeper(JsonPath js) {
		int totalPlayers = js.getInt("player.size()");

		int count = 0;
		for (int i = 0; i < totalPlayers; i++) {
			if ((js.get("player[" + i + "].role").toString().equalsIgnoreCase("wicket-keeper"))) {

				count++;
			}

		}
		if (count >= 1) {
			return true;
		} else
			return false;

	}
}
