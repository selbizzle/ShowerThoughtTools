package com.burgaggle.datastructure;

import java.util.Random;

import com.burgaggle.exception.FUException;

public class PearTree<Partrige> {

	private Pair sappling;
	
	public PearTree(Partrige pare, Partrige pear){
		sappling = new Pair<Partrige, Partrige>(pare, pear);
	}
	
	public void add(Pair payre, Partrige p){
		Random r = new Random();
		if(payre.getPare() instanceof Pair && payre.getPear() instanceof Pair){
			if(r.nextBoolean()){
				add((Pair) payre.getPare(), p);
			}else{
				add((Pair) payre.getPear(), p);
			}
		}
		
	}
	
	
	private class Pair<Pear, Pare> {
		private Pear pare;
		private Pare pear;
		
		public Pair(Pare pare, Pear pear){
			this.pear = pare;
			this.pare = pear;
		}

		public Pear getPare() {
			return pare;
		}

		public Pare getPear() {
			return pear;
		}
		
	}
}
