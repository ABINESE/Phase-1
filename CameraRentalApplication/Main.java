package CameraRentalApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class Main {
	private static List<CameraInfo> cameraList = new ArrayList<>();
    private static double walletBalance = 2000;
    private static List<CameraInfo> MycameraList = new ArrayList<>();
    public static void print(List<CameraInfo> cameraList,boolean isFilter, boolean isAvailable)
    {
    	System.out.println("=========================================================================================================");
    	System.out.println("CAMERA ID\tBRAND \t \t MODEL \t\t PRICE(PER DAY)\t STATUS");
    	System.out.println("=========================================================================================================");
    	if(!isFilter) {
	    	for(CameraInfo caminfo : cameraList) {
	    		System.out.println(" "+caminfo.getCameraId()+"\t\t"+caminfo.getCamerBrand()+"\t\t"+caminfo.getCameraModel()+"\t\t"+caminfo.getRentPerday()+"\t\t"+(caminfo.isIsrented()?"Rented":"Available"));
	    	}
    	}
    	else {
	    	for(CameraInfo caminfo : cameraList) {
	    		if(!caminfo.isIsrented() == isAvailable)
	    			System.out.println(" "+caminfo.getCameraId()+"\t\t"+caminfo.getCamerBrand()+"\t\t"+caminfo.getCameraModel()+"\t\t"+caminfo.getRentPerday()+"\t\t"+(caminfo.isIsrented()?"Rented":"Available"));
	    	}
    	}
    	System.out.println("=========================================================================================================");
    }
    public static void removeCamera(int cameraId) {
    	
        Iterator<CameraInfo> iterator = cameraList.iterator();
        while (iterator.hasNext()) {
            CameraInfo camera = iterator.next();
            if (camera.getCameraId() == cameraId) {
                iterator.remove();
                System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST");
                return; 
            }
        }
        
       
    }
    public static CameraInfo getCameraById(int id) {
    	for(CameraInfo caminfo : cameraList) {
    		if(caminfo.getCameraId() == id) {
    			caminfo.setIsrented(true);
    			return caminfo;
    		}
    			
    	}
        return null;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	cameraList.add(new CameraInfo("Sumsung","DS123",500));
	cameraList.add(new CameraInfo("Sony", "HD214", 500));
	cameraList.add(new CameraInfo("Pana", "XC", 500));
	cameraList.add(new CameraInfo("Canon", "XLR", 500));
	cameraList.add(new CameraInfo("Fujitsu", "J5", 500));
	cameraList.add(new CameraInfo("Sony", "HD226", 500));
	cameraList.add(new CameraInfo("LG", "L123", 500));
	cameraList.add(new CameraInfo("Canon", "XPL", 500));
	cameraList.add(new CameraInfo("Chroma", "CT", 500));
	cameraList.add(new CameraInfo("Canon", "Digital", 123));
	cameraList.add(new CameraInfo("NIKON", "D7500", 500));
	cameraList.add(new CameraInfo("Sony", "DSLR12", 200));
	cameraList.add(new CameraInfo("SONY", "S1234", 123));
	cameraList.add(new CameraInfo("canon", "5050", 2500));
	cameraList.add(new CameraInfo("nikon", "2030", 500));
	cameraList.add(new CameraInfo("Canon", "C123", 200));
	cameraList.add(new CameraInfo("Some", "Another", 100));
	cameraList.add(new CameraInfo("Samsung", "SM123", 200));
	cameraList.add(new CameraInfo("Pentex", "PEN-234", 300));
	cameraList.add(new CameraInfo("sonic", "LUMIX", 500));
	cameraList.add(new CameraInfo("FUJI", "H2S10", 400));
     System.out.println("+----------------------L123--------+");
     System.out.println("| WELCOME TO CAMERA RENTAL APP|");
     System.out.println("+------------------------------+");
     Scanner scanner=new Scanner(System.in);
     System.out.println("PLEASE LOGIN TO CONTINUE");
     System.out.println("USERNAME - ");
     String username=scanner.next();
     System.out.println("PASSWORD - ");
     String password=scanner.next();
     
     Authentication authenticate=new Authentication(username, password);
     if(authenticate.login(username, password))
     {
    	 int input = 0;
    	 while(input != 5) {
    	 System.out.println("1. MY CAMERA");
    	 System.out.println("2. RENT A CAMERA");
    	 System.out.println("3. VIEW ALL CAMERAS");
    	 System.out.println("4. MY WALLET ");
    	 System.out.println("5. EXIT");
    	 input=scanner.nextInt();
    	 int input1 = 0;
    	 
   	switch(input) {
    	case 1:
    		while(input1 != 4) {
    		System.out.println("1. ADD");
    		System.out.println("2. REMOVE");
    		System.out.println("3. VIEW MY CAMERA");
    		System.out.println("4. GO TO PREVIOUS MENU");
    		input1=scanner.nextInt();
    		switch(input1) {
    		case 1:
    			System.out.println("ENTER THE CAMERA BRAND");
    			String cameraBrand=scanner.next();
    			System.out.println("ENTER THE MODEL");
    			String cameraModel=scanner.next();
    			System.out.println("ENTER THE PER DAY PRICE(INR)");
    			double perdayPrice=scanner.nextDouble();
    			cameraList.add(new CameraInfo(cameraBrand, cameraModel, perdayPrice));
    	        System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST");
    	    	System.out.println();
    			break;
    		case 2:
    			print(cameraList,false, false);
	    		System.out.println("ENTER THE CAMERA ID TO REMOVE");
	    		removeCamera(scanner.nextInt());
	    		System.out.println();
	    		break;
    		
    		case 3:
    			System.out.println("THE FOLLOWING IS THE LIST OF MY CAMERA ");
    			print(MycameraList,false,false);
    			System.out.println();
    			
    		    break;
    		}
    		}
    		System.out.println();
    		break;
    		
    	case 2:
    		System.out.println("FOLOWING IS THE LIST OF AVAILABLE CAMERAS");
    		print(cameraList,true,true);
    		System.out.println("ENTER THE CAMERA ID YOU WANT TO  RENT");
    		CameraInfo caminfo=getCameraById(scanner.nextInt());
    		
    		if(walletBalance>=caminfo.getRentPerday()){
    		walletBalance-=caminfo.getRentPerday();
    		MycameraList.add(caminfo);
    	    System.out.println("YOUR TRANSACTION FOR CAMERA "+caminfo.getCamerBrand()+" "+caminfo.getCameraModel()+" WITH RENT OF "+caminfo.getRentPerday()+" HAS SUCCESSFULLY COMPLETED");
    		System.out.println();
    		}
    		else{
    			System.out.println("ERROR : TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE. PLEASE DEPOSIT AMOUNT TO YOUR WALLET");
    			System.out.println();
    		}
    		break;
    	case 3:
    		print(cameraList,false,false);
    		System.out.println();
    		break;
    	case 4:
    		System.out.println("YOUR CURRENT BALANCE IS - INR"+walletBalance);
    		System.out.println("DO YOU WANT DEPOSIT TEH AMMOUT TO YOUR WALLET?(1.YES/2.NO)");
    		if(scanner.nextInt()==1){
    			System.out.println("ENTER THE AMOUNT (INT)");
    			double amount=scanner.nextInt();
    			walletBalance+=amount;
    			System.out.println("YOUR WALLET BALANCE  UPDATED SUCCESSFULLY. YOUR CURRENT BALANCE - INR "+walletBalance);
    			
    			
    		}
    		System.out.println();
    		break;
   	}
    	 }
    	 	
    	 return ;
     }
     else{
    	 System.out.println("INVALID USERNAME AND PASSWORD");
    	 return;
     }
	}

}
