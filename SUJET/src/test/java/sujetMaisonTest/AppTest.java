package sujetMaisonTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

import org.junit.jupiter.api.Test;

import sujetMaison.Service;

public class AppTest {
	
	
	Service service = new Service();
	
	int [] array= {1,2,3,4,5};

    @Test
    public void test1() {  	
    	List<List<Integer>> list = service.partition(array, 1);    	
    	assertEquals(list.toString(), "[[1], [2], [3], [4], [5]]");
    }
    
    @Test
    public void test2() {
    	List<List<Integer>> list = service.partition(array, 2);
    	assertEquals(list.toString(), "[[1, 2], [3, 4], [5]]");
    }
    
    @Test
    public void test3() {
    	List<List<Integer>> list = service.partition(array, 3);
    	assertEquals(list.toString(), "[[1, 2, 3], [4, 5]]");
    }
    

}
