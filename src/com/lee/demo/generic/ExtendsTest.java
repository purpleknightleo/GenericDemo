package com.lee.demo.generic;
import java.util.ArrayList;
import java.util.List;

import com.lee.demo.generic.model.FlowStats;
import com.lee.demo.generic.model.Stats;

/**
 * ≤‚ ‘<? extends Foo>
 * 
 * @author hzlifan
 *
 */
public class ExtendsTest extends GenericTest {

	@Override
	public void test() {
		// testList();

		System.out.println("****************");

		testListOfList();
	}

	public void testList() {

		List<? extends Stats> list = getList();
		for (Stats stats : list) {
			if (stats instanceof FlowStats) {
				System.out.println("flow = " + ((FlowStats) stats).getFlow());
			}
		}
	}

	private List<? extends Stats> getList() {
		long timestamp = 12345L;

		List<FlowStats> flowList = new ArrayList<FlowStats>();
		flowList.add(new FlowStats(timestamp, 24d));
		flowList.add(new FlowStats(timestamp, 66d));

		return flowList;
	}


	public void testListOfList() {
		List<? extends List<? extends Stats>> list = getListArray();

		for (List<? extends Stats> statsList : list) {
			for (Stats stats : statsList) {
				System.out.println("flow = " + ((FlowStats) stats).getFlow());
			}
		}
	}

	private List<? extends List<? extends Stats>> getListArray() {
		long timestamp = 12345L;

		List<List<FlowStats>> flowStatsList = new ArrayList<List<FlowStats>>();

		List<FlowStats> flowList = new ArrayList<FlowStats>();
		flowList.add(new FlowStats(timestamp, 24d));
		flowList.add(new FlowStats(timestamp, 66d));
		flowStatsList.add(flowList);

		flowList = new ArrayList<FlowStats>();
		flowList.add(new FlowStats(timestamp, 8d));
		flowList.add(new FlowStats(timestamp, 13d));
		flowStatsList.add(flowList);

		return flowStatsList;
	}

}
