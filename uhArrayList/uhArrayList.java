package uhArrayList;

public class uhArrayList {
		private static final int DEFAULT_CAP = 4;
		Object[]	arr;
		int			currentSize;
		
		public uhArrayList() {
			arr = new Object [DEFAULT_CAP];
			currentSize = 0;
		}
		
		public uhArrayList(int initSize) {
			arr = new Object [initSize];
			currentSize = 0;
		}
		
		public int capacity() {
			return arr.length;
		}
		
		public int size() {
			return currentSize;
		}
		
		public void add(Object item) {
			if (currentSize == capacity()) {
				resize();
			}
			
			arr[currentSize] = item;
			currentSize++;
		}
		
		public void add(Object item, int index) {
			int	last = currentSize - 1;

	                if (index < 0 || index >= currentSize) {
	                        return ;
	                }
			
			if (currentSize == capacity()) {
				resize();
			}
			
			while (last >= index) {
				arr[last + 1] = arr[last];
				last--;
			}

	                arr[index] = item;
	                currentSize++;
		}
		
		public Object get(int index) {
			if (index >= 0 && index < currentSize) {
				return arr[index];
			}
			else {
				return null;
			}
		}
		
		public void remove(int index) {
			if (index >= 0 && index < currentSize) {
				for (; index < currentSize; index++) {
					arr[index] = arr[index + 1];
				}
				
				currentSize--;
			}
		}
		
		private void resize() {
			Object[]	tmp = new Object [arr.length + DEFAULT_CAP];
			
			for (int i = 0; i < arr.length; i++) {
				tmp[i] = arr[i];
			}
			
			arr = tmp;
		}
}
