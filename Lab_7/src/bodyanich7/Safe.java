package bodyanich7;

import java.util.ArrayList;


public class Safe<T extends SafeInfo> {
	private ArrayList<T> arr;

    public Safe() {
        arr = new ArrayList<T>();
    }
    
//find minimal material weight
    public T findMinWeight() {
        if (!arr.isEmpty()) {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(min) < 0)
                    min = arr.get(i);
            }
            return min;
        }
        return null;
    }
     
    public void WriteData(T data) {
        arr.add(data);
        System.out.println("Element added:");
        data.print();
    }
    
    public int Getweight(int a,int b) {
    	return arr.get(a).Weight() + arr.get(b).Weight();
    }

    public void DeleteData(int x) {
        arr.remove(x);
    }
}
