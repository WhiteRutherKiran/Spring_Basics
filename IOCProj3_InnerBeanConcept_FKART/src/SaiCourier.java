import c.n.beans.Courier;

public class SaiCourier implements Courier {

	@Override
	public String deliver(int OrderId) {
		return "SaiCourier with id::"+OrderId;
	}

}
