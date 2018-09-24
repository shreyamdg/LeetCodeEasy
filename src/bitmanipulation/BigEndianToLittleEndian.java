package bitmanipulation;

public class BigEndianToLittleEndian {
	private static byte[] intToLittleEndian(long numero) {
		byte[] b = new byte[4];
		b[0] = (byte) (numero & 0xFF);
		b[1] = (byte) ((numero >> 8) & 0xFF);
		b[2] = (byte) ((numero >> 16) & 0xFF);
		b[3] = (byte) ((numero >> 24) & 0xFF);
		return b;
	}
}
