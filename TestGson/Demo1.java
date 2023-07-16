package TestGson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setName("Mobin Arshad");
		emp1.setId(123);
		emp1.setSalary("4321");
		emp1.setRating(10);
		
		//System.out.println(emp1);
        //Gson gson = new Gson();
       // String json = gson.toJson(emp1);
        //System.out.println(json);
        //emp1.setName("Mobin Khan");
        //Employee em = gson.fromJson(gson.toJson(emp1), Employee.class);
		 // Creating a GSON builder
        GsonBuilder gsonBuilder = new GsonBuilder();
 
        // Creating a GSON from GSON builder
        Gson gson = gsonBuilder.create();
 
        // Creating an employee gson using pretty printing
        String jsonString = "{\"name\":\"Mahesh\", \"id\":21, \"rating\":10}";
        Employee emp2 = new Employee();
        emp2 = gson.fromJson(jsonString, Employee.class);
        System.out.println(emp2);
	}

}
