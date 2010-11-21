import java.net.DatagramPacket;


public interface MessageListener {
	public void onMessageReceive(DatagramPacket packet);
}
