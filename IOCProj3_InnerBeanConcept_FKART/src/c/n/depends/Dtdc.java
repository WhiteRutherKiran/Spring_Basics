package c.n.depends;
import c.n.beans.Courier;

public class Dtdc implements Courier {

	@Override
	public String deliver(int OrderId) {
		return "Dtdc with id::"+OrderId;
	}

}
