package rcbTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import pages.RcbPlayers;
import resource.RcbResponse;
import utill.RcbUtil;

public class RcbPlayerTest {
	 JsonPath js;

	@BeforeClass
	public void getResponse() {
		String res = RcbResponse.response();
		js = RcbUtil.rawToJson(res);
		

	}

	@Test(priority=1)
	public void foreignPlayerTest() {
		int foreignCount = RcbPlayers.foreignPlayer(js);

		Assert.assertEquals(foreignCount, 4, "Only 4 foreign players");
	}

	@Test(priority=2)
	public void wicketKeeperTest() {
		boolean wicketKeeperCondition = RcbPlayers.wicketKeeper(js);
		Assert.assertTrue(false, "At least one Wicket Keeper");
	}

}
