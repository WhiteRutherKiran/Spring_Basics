import c.n.beans.Courier;

public class First_Flight implements Courier {

	@Override
	public String deliver(int OrderId) {
		return "First_Flight with id::"+OrderId;
	}

}
