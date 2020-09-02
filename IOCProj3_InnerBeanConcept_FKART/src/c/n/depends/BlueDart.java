package c.n.depends;
import c.n.beans.Courier;

public class BlueDart implements Courier {

	@Override
	public String deliver(int OrderId) {
		return "Bluedart with id::"+OrderId;
	}

}
