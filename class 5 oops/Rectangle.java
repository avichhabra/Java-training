class Rectangle {
  int length;
  int breadth;
  
  void setLength(int x){
  length = x;
  }
  
   void setBreadth(int y){
  breadth = y;
  }
  
 void calculateArea(){
 int area = length*breadth;
 System.out.println(area);
 }
  
public static void main(String[] args){

Rectangle r = new Rectangle();
r.setLength(10);
r.setBreadth(20);
r.calculateArea();

}

  
}