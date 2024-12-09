package abc;

import java.util.*;
public class rrr {

	public static Scanner reader=new Scanner(System.in);
	public static Node exe(int x, int y,int n) {
		Node <Integer> first=new Node<>((int)(Math.random()*(y-x+1))+x);
		Node <Integer>current=first;
		Node<Integer>next;
		
		for(int i=0;i<n;i++) {
			next=new Node<>((int)(Math.random()*(y-x+1))+x);
			current.setNext(next);
			current=next;
		}
		return first;
			
	}
	
	public static Node exe1(int[]a) {
		Node<Integer>first=new Node<>(0);
		Node <Integer>current=first;
		Node<Integer>next;
		for(int i=0;i<a.length;i++) {
			next=new Node<>(a[i]);
			current.setNext(next);
			current=next;
		}
		return first.getNext();
		}
	
	
	public static void exe2_1(Node<Integer>list) {
		Node<Integer>curr=list;
		while(curr!=null) {
			System.out.println(curr.getValue());
			curr=curr.getNext();
		}
	}
	public static void exe2_2(Node<Integer>list) {
		Node<Integer>curr=list;
		if(curr==null) {
			return;
		}
		System.out.println(curr.getValue());
		exe2_2(curr.getNext());
	}
	
	public static void exe2_3(Node<Integer>list) {
		if(list==null) {
			System.out.println(list.getValue());
			return;
		}
		exe2_2(list.getNext());
		System.out.println(list.getValue());
	}
	public static Node exc3() {
		Node<Integer>first=new Node<>(0);
		Node <Integer>current=first;
		System.out.println("enter num");
		int n=reader.nextInt();
		Node<Integer>next;
		while(n!=-1) {
			next=new Node<>(n);
			current.setNext(next);
			current=next;
			System.out.println("enter num");
			n=reader.nextInt();
		}
		System.out.println(first.getNext());
		return first.getNext();
	}
	public static Node exc4(int[]a) {
		Node<Integer>first=new Node<>(0);
		Node <Integer>current=first;
		Node<Integer>next;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				next=new Node<>(a[i]);
				current.setNext(next);
				current=next;
			}
		}
		return first.getNext();
	}
	public static boolean exc5(int n,Node<Integer>abc) {
		int num=abc.getValue();
		while(abc!=null) {
			num=abc.getValue();
			if(n==num)
				return true;
			abc=abc.getNext();
		}
		return false;
	}
