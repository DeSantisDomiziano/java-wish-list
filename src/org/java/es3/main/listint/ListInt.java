package org.java.es3.main.listint;

public class ListInt {
	
	private int[] list;
	private int counter = 0;
	
	public ListInt(int[] list) {
		setList(list);
	}
	
	public ListInt(){}
	
	public int[] getList() {
		return list;
	}

	public int getCounter() {
		return counter;
	}

	public void setList(int[] list) {
		this.list = list;
	}
	
	public int getElementoSuccessivo() throws Exception  {
		if(list.length == 0 || counter >= list.length) {
			counter = 0;
			throw new Exception("non ci sono ulteriori elementi il contatore ripartirà dal primo elemento");
		}
			
		return list[counter++];
	}
	
	public boolean hasAncoraElementi() {
		return counter < list.length && counter != list.length;
	}
	
	public void addElemento(int newInt) {
		
		int[] newList = new int[list.length + 1];
		
		System.arraycopy(list, 0, newList, 0, list.length);
		newList[list.length] = newInt;
		
		list = newList;
	}

}
