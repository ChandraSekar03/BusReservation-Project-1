package Busproject;

public class Bus {
       private int busNo;
       private boolean Ac;
       private int capacity;
        
        Bus(int no,boolean ac,int cap)
        {
        	 this.busNo=no;
        	 this.Ac=ac;
        	 this.capacity=cap;
        	 
        }
        public int getbusNo()
        {
        	return busNo; 
        }
        public int getcapacity()//accessors
        {
        	return capacity;
        }
        public void setcapacity(int cap)//mutators
        {
        	capacity=cap;
        }
        public boolean isAc()
        {
        	return Ac;
        }
        public void setAc(boolean val)
        {
        	ac=val;
        }
        public void displayBusInfo()
        {
        	System.out.println("Bus No: "+busNo+ " Ac: "+ Ac+ " Total capacity: "+capacity );
        	
        }
        
}
