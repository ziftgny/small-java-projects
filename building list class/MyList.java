package project1;

import java.util.Arrays;

public class MyList<T> {
		private Object[] array;
		private int capacity;
		
		MyList(int capacity){
			this.capacity=capacity;	
			array=new Object[capacity];
			}
		
		MyList(){
			this.capacity=10;
			array=new Object[10];
			}
		
		
		
		public int size() {
			int counter =0;
			for(Object i : array) {
				if (i!=null) {
					counter++;
				}
		}
			return counter;
		}
		
		
		

		public int getCapacity() {
			return capacity;
		}
		
		
		
		public void increaseCapacity() {
			capacity = capacity * 2;
            Object[] container = new Object[capacity];
            System.arraycopy(array, 0, container, 0, size());
            array = container;
		}
		
		
		public void add(T value) {
			if(size()==getCapacity())
				increaseCapacity();
			array[this.size()]=value;
		}
		
		
		
		
		@SuppressWarnings("unchecked")
		public T[] toArray() {
			return (T[]) array;
		}
		
		
		
		
		public Object get(int index) {
			if (index>=0 && index<=(this.size()-1))
			return array[index];	
			else
			return null;
		}
		
		
		public String toString() {
			String text = "";
			int counter =0;
			for (Object i : array) {
				if(i==null)
					break;
				text = text + i+",";
				counter++;
			}
			if (counter>0) {
			StringBuilder sb = new StringBuilder(text);
	        sb.deleteCharAt(text.length() - 1);
	        return "["+sb.toString()+"]";
			}
			else
				return "[]";
			
			
		}
		
		
		
		public Object remove(int index) {
			if (!(index>=0 && index<=this.size()))
				return null;
			Object[] container = new Object[capacity];
			container = array;
            System.arraycopy(array, index+1, container, index, size()-index);
            array = container;
            return true;
		}
		
		
		public Object set(int index,T data) {
			if (!(index>=0 && index<=this.size()))
				return null;
			array[index]=data;
			return true;
		}
		
		public int indexOf(T object) {
			int counter=0;
			for(Object i : array) {
				if(i==object)
					return counter;
				counter++;
			}
			return -1;
		}
		public int lastIndexOf(T object) {
			for (int i = (this.capacity-1);i>=0;i--) {
				if(array[i]==object) {
					return i;
				}
			
		}
			return -1;
		}
		public boolean isEmpty() {
			for (Object i : array) {
				if(i!=null)
					return false;
			}
			
			return true;
		}
		public void clear() {
			for (int i = 0;i<this.capacity;i++) {
				array[i]=null;
			}
		}
		@SuppressWarnings("unchecked")
		public MyList<T> subList(int start,int finish) {	
		        MyList<T> subList = new MyList<>(finish - start + 1);
		        for (int i = start; i <= finish; i++) {
		            subList.add((T) array[i]);
		        }

		        return subList;
            
		}
		public boolean contains(T data) {
			for(Object i : array) {
				if(i==data)
					return true;
			}
			return false;
		}
}
