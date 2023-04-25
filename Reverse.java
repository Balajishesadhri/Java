class Reverse{
public static void main(String[]args){


Reverse r= new Reverse();
//r.print_reverse(153);
//r.sum_of_digits(153);
r.count_of_digits(153);

}
void print_reverse(int no){
int reverse =0;
while(no>0){
int rem =no%10;
 reverse =(reverse*10)+rem;
  no=no/10;
}
System.out.println(reverse);

}
void sum_of_digits(int no){
int sum=0;
while(no>0){

int rem =no%10;
sum=sum+rem;
  no=no/10;

}

System.out.println(sum);

}
void count_of_digits(int no){

int count=0;
while(no>){
int rem =no%10;
no=no/10;
count++;
}
System.out.println(count);
}






}
