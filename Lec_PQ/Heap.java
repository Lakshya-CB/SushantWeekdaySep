package Lec_PQ;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> AL;

	public boolean isEmpty() {
		return AL.isEmpty();
	}

	public int size() {
		return AL.size();
	}

	public void add(int ali) { // log(n)
		AL.add(ali);
//		I ensured ki CBT condition is still satifyiung
		upheapify(AL.size() - 1);
	}

	private void upheapify(int child) {
		int p = (child - 1) / 2;
		if (AL.get(p) > AL.get(child)) {
			swap(p, child);
			upheapify(p);
		}
	}

	private void swap(int p, int child) {
		int temp = AL.get(p);
		AL.set(p, AL.get(child));
		AL.set(child, temp);
	}

	public int poll() {
		int ans = AL.get(0);
		int ali = AL.remove(AL.size() - 1);
		AL.set(0, ali);
		downHeapify(0);
		return ans;
	}

	private void downHeapify(int p) {
		int L = 2 * p + 1;
		int R = 2 * p + 2;
		int best = p;
		if (L < AL.size() && AL.get(L) < AL.get(best)) {
			best = L;
		}
		if (R < AL.size() && AL.get(R) < AL.get(best)) {
			best = R;
		}
		if (best != p) {
			swap(p, best);
			downHeapify(best);
		}
	}
}
