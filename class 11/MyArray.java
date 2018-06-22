class MyArray {
	public static void main(String[] args) throws Exception {
	int size = 10;
    int[] arr = {1,2,3,4,5,6,7,8,9,0};
    try {
		arr[size+1] = 12;
	}	
	catch(ArrayIndexOutOfBoundsException ae) {
		int old_size = 10;
		size=(int)(arr.length*1.5f);
		int[] newArray = new int[size];
		System.arraycopy(arr,0,newArray,0,arr.length);
		arr=newArray;
		newArray = null;
		arr[old_size] = 15;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
  }
}