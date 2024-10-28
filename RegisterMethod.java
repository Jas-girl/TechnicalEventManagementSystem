package project;

public class RegisterMethod {
	Register r;
	RegisterMethod(Register r) {
		this.r = r;
	}

	boolean flag = false;

	void filter(Register arr[], String name) {
		for (Register register : arr) {
			if(register.getEvent().equalsIgnoreCase(name)) {
				System.out.println(register.toString());
				flag=true;
			}

		}
		if(!flag) {
			System.out.println("not found");
		}

		
	}
	void filterName(Register arr[],String name) {
		for (Register register : arr) {
			if(register.getName().equalsIgnoreCase(name)) {
				
				System.out.println(register.toString());
				flag=true;
			}
			

		}
		if(!flag) {
			System.out.println("not found");
		}
		
	}
	void count(Register arr[],String event) {
		int value=0;
		for (Register register : arr) {
			if(register.getEvent().equalsIgnoreCase(event)) {
				value++;
			}
		}
		System.out.println("No of students in "+event+":"+value);
		
	}
	
	
}
