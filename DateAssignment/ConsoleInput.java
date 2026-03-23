public class ConsoleInput {
		
	static String getString(){
		try {	
		byte[] input = new byte[100];
		int length = System.in.read(input);
		byte[] finalOut = new byte[length-2];
		System.arraycopy(input, 0, finalOut, 0, length-2);
		String objString = new String(finalOut);
		return objString;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;	
	}
	
	static int getInt() {
		return Integer.parseInt(getString());
	}
	static float getFloat() {
		return Float.parseFloat(getString());
	}
}