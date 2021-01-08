package sujetMaison;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class Service {

	
	public  List<List<Integer>> partition ( int [] list, int size ) {
		
		List<Integer> intList = new ArrayList<Integer>(list.length);
		for (int i : list)
		{
		    intList.add(i);
		}
		return	ListUtils.partition(intList, size);
		
		
		
	}
	
}
