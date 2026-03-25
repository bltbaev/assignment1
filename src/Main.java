import java.util.Scanner;

public class Main{
    // Task 1
    public static void task1(int n ) {
        if (n<10){
            System.out.println(n);
            return;
        }
        task1(n/10);
        System.out.println(n%10);
    }

    //Task 2
    public static int task2(int n,Scanner scanner){
        if(n==0)return 0;
        return scanner.nextInt()+task2(n-1,scanner);
    }

    //Task 3
    public static boolean task3(int n,int a){
        if(n<=2) return true;
        if(n%a==0) return false;
        if(a*a>n)return true;
        return task3(n,a+1);
    }

    //Task 4
    public static int task4(int n){
        if(n==1)return 1;
        return n*task4(n-1);
    }

    //Task 5
    public static int task5(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return task5(n-1)+task5(n-2);
    }

    //Task 6
    public static int task6(int a,int b){
        if(b==0)return 1;
        return a*task6(a,b-1);
    }

    //Task 7
    public static void task7(int n,Scanner scanner){
        if(n==0)return;
        int a= scanner.nextInt();
        task7(n-1,scanner);
        System.out.print(a+" ");
    }

    //Task 8
    public static boolean task8(String s,int index){
        if(index==s.length())return true;
        if(!Character.isDigit(s.charAt(index)))return false;
        return task8(s,index+1);
    }

    //Task 9
    public static int task9(String s){
        if(s.equals(""))return 0;
        return 1+ task9(s.substring((1)));
    }

    //Task 10
    public static int task10(int a,int b){
        if(b==0)return a;
        return task10(b,a%b);
    }





    public static void main(String[] args){
          Scanner scanner =new Scanner(System.in);
//
//        //Task 1
//        System.out.println("|Task 1|");
//        System.out.print("Enter the number:");
//        int num= scanner.nextInt();
//        task1(num);
//
//        //Task 2
//        System.out.println("|Task 2|");
//        System.out.print("Enter the number:");
//        int n= scanner.nextInt();
//        int sum=task2(n,scanner);
//        System.out.println("Result:"+(double)sum/n);
//
//        //Task 3
//        System.out.println("|Task 3|");
//        System.out.print("Enter the number that you want check:");
//        int a= scanner.nextInt();
//        if(task3(a,2)){
//            System.out.println("Prime");
//        }
//        else{
//            System.out.println("Composite");
//        }
//
//        //Task 4
//        System.out.println("|Task 4|");
//        System.out.print("Enter the numb:");
//        int b= scanner.nextInt();
//        System.out.println("Factorial:"+task4(b));

//        //Task 5
//        System.out.println("|Task 5|");
//        System.out.print("Enter the numb:");
//        int ab= scanner.nextInt();
//        System.out.println(task5(ab));
//
//        //Task 6
//        System.out.println("|Task 6|");
//        System.out.print("Enter the numb:");
//        int n= scanner.nextInt();
//        System.out.print("Enter the power:");
//        int p=scanner.nextInt();
//        System.out.println("Result:"+task6(n,p));

        //Task 7
//        System.out.println("|Task 7|");
//        System.out.print("Enter the numb:");
//        int k= scanner.nextInt();
//        task7(k,scanner);
//        System.out.println();

//        //Task 8
//        System.out.println("|Task 8|");
//        System.out.print("Enter the string:");
//        String s= scanner.next();
//        if(task8(s,0)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//
//        //Task 9
//        System.out.println("|Task 9|");
//        System.out.print("Enter the string:");
//        String d= scanner.next();
//        System.out.println(task9(d));

        //Task 10
        System.out.println("|Task 10|");
        System.out.print("Enter the numb1:");
        int numb1= scanner.nextInt();
        System.out.print("Enter the numb2:");
        int numb2= scanner.nextInt();
        System.out.println("Gcd is:"+task10(numb1,numb2));

        scanner.close();
    }

}
