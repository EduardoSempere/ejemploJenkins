public class Interview {
    
    
    public static void main(String[] args) {
        System.out.println(solution(123));
    }
    // Select salry from employe 
    
    // Select MAX(salary) from employee group by emplpoyee.depart

    // select * from employe Inner Join employee.id ON deparment.idEmployee 



    //int i=234;16:25
// 2*3*4-(2+3+4)= 15

    public static int solution(int num) {

        String strNum = String.valueOf(num);
        String[] arr = strNum.split("");
        int mul = 1;
        int sum = 0;
       
        for (int i = 0; i < arr.length; i++) {
            mul = mul * Integer.parseInt(arr[i]);
            sum = sum + Integer.parseInt(arr[i]);
        }



        return mul - sum;
        
    }
}
