package Lec_23;

public class Dynamic_Stack extends Stack {

	@Override
	public void add(int ali) {
		if(isFull()) {
			grow();
		}
		super.add(ali);
	}

	private void grow() {
		// TODO Auto-generated method stub
		int[] biggy = new int[arr.length*2];
		for(int i=0;i<=top;i++) {
			biggy[i] = arr[i];
		}
		arr = biggy;
	}
}
