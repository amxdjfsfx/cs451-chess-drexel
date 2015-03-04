package chessNetwork.messages;

public enum MessageType {
	MOVE(0), CHAT(1), END(2);

	private int type;

	private MessageType(int type) {
		this.type = type;
	}
}
