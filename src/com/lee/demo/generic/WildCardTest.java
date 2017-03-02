package com.lee.demo.generic;
import java.util.ArrayList;
import java.util.List;

import com.lee.demo.generic.model.FlowStats;

/**
 * 测试<?>，其实<?>等价于<? extends Object>
 * 
 * @author hzlifan
 *
 */
public class WildCardTest extends GenericTest {

	@Override
	public void test() {
		testList();

		System.out.println("****************");

		testListOfList();
	}

	public void testList() {

		List<?> list = getList();
		for (Object stats : list) {
			if (stats instanceof FlowStats) {
				System.out.println("flow = " + ((FlowStats) stats).getFlow());
			}
		}
	}

	private List<?> getList() {
		long timestamp = 12345L;

		List<FlowStats> flowList = new ArrayList<FlowStats>();
		flowList.add(new FlowStats(timestamp, 24d));
		flowList.add(new FlowStats(timestamp, 67d));

		return flowList;
	}

	public void testListOfList() {

	}

}
