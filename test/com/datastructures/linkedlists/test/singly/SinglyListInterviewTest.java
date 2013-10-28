package com.datastructures.linkedlists.test.singly;

import static org.junit.Assert.*;

import java.awt.Cursor;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.datastructures.linkedlists.exception.LinkedListEmptyException;
import com.datastructures.linkedlists.implementation.SinglyLinkedList;
import com.datastructures.linkedlists.interfaces.ISinglyList;
import com.datastructures.linkedlists.nodes.SNode;

public class SinglyListInterviewTest
{
    
    private ISinglyList<Integer> testList = new SinglyLinkedList<Integer>();
    
    @Before
    public void setUp() throws Exception
    {
	/**
	 * Empty Implementation.
	 */
    }

    @After
    public void tearDown() throws Exception
    {
	while (!testList.isEmpty())
	{
	    testList.removeFirst();
	}
    }

    /**
     * Implement a method to remove duplicated nodes from a singly linked list.
     * TODO : How would you do it if temporary buffer is not allowed.
     */
    @Test
    public void removeDuplicated()
    {
	/**
	 * First we create a linked list with duplicated nodes in it.
	 * Let's make it fancy.
	 */
	for ( int i = 0 ; i < 1000 ; ++i )
	{
	    if ( i%2 == 0 )
	    {
		testList.addLast(new SNode<Integer>(1));
	    }
	    else
	    {
		testList.addLast(new SNode<Integer>(2));
	    }
	}
	
	Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	SNode<Integer> cursor = null;
	SNode<Integer> prev = cursor;
	try
	{
	    cursor = testList.getHead();
	} 
	catch (LinkedListEmptyException e)
	{
	    fail();
	}
	while ( cursor != null )
	{
	    if (!hashMap.containsKey(cursor.getElement()))
	    {
		hashMap.put(cursor.getElement(),null);
	    }
	    else
	    {
		SNode<Integer> next = cursor.getNext();
		prev.setNext(next);
		
	    }
	    prev = cursor;	
	    cursor = cursor.getNext();
	}	
	assertSame(testList.getSize(),500);
    }
    
    /**
     * Implement a method to find the n-th last element in a singly linked list.
     */
    @Test
    public void findNthLastElement()
    {
	fail();
	/**
	 * Let's create the list.
	 */
	for ( int i = 1 ; i < 11 ; ++i)
	{
	    testList.addLast(new SNode<Integer>(i));
	}
	/**
	 * Now lets get the Nth last element.
	 */
    }


    /**
     * Implement a method to remove a node in the middle of singly linked list given the node is the only
     * node you have access to.
     */
    @Test
    public void removeNodeFromMiddle()
    {
	fail();
    }
    
    /**
     * Implement a method that will take a singly linked list and a number and will return true if two nodes 
     * in the list are added.
     */
    @Test
    public void detectIfTwoElementsAddUp()
    {
	fail();
    }
    
    /**
     * Implement a method to merge to sorted singly linked lists.
     */
    @Test
    public void mergeSortedLists()
    {
	fail();
    }
    
    /**
     * Reverse a singly linked list.
     */
    @Test
    public void reverseList()
    {
	fail();
    }
    
    /**
     * Select a random node from a linked list.
     */
    @Test
    public void selectRandom()
    {
	fail();
    }
}
