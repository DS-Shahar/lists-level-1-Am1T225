package niva;

	import java.util.*;
	public class listslvl1 {
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
		public static Node exc6(int x,Node<Integer>abc) {
			Node<Integer>first=new Node<>(0);
			first.setNext(abc);
			boolean bool=false;
			while(abc.hasNext()&&bool==false) {
				if(abc.getNext().getValue()==x) {
					abc.setNext(abc.getNext().getNext());
					bool=true;}
				else
					abc.getNext();
				}
			return(first.getNext());
			}
		
		public static Node exc7(int x,Node<Integer>abc) {
			Node<Integer>first=new Node<>(0,abc);
			for(int i=0;i<x;i++) {
				if(i+1<x) {
					abc.setNext(abc.getNext().getNext());
				}
				else
					abc=abc.getNext();	
			}
			return first.getNext();
			}
		public static boolean exc8(Node<Integer>L1,Node<Integer>L2) {
			boolean bool=true;
			while(L1.hasNext()) {
				if(exc5(L1.getValue(),L2)==true) {
					bool=true;
					L1=L1.getNext();}
				else {
					bool=false;
				L1=L1.getNext();}
				}
			return bool;
			}
		public static void exc9(Node<Integer>L1,Node<Integer>L2) {
			while(L1.hasNext()) {
				if(exc5(L1.getValue(),L2)==true) {
					System.out.println(L1.getValue());
					L1=L1.getNext();}
				else {
				L1=L1.getNext();}
				}
		}
		public static Node exc10(Node<Integer>L1,Node<Integer>L2) {
			Node<Integer> p = new Node<>(0);
			Node<Integer>first=new Node<>(0,p);
			while(L1.hasNext()) {
				if(exc5(L1.getValue(),L2)==true) {
					Node<Integer> x = new Node<>(L1.getValue());
					p.setNext(x);
					p.getNext();
					L1=L1.getNext();}
				else {
				L1=L1.getNext();}
				}
			return first.getNext();
		}
		public static Node exc11(Node<Integer>L1,Node<Integer>L2) {
			Node<Integer>first=new Node<>(0,L1);
			while(L1.hasNext()) {
				if(exc5(L1.getNext().getValue(),L2)) {
					L1.setNext(L1.getNext().getNext());}
				else
					L1=L1.getNext();
				
					
				}
			return first.getNext();
			}
		}
