package com.lee.demo.generic;
import java.util.ArrayList;
import java.util.List;

import com.lee.demo.generic.model.BandStats;
import com.lee.demo.generic.model.FlowStats;
import com.lee.demo.generic.model.Stats;

/**
 * ≤‚ ‘<? super Foo>
 * 
 * @author hzlifan
 *
 */
public class SuperTest extends GenericTest {

	@Override
	public void test() {
		testList();

		System.out.println("****************");

		testListOfList();
	}

	private void testList() {
		long timestamp = 12345L;

		List<? super Stats> list = new ArrayList<Stats>();
		list.add(new FlowStats(timestamp, 24d));
		list.add(new BandStats(timestamp, 8d));

		for (Object obj : list) {
			if (obj instanceof FlowStats) {
				System.out.println("flow = " + ((FlowStats) obj).getFlow());
			} else if (obj instanceof BandStats) {
				System.out.println("band = " + ((BandStats) obj).getBand());
			}
		}

	}

	private void testListOfList() {

	}
	
}
